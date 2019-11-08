package com.xkit.springmvc.dao;

import java.util.List;

import com.xkit.springmvc.entity.Easybuy_user_address;

public interface Easybuy_user_addressDao {
	public List<Easybuy_user_address> selectAddress();
	public int addAddress(com.xkit.springmvc.entity.Easybuy_user_address address);

}
