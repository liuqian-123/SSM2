 package com.xkit.springmvc.service.impl;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xkit.springmvc.dao.Easybuy_userDAO;

import com.xkit.springmvc.entity.Easybuy_user;
import com.xkit.springmvc.service.Easybuy_userService;
@Service
public class Easybuy_userServiceImpl implements Easybuy_userService{

     @Autowired
	private Easybuy_userDAO dao;

	@Override
	public Easybuy_user UserLogin(String zh, String mm) throws Exception {
		Easybuy_user user=dao.get(zh, mm);
		return user;
	}

	//用户注册，返回true代表注册成功，false代表注册失败
		public boolean UserRegist(Easybuy_user user) throws Exception{
			int count=dao.insert(user);
			if (count==1) {
				return true;
			}
			return false;
		}
		public boolean checkLoginUsed(String zh) throws Exception{
			return dao.getCount(zh)==0;
		}
		
		public Easybuy_userDAO getDao() {
			return dao;
		}
		public void setDao(Easybuy_userDAO dao) {
			this.dao = dao;
		}
		
	@Override
	public List<Easybuy_user> selectuser() {
		// TODO Auto-generated method stub
		return dao.users();
	}
	
}