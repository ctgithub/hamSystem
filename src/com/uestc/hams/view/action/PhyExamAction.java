package com.uestc.hams.view.action;


import java.util.List;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.uestc.hams.base.BaseAction;
import com.uestc.hams.entity.PhyExam;
import com.uestc.hams.entity.ResidentArchive;
import com.uestc.hams.entity.User;
import com.uestc.hams.util.ListStringUtils;

/**
 * 健康体检action 
 * @author ct
 *
 */

@Controller
@Scope("prototype")
public class PhyExamAction extends BaseAction<PhyExam> {

	//症状
	private List<String> symptom;
	//饮食习惯
	private List<String> dietList;
	//饮酒种类
	private List<String> drinkTypeList;
	//乳腺
	private List<String> breastList;
	//脑血管疾病
	private List<String> cerebroDisList;
	//肾脏疾病
	private List<String> kidneyDisList;
	//心脏疾病
	private List<String> heartDisList;
	//血管疾病
	private List<String> vesselDisList;
	//眼部疾病
	private List<String> eyeDisList;
	//责任医生
	private List<User> doctors;
	//录入员
	private List<User> recorders;
	//健康档案
	private ResidentArchive residentArchive;
	//页面传过来的健康档案的id
	private Long rsaId;
	//健康档案对应的居民
	private User resident;
 	/**
	 * addUI()方法：跳转到健康体检填写页面
	 */
	public String addUI(){
		//System.out.println(rsaId);
		//查询出所有角色为医生的用户
		doctors = userService.findAll();
		//查询出角色为录入员的用户
		recorders = userService.findAll();
		//根据id查询出对应的健康档案对象
		residentArchive = residentArchiveService.getById(rsaId);
		//System.out.println(residentArchive.getRsArchiveId());
		//System.out.println(residentArchive.getRsBornDate());
		resident = residentArchive.getResident();
		
		return "saveUI";
	}
	
	/**
	 * 
	 * 将页面传过来的数据保存至数据库
	 * @return
	 */
	public String add(){
		//将页面传过来的list属性转换为字符串
		String symptom1 = ListStringUtils.listToString(symptom, ",");
		String diet = ListStringUtils.listToString(dietList, ",");
		String drinkType1 = ListStringUtils.listToString(drinkTypeList, ",");
		String breast1 = ListStringUtils.listToString(breastList, ",");
		String cerebroDis1 = ListStringUtils.listToString(cerebroDisList, ",");
		String kidneyDis1 = ListStringUtils.listToString(kidneyDisList, ",");
		String heartDis1 = ListStringUtils.listToString(heartDisList, ",");
		String vesselDis1 = ListStringUtils.listToString(vesselDisList, ",");
		String eyeDis1 = ListStringUtils.listToString(eyeDisList, ",");
		//将处理过的字符串属性设置到对象的相应的字段里
		model.setSymptom1(symptom1);
		model.setDiet(diet);
		model.setDrinkType1(drinkType1);
		model.setBreast1(breast1);
		model.setCerebroDis1(cerebroDis1);
		model.setKidneyDis1(kidneyDis1);
		model.setHeartDis1(heartDis1);
		model.setVesselDis1(vesselDis1);
		model.setEyeDis1(eyeDis1);
		//将对象存入数据库
		phyExamService.save(model);
		return "list";
	}
	
	/**
	 * 为修改页面准备数据
	 * @return
	 */
	public String editUI(){
		
		String symptom1;
		String diet;
		String drinkType1;
		String breast1;
		String cerebroDis1;
		String kidneyDis1;
		String heartDis1;
		String vesselDis1;
		String eyeDis1;
		//查询出所有角色为医生的用户
		doctors = userService.findAll();
		//查询出角色为录入员的用户
		recorders = userService.findAll();
		//System.out.println(residentArchive.getRsArchiveId());
		//System.out.println(residentArchive.getRsBornDate());
		//根据页面传过来的id值查找对象
		PhyExam phyExam = phyExamService.getById(model.getId());
		if(phyExam != null){
			symptom1 = phyExam.getSymptom1();
			diet = phyExam.getDiet();
			drinkType1 = phyExam.getDrinkType1();
			breast1 = phyExam.getBreast1();
			cerebroDis1 = phyExam.getCerebroDis1();
			kidneyDis1 = phyExam.getKidneyDis1();
			heartDis1 = phyExam.getHeartDis1();
			vesselDis1 = phyExam.getVesselDis1();
			eyeDis1 = phyExam.getEyeDis1();
			residentArchive = phyExam.getResidentArchive();
			if(residentArchive==null){
				System.out.println("kong");
			}else{
				resident = residentArchive.getResident();
			}
			
		}else{
			symptom1 = null;
			diet = null;
			drinkType1 = null;
			breast1 = null;
			cerebroDis1 = null;
			kidneyDis1 = null;
			heartDis1 = null;
			vesselDis1 = null;
			eyeDis1 = null;
		}
		//将从数据库里查出的字符串转换为list		
		symptom = ListStringUtils.stringToList(symptom1, ",");
		dietList = ListStringUtils.stringToList(diet, ",");
		drinkTypeList = ListStringUtils.stringToList(drinkType1, ",");
		breastList = ListStringUtils.stringToList(breast1, ",");
		cerebroDisList = ListStringUtils.stringToList(cerebroDis1, ",");
		kidneyDisList = ListStringUtils.stringToList(kidneyDis1, ",");
		heartDisList = ListStringUtils.stringToList(heartDis1, ",");
		vesselDisList = ListStringUtils.stringToList(vesselDis1, ",");
		eyeDisList = ListStringUtils.stringToList(eyeDis1, ",");
		//将对象压入值栈
		ActionContext.getContext().getValueStack().push(phyExam);
		return "saveUI";
	}
	
	/**
	 * 修改数据到数据库
	 * @return
	 */
	public String edit(){
		String symptom1 = ListStringUtils.listToString(symptom, ",");
		String diet = ListStringUtils.listToString(dietList, ",");
		String drinkType1 = ListStringUtils.listToString(drinkTypeList, ",");
		String breast1 = ListStringUtils.listToString(breastList, ",");
		String cerebroDis1 = ListStringUtils.listToString(cerebroDisList, ",");
		String kidneyDis1 = ListStringUtils.listToString(kidneyDisList, ",");
		String heartDis1 = ListStringUtils.listToString(heartDisList, ",");
		String vesselDis1 = ListStringUtils.listToString(vesselDisList, ",");
		String eyeDis1 = ListStringUtils.listToString(eyeDisList, ",");
		model.setSymptom1(symptom1);
		model.setDiet(diet);
		model.setDrinkType1(drinkType1);
		model.setBreast1(breast1);
		model.setCerebroDis1(cerebroDis1);
		model.setKidneyDis1(kidneyDis1);
		model.setHeartDis1(heartDis1);
		model.setVesselDis1(vesselDis1);
		model.setEyeDis1(eyeDis1);
		phyExamService.update(model);		
		return "list";
		}

	public List<String> getSymptom() {
		return symptom;
	}

	public void setSymptom(List<String> symptom) {
		this.symptom = symptom;
	}

	public List<String> getDietList() {
		return dietList;
	}

	public void setDietList(List<String> dietList) {
		this.dietList = dietList;
	}

	public List<String> getDrinkTypeList() {
		return drinkTypeList;
	}

	public void setDrinkTypeList(List<String> drinkTypeList) {
		this.drinkTypeList = drinkTypeList;
	}

	public List<String> getBreastList() {
		return breastList;
	}

	public void setBreastList(List<String> breastList) {
		this.breastList = breastList;
	}

	public List<String> getCerebroDisList() {
		return cerebroDisList;
	}

	public void setCerebroDisList(List<String> cerebroDisList) {
		this.cerebroDisList = cerebroDisList;
	}

	public List<String> getKidneyDisList() {
		return kidneyDisList;
	}

	public void setKidneyDisList(List<String> kidneyDisList) {
		this.kidneyDisList = kidneyDisList;
	}

	public List<String> getHeartDisList() {
		return heartDisList;
	}

	public void setHeartDisList(List<String> heartDisList) {
		this.heartDisList = heartDisList;
	}

	public List<String> getVesselDisList() {
		return vesselDisList;
	}

	public void setVesselDisList(List<String> vesselDisList) {
		this.vesselDisList = vesselDisList;
	}

	public List<String> getEyeDisList() {
		return eyeDisList;
	}

	public void setEyeDisList(List<String> eyeDisList) {
		this.eyeDisList = eyeDisList;
	}

	public List<User> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<User> doctors) {
		this.doctors = doctors;
	}

	public List<User> getRecorders() {
		return recorders;
	}

	public void setRecorders(List<User> recorders) {
		this.recorders = recorders;
	}

	public ResidentArchive getResidentArchive() {
		return residentArchive;
	}

	public void setResidentArchive(ResidentArchive residentArchive) {
		this.residentArchive = residentArchive;
	}

	public Long getRsaId() {
		return rsaId;
	}

	public void setRsaId(Long rsaId) {
		this.rsaId = rsaId;
	}

	public User getResident() {
		return resident;
	}

	public void setResident(User resident) {
		this.resident = resident;
	}

	
	
	
	
}
