package com.uestc.hams.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.uestc.hams.entity.ResidentArchive;
import com.uestc.hams.service.DistrictInsService;
import com.uestc.hams.service.IPhyExamService;
import com.uestc.hams.service.PrivilegeService;
import com.uestc.hams.service.ResidentArchiveService;
import com.uestc.hams.service.RoleService;
import com.uestc.hams.service.UserService;

public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>{

	//=======================所有service实例的声明================================
	@Resource
	protected DistrictInsService districtInsService;
	
	@Resource
	protected RoleService roleService;
	
	@Resource
	protected UserService userService;//service最终是在action中用，且为单例模式，但是事务是在实现类中开启
	
	@Resource
	protected PrivilegeService privilegeService;
	
	@Resource

	protected IPhyExamService phyExamService;
	
	@Resource
	protected ResidentArchiveService residentArchiveService;


	

	//====================modelDriven的支持========================
	protected T model;
	
	public BaseAction(){
		ParameterizedType pt=(ParameterizedType) this.getClass().getGenericSuperclass();
		Class<T> clazz=(Class<T>) pt.getActualTypeArguments()[0];
		try {
			this.model=clazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public T getModel() {
		//通过反射获得model的实例真实实例 newInstance
		return model;
	}

}
