package com.uestc.hams.entity;

import java.util.Date;
import java.util.Set;

/**
 * 健康档案类
 * @author wujingnan
 *
 */
public class ResidentArchive {
    
	private Long id;
	private String rsArchiveId;//档案id
	private String addressId;
	private String committee;//居委会
	private String rsId;//身份证号
	private String workAddr;//工作单位
	private String linkManName;//联系人姓名
	private String nationality;//民族
	
	private String achiveDate;//建档日期
	private String rsBornDate;//出生日期
	
	//是否使用静态变量问题
	private int livingType;//常住类型：户籍与非户籍
	private int workingType;//职业类型
	private int marriageType;//婚姻类型
	private int bloodType;//血型
	private int rhType;//是否rh阴性
	private int educateType;//文化程度
	private int exposureType;//暴露史类型
	private int heredityType;//遗传史类型
	private int drugAllergyType;//药物过敏史
	//支付方式
	private int payType;
	private String payTypeString;
	/*
	private DistrictIns districtIns;//当前管理机构
*/	
	private User resident;//rs=resident
	private User doctor;//责任医生
	private User recorder;//记录员
	
	
	
	//private Set<> donateBlood;动态险些方案(公共即可)
	/*private Set<PublicIns> bloodTrans;//输血
	private Set<PublicIns> surgerys;//手术
	private Set<PublicIns> traumas;//外伤
*/	//支付类型
	
	//家族病史
	/*private FamilyDisease rsDisease;//自己本身史(数组,其他)
	private FamilyDisease motherDisease;//母亲
	private FamilyDisease fatherDisease;//父亲
	private FamilyDisease brotherDisease;//兄弟姐妹
	private FamilyDisease childrenDisease;//孩子 
	*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRsArchiveId() {
		return rsArchiveId;
	}

	public void setRsArchiveId(String rsArchiveId) {
		this.rsArchiveId = rsArchiveId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}



	/*public DistrictIns getDistrictIns() {
		return districtIns;
	}

	public void setDistrictIns(DistrictIns districtIns) {
		this.districtIns = districtIns;
	}*/

	public String getCommittee() {
		return committee;
	}

	public void setCommittee(String committee) {
		this.committee = committee;
	}

	public String getRsId() {
		return rsId;
	}

	public void setRsId(String rsId) {
		this.rsId = rsId;
	}


	public String getWorkAddr() {
		return workAddr;
	}

	public void setWorkAddr(String workAddr) {
		this.workAddr = workAddr;
	}

	public String getLinkManName() {
		return linkManName;
	}
	

	public String getAchiveDate() {
		return achiveDate;
	}

	public void setAchiveDate(String achiveDate) {
		this.achiveDate = achiveDate;
	}

	public String getRsBornDate() {
		return rsBornDate;
	}

	public void setRsBornDate(String rsBornDate) {
		this.rsBornDate = rsBornDate;
	}

	public void setLinkManName(String linkManName) {
		this.linkManName = linkManName;
	}

	public int getLivingType() {
		return livingType;
	}

	public void setLivingType(int livingType) {
		this.livingType = livingType;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getWorkingType() {
		return workingType;
	}

	public void setWorkingType(int workingType) {
		this.workingType = workingType;
	}

	public int getMarriageType() {
		return marriageType;
	}

	public void setMarriageType(int marriageType) {
		this.marriageType = marriageType;
	}

	public int getBloodType() {
		return bloodType;
	}

	public void setBloodType(int bloodType) {
		this.bloodType = bloodType;
	}

	public int getRhType() {
		return rhType;
	}

	public void setRhType(int rhType) {
		this.rhType = rhType;
	}

	public int getEducateType() {
		return educateType;
	}

	public void setEducateType(int educateType) {
		this.educateType = educateType;
	}

	public int getExposureType() {
		return exposureType;
	}

	public void setExposureType(int exposureType) {
		this.exposureType = exposureType;
	}

	public int getHeredityType() {
		return heredityType;
	}

	public void setHeredityType(int heredityType) {
		this.heredityType = heredityType;
	}

	public int getDrugAllergyType() {
		return drugAllergyType;
	}

	public void setDrugAllergyType(int drugAllergyType) {
		this.drugAllergyType = drugAllergyType;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public String getPayTypeString() {
		return payTypeString;
	}

	public void setPayTypeString(String payTypeString) {
		this.payTypeString = payTypeString;
	}

	public User getResident() {
		return resident;
	}

	public void setResident(User resident) {
		this.resident = resident;
	}

	public User getDoctor() {
		return doctor;
	}

	public void setDoctor(User doctor) {
		this.doctor = doctor;
	}

	public User getRecorder() {
		return recorder;
	}

	public void setRecorder(User recorder) {
		this.recorder = recorder;
	}
	
}
