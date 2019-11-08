package com.xkit.springmvc.service;

import java.util.List;

import com.xkit.springmvc.entity.Easybuy_user;

public interface Easybuy_userService {
	public Easybuy_user UserLogin(String zh,String mm) throws Exception;
	public boolean UserRegist(Easybuy_user user) throws Exception;
	public boolean checkLoginUsed(String zh) throws Exception;
	public List<Easybuy_user> selectuser();

}
