package com.uestc.hams.entity;

import java.util.HashSet;
import java.util.Set;

public class User implements java.io.Serializable{

	private Long id;
	private String loginName;
	private String name;
	private String gender;
	private String password;
	private Set<Role> roles=new HashSet<Role>();
	private DistrictIns districtIns;
	
	
	public DistrictIns getDistrictIns() {
		return districtIns;
	}
	public void setDistrictIns(DistrictIns districtIns) {
		this.districtIns = districtIns;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
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
	
}
