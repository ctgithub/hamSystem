package com.uestc.hams.entity;

import java.util.Date;

/**
 * 健康档案类
 * @author wujingnan
 *
 */
public class ResidentArchive implements java.io.Serializable{
    
	private Long id;
	private String rsArchiveId;//档案id
	private String addressId;
	private String committee;//居委会
	private String rsId;//身份证号
	private String workAddr;//工作单位
	private String linkManName;//联系人姓名
	private Date achiveDate;//建档日期
	private Date rsBornDate;//出生日期
	
	//现地址，乡镇街道名称，建档单位,建档人，联系人电话，联系电话
	private String nowAdr;//现地址
	private Long streetDisId;//乡镇街道地址
	private Long archiveDisId;//建档单位
	
	private String linkManPhoneNum;//联系人电话
	//是否使用静态变量问题
	private String nationality;//民族??
	private String nationalityString;
	
	
	private String livingType;//常住类型：户籍与非户籍
	private String workingType;//职业类型
	private String marriageType;//婚姻类型
	private String bloodType;//血型
	private String rhType;//是否rh阴性
	private String educateType;//文化程度
	
	
	
	//resident信息(一对一关联的用户信息，剩下的自己保存)
	private Long residentId;
	private String loginName;
	private String name;
	private String gender;
	private String phoneNumber; // 电话号码
	private DistrictIns districtIns;//当前管理机构

	private String paperRecorder;//建档人
	
	//这里有点问题
/*	private int exposureType;//暴露史类型
	private int heredityType;//遗传史类型
	private int drugAllergyType;//药物过敏史
*/	//支付方式
	private String payType;
	private String payTypeString;
	
	/*private User resident;//rs=resident
*/	private User doctor;//责任医生
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
	

	

	public void setLinkManName(String linkManName) {
		this.linkManName = linkManName;
	}

	

	
 


	public String getLivingType() {
		return livingType;
	}

	public void setLivingType(String livingType) {
		this.livingType = livingType;
	}

	public String getWorkingType() {
		return workingType;
	}

	public void setWorkingType(String workingType) {
		this.workingType = workingType;
	}

	public String getMarriageType() {
		return marriageType;
	}

	public void setMarriageType(String marriageType) {
		this.marriageType = marriageType;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getRhType() {
		return rhType;
	}

	public void setRhType(String rhType) {
		this.rhType = rhType;
	}

	public String getEducateType() {
		return educateType;
	}

	public void setEducateType(String educateType) {
		this.educateType = educateType;
	}

	

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayTypeString() {
		return payTypeString;
	}

	public void setPayTypeString(String payTypeString) {
		this.payTypeString = payTypeString;
	}

/*	public User getResident() {
		return resident;
	}

	public void setResident(User resident) {
		this.resident = resident;
	}
*/
	
	public User getDoctor() {
		return doctor;
	}



	public Long getResidentId() {
		return residentId;
	}

	public void setResidentId(Long residentId) {
		this.residentId = residentId;
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

	public String getNowAdr() {
		return nowAdr;
	}

	public void setNowAdr(String nowAdr) {
		this.nowAdr = nowAdr;
	}


	public String getLinkManPhoneNum() {
		return linkManPhoneNum;
	}

	public void setLinkManPhoneNum(String linkManPhoneNum) {
		this.linkManPhoneNum = linkManPhoneNum;
	}

	

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNationalityString() {
		return nationalityString;
	}

	public void setNationalityString(String nationalityString) {
		this.nationalityString = nationalityString;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPaperRecorder() {
		return paperRecorder;
	}

	public void setPaperRecorder(String paperRecorder) {
		this.paperRecorder = paperRecorder;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public DistrictIns getDistrictIns() {
		return districtIns;
	}

	public void setDistrictIns(DistrictIns districtIns) {
		this.districtIns = districtIns;
	}

	public Long getStreetDisId() {
		return streetDisId;
	}

	public void setStreetDisId(Long streetDisId) {
		this.streetDisId = streetDisId;
	}

	public Long getArchiveDisId() {
		return archiveDisId;
	}

	public void setArchiveDisId(Long archiveDisId) {
		this.archiveDisId = archiveDisId;
	}

	public Date getAchiveDate() {
		return achiveDate;
	}

	public void setAchiveDate(Date achiveDate) {
		this.achiveDate = achiveDate;
	}

	public Date getRsBornDate() {
		return rsBornDate;
	}

	public void setRsBornDate(Date rsBornDate) {
		this.rsBornDate = rsBornDate;
	}
	
	
}
