package com.xkit.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xkit.springmvc.dao.Easybuy_user_addressDao;
import com.xkit.springmvc.entity.Easybuy_user_address;
import com.xkit.springmvc.service.Easybuy_user_addressService;
@Service
public class Easybuy_user_addressServiceImpl implements
		Easybuy_user_addressService {
@Autowired
private Easybuy_user_addressDao dao;
	@Override
	public boolean insert(Easybuy_user_address address) {
		// TODO Auto-generated method stub
		return dao.addAddress(address)>0;
	}

}
