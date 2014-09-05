package com.uestc.hams.view.action;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletRequest;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionContext;
import com.uestc.hams.base.BaseAction;
import com.uestc.hams.entity.DistrictIns;
import com.uestc.hams.entity.ResidentArchive;
import com.uestc.hams.entity.Role;
import com.uestc.hams.entity.User;
@Controller
@Scope("prototype")
public class ResidentArchiveAction extends BaseAction<ResidentArchive>{
	
	private Long doctorId;
	private Long recorderId;
	private String rsaId;
	private String txBlood1;
	private String shoushuText1;
	private String dateT;
	/** 列表 */
	//在列表页面应该多个选择按钮
	public String list() throws Exception {
	
		//得到数据库中数据
		List<ResidentArchive> residentArchiveList =residentArchiveService.findAll();
		//写入回显
		ActionContext.getContext().put("residentArchiveList", residentArchiveList);
		return "list";
	}

	/** 删除 */
	public String delete() throws Exception {
		
		//userService.delete(id)
		//通过档案id删除用户
		ResidentArchive rs=residentArchiveService.getById(model.getId());
		if(rs!=null){
			userService.delete(rs.getResidentId());
			//residentArchiveService.delete(model.getId());
		}
		return "toList";
	}

	/** 添加页面 */
	public String addUI() throws Exception {
		//准备责任医生
		List<User> doctorList=userService.findByRoleDoctor();
		ActionContext.getContext().put("doctorList", doctorList);
		//准备记录员
		List<User> recorderList=userService.findByRoleRecorder();
		ActionContext.getContext().put("recorderList",recorderList);
		//查询所有  乡镇街道地址bug
		List<DistrictIns> districtInsList= districtInsService.findAll();
		ActionContext.getContext().put("districtInsList", districtInsList);
		return "saveUI";
	}

	/** 添加 */
	public String add() throws Exception {
		
		
		System.out.println("========================"+txBlood1);
		
		//医生和记录员需要遍历出来
		User doctor=userService.getById(doctorId);
		if(doctor!=null){
			model.setDoctor(doctor);
		}
		User recorder= userService.getById(recorderId);
		if(recorder!=null){
			model.setRecorder(recorder);
		}
		
		//年龄设置（默认的0该怎么处置or设置错误消息）
		if(model.getRsBornDate()!=null){
			Date date = new Date();
			/*SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd");
			sf.format(date);*/
			Calendar calendarDate=Calendar.getInstance();
			Calendar calendarBornDate=Calendar.getInstance();
			calendarDate.setTime(date);
			calendarBornDate.setTime(model.getRsBornDate());
			Long ageTime=calendarDate.getTimeInMillis()-calendarBornDate.getTimeInMillis();
			model.setAge((int) (ageTime/(1000*60*60*24*356L)));
		}
		
		//能否得到新增内容
		//System.out.println(shoushuText1);
		System.out.println("12312312"+txBlood1);
		//String abc=(String) ServletActionContext.getRequest()
		//System.out.println(ServletActionContext.getRequest().getAttribute(shoushuText1));
		
		//保存，能到其id
		residentArchiveService.save(model);
		
		//2、得到其地区编号拼接
			StringBuffer rsArcId=new StringBuffer();
			//根据建档单位设置id
			if(model.getArchiveDisId()!=0){
				DistrictIns dis=districtInsService.getById(model.getArchiveDisId());
				//一级单位
				if(dis!=null){
					//二级单位
					if(dis.getParent()!=null){
						rsArcId.append(dis.getParent().getDistrictId());
						rsArcId.append(dis.getDistrictId());
						System.out.println(rsArcId);
					}else{
						//只有一级单位
						rsArcId.append(dis.getDistrictId());
						rsArcId.append("000000");
					}
				}
			}else {
				//没有所有档案单位
				rsArcId.append("000000000000");
			}
			
		//3、设置位数 例如100001
			if(model.getId()<10000){
				rsArcId.append(model.getId()+10000);
			}else
				rsArcId.append(model.getId());
		//4、写入模型中
		rsaId=new String(rsArcId).trim();
		model.setRsArchiveId(rsaId);
		
		//设置user中的档案
		User user = new User();
		if(model.getName()!=null){
			user.setName(model.getName());
		}
		if(model.getPhoneNumber()!=null){
			user.setPhoneNumber(model.getPhoneNumber());
		}
		if(model.getGender()!=null){
			user.setGender(model.getGender());
		}
			//登录
		Set<Role> roles=new HashSet<Role>();
		//roles.add()
		user.setRoles(roles);
		user.setLoginName(rsaId);
		String md5Digest = DigestUtils.md5Hex("123456");
		user.setPassword(md5Digest);
		//需同时保存用户和档案
		user.setResidentArchive(model);
		userService.save(user);
			//是否需要判断
		model.setResidentId(user.getId());
		//跟新
		residentArchiveService.update(model);
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		ResidentArchive ra=residentArchiveService.getById(model.getId());
		//准备医生列表
		List<User> doctorList=userService.findByRoleDoctor();
		ActionContext.getContext().put("doctorList", doctorList);
		//准备记录员列表
		List<User> recorderList=userService.findByRoleRecorder();
		ActionContext.getContext().put("recorderList",recorderList);
		//查询所有乡镇街道地址
		List<DistrictIns> districtInsList= districtInsService.findAll();
		ActionContext.getContext().put("districtInsList", districtInsList);
		//判断
		if(ra.getDoctor()!=null){
			doctorId=ra.getDoctor().getId();
		}
		if(ra.getRecorder()!=null){
			recorderId=ra.getRecorder().getId();
		}
		
		ActionContext.getContext().getValueStack().push(ra);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {
		//认为档案修改信息与用户信息修改无关
		/*ResidentArchive rsAchive= residentArchiveService.getById(model.getId());*/
		/*if(rs!=null){
			//更改用户的地方的？
			User user=userService.findByRsArchiveId(model.getId());
			user.setResidentArchive(rs);
			userService.update(user);
		}*/
		if(doctorId!=null){
			model.setDoctor(userService.getById(doctorId));
		}
		if(recorderId!=null){
			model.setRecorder(userService.getById(recorderId));
		}
		if(model.getRsBornDate()!=null){
			Date date = new Date();
			Calendar calendarDate=Calendar.getInstance();
			Calendar calendarBornDate=Calendar.getInstance();
			calendarDate.setTime(date);
			calendarBornDate.setTime(model.getRsBornDate());
			Long ageTime=calendarDate.getTimeInMillis()-calendarBornDate.getTimeInMillis();
			model.setAge((int) (ageTime/(1000*60*60*24*356L)));
		}
		residentArchiveService.update(model);
		return "toList";
	}
	
	public String test() throws Exception{
		System.out.println("进入这个方法test" );
		System.out.println(dateT);
		shoushuText1="123";
		return "success";
	}
	
	
	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public Long getRecorderId() {
		return recorderId;
	}

	public void setRecorderId(Long recorderId) {
		this.recorderId = recorderId;
	}

	public String getTxBlood1() {
		return txBlood1;
	}

	public void setTxBlood1(String txBlood1) {
		this.txBlood1 = txBlood1;
	}

	public String getShoushuText1() {
		return shoushuText1;
	}

	public void setShoushuText1(String shoushuText1) {
		this.shoushuText1 = shoushuText1;
	}

	public String getDateT() {
		return dateT;
	}

	public void setDateT(String dateT) {
		this.dateT = dateT;
	}


	
	 
	
	
}
