package com.uestc.hams.util;

import java.util.HashSet;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.uestc.hams.entity.Privilege;
import com.uestc.hams.entity.Role;
import com.uestc.hams.entity.User;


@Component//交给容器管理，事务才起作用
public class Installer {

	@Resource
	private SessionFactory sessionFactory;
	
	
	@Transactional//这里需要事务
	public void install(){
		Session session = sessionFactory.getCurrentSession();
		//保存超级管理员用户
		User user= new User();
		user.setLoginName("admin");
		user.setName("超级管理员");
		user.setPassword(DigestUtils.md5Hex("admin"));
		session.save(user);
		//权限数据
		Privilege menu,menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8,menu9,menu10;
		Privilege menu20,menu21,menu22,menu23,menu24,menu25,menu26,menu27;
		//各自权限
		HashSet<Privilege>hamsDoctor=new HashSet<Privilege>();
		HashSet<Privilege> hamsRecorder=new HashSet<Privilege>();
		HashSet<Privilege> hamsDistricIns= new HashSet<Privilege>();
		
		//系统管理模块
		menu=new Privilege("系统管理",null, null);
		session.save(menu);
		//menu1=new Privilege("角色管理", "/hamSystem/role_list.action", menu);将工程和扩展名
		menu1=new Privilege("角色管理", "/role_list", menu);
		menu2=new Privilege("机构信息数据维护", "/districtIns_list", menu);
		menu3=new Privilege("用户管理", "/user_list", menu);
		//session.save(new Privilege("机构列表", "/districtIns_list", menu2));
		session.save(new Privilege("机构增加", "/districtIns_add", menu2));//因为在设置拦截器时是将UI去掉再进行考虑的
		session.save(new Privilege("机构修改", "/districtIns_edit", menu2));
		session.save(new Privilege("机构删除", "/districtIns_delete", menu2));
		
		session.save(new Privilege("用户增加", "/user_add", menu3));
		session.save(new Privilege("用户修改", "/user_edit", menu3));
		session.save(new Privilege("用户删除", "/user_delete", menu3));
		session.save(new Privilege("用户列表", "/user_list", menu3));
		session.save(new Privilege("初始化密码", "/user_initPassword", menu3));
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		
		//健康档案模块
		menu=new Privilege("健康档案",null,null);
		session.save(menu);
		
		menu1=new Privilege("机构个人档案","/archive_list",menu);
		hamsRecorder.add(menu1);
		hamsDoctor.add(menu1);
		hamsDistricIns.add(menu1);
		//session.save(new Privilege("机构列表", "/archive_list", menu2));
		session.save(new Privilege("个人档案添加", "/archive_add", menu1));
		session.save(new Privilege("个人档案修改", "/archive_edit", menu1));
		session.save(new Privilege("个人档案删除", "/archive_delete", menu1));
		
		menu2=new Privilege("机构家庭档案", "/family_list", menu);
		session.save(new Privilege("家庭档案增加", "/family_add ", menu2));
		session.save(new Privilege("家庭档案修改", "/family_edit", menu2));
		session.save(new Privilege("家庭档案删除", "/family_delete", menu2));
		session.save(new Privilege("家庭成员列表", "/family_info ", menu2));
		session.save(new Privilege("家庭成员增加", "/family_memberAdd", menu2));
		session.save(new Privilege("家庭成员删除", "/family_memberDelete", menu2));
		
		hamsRecorder.add(menu2);
		hamsDoctor.add(menu2);
		hamsDistricIns.add(menu2);
		
		menu3=new Privilege("医生责任档案", "/user_list", menu);
		hamsRecorder.add(menu3);
		hamsDoctor.add(menu3);
		hamsDistricIns.add(menu3);
		
		menu4=new Privilege("健康体检", "/phyExam_archiveList", menu);
		session.save(new Privilege("健康体检增加", "/phyExam_add", menu4));
		session.save(new Privilege("健康体检修改", "/phyExam_edit", menu4));
		session.save(new Privilege("健康体检删除", "/phyExam_delete", menu4));
		hamsDoctor.add(menu4);
		menu5=new Privilege("档案回收站", "/user_list", menu);
		menu6=new Privilege("工作提醒", "/districIns_list", menu);
		menu7=new Privilege("档案管理", "/user_list", menu);
		menu8=new Privilege("档案统计", "/user_list", menu);
		menu9=new Privilege("站内统计", "/user_list", menu);
		menu10=new Privilege("综合查询", "/user_list", menu);
		
		session.save(menu);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		session.save(menu4);
		session.save(menu5);
		session.save(menu6);
		session.save(menu7);
		session.save(menu8);
		session.save(menu9);
		session.save(menu10);
		
		menu1=new Privilege("死亡登记", "/user_list", menu7);
		menu2=new Privilege("迁入迁出管理", "/user_list", menu7);
		menu3=new Privilege("责任医生变更", "/user_list", menu7);
		menu4=new Privilege("档案管理", "/user_list", menu7);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		session.save(menu4);

	/*	session.save(new Privilege("角色增加", "/_add", menu1));//因为在设置拦截器时是将UI去掉再进行考虑的
		session.save(new Privilege("角色修改", "/_edit", menu1));
		session.save(new Privilege("角色删除", "/_delete", menu1));
		session.save(new Privilege("角色列表", "/_list", menu1));*/
		
		
		
		
		
		session.save(new Role("医生",hamsDoctor));
		session.save(new Role("记录员",hamsRecorder));
		session.save(new Role("机构管理员",hamsRecorder));
		

	}
	
	/**
	 *  这里添加额外功能
	 */
	public void addPrivilege(){
		
		
	}
	
	/**
	 * 这里不需要放在tomcat里自动执行，可以通过java命令来自动执行安装
	 * 这里为单独的程序
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Installer installer= (Installer) ac.getBean("installer");
		installer.install();
	}

}
