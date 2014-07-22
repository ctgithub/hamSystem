package com.uestc.hams.view.action;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.uestc.hams.entity.DistrictIns;
import com.uestc.hams.service.DistrictInsService;
import com.uestc.hams.serviceImpl.DistrictInsServiceImpl;

/**
 * 地区医疗机构类
 * @author 吴静南
 *
 */
@Controller
@Scope("prototype")
public class DistrictInsAction extends ActionSupport implements ModelDriven<DistrictIns>{

	//？？这个地方的问题
	private DistrictIns districtIns=new DistrictIns();
	private List<DistrictIns> districtInses;
	private Long parentId;
	@Resource
	private DistrictInsService districtInsService;
	
	public DistrictIns getModel() {
		return districtIns;
	}
	
	
	/** 列表 */
	public String list() throws Exception {
		districtInses=districtInsService.findAll();
		return "list"; 
		}

	/** 删除 */
	public String delete() throws Exception {
		return "toList";
		}

	/** 添加页面 */
	public String addUI() throws Exception {
		return "saveUI";
		}

	/** 添加 */
	public String add() throws Exception { 
		return "toList"; 
		}

	/** 修改页面 */
	public String editUI() throws Exception {
		return "saveUI";
		}

	/** 修改 */
	public String edit() throws Exception {
		return "toList"; 
		}


	public List<DistrictIns> getDistrictInses() {
		return districtInses;
	}


	public void setDistrictInses(List<DistrictIns> districtInses) {
		this.districtInses = districtInses;
	}

	
}
