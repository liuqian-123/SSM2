package com.xkit.springmvc.entity;

import java.util.Date;

public class Easybuy_user_address {
	private Easybuy_user user;//Ò»¶ÔÒ»
	public Easybuy_user getUser() {
		return user;
	}
	public void setUser(Easybuy_user user) {
		this.user = user;
	}
	private Integer id;
	private Integer userId;

	private String address;
	private Date createTime;
	private Integer isDefault;
	private String remark;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setCreateTime(Date date) {
		// TODO Auto-generated method stub
		
	}

}
