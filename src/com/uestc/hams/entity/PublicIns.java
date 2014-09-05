package com.uestc.hams.entity;

/**
 * 输血，手术，外伤公共信息
 * @author wujingnan
 *
 */
public class PublicIns {

	private Long id;
	private String type;
	private String typeString;//应该是日期，后面再改；
	private ResidentArchive rsBloodTran;//该信息对应的档案
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTypeString() {
		return typeString;
	}
	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}
	public ResidentArchive getRsBloodTran() {
		return rsBloodTran;
	}
	public void setRsBloodTran(ResidentArchive rsBloodTran) {
		this.rsBloodTran = rsBloodTran;
	}
	
	
}
