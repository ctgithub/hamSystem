package com.uestc.hams.view.action;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.uestc.hams.base.BaseAction;
import com.uestc.hams.entity.ResidentArchive;


@Controller
@Scope("prototype")
public class JsonAction  extends BaseAction<ResidentArchive> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2342343532L;

	private String message;
	
	private Long residentId;
	
	private ResidentArchive resident;
	
	
	public Long getResidentId() {
		return residentId;
	}



	public void setResidentId(Long residentId) {
		this.residentId = residentId;
	}



	public ResidentArchive getResident() {
		return resident;
	}



	public void setResident(ResidentArchive resident) {
		this.resident = resident;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String returnMessage(){
		System.out.println("进入 message");
		this.message = "成功返回单个值";
		return "message";
	}
	

	public String gainMember(){
		
        System.out.println("============进入方法json。gainMember");		
        System.out.println("===========residentName"+resident.getId());
        
		resident = residentArchiveService.getById(resident.getId());
		
		System.out.println("resident.name==========="+resident.getName());
		
		setResident(resident);
		
		return "returnResident";
		
		
	}

}
