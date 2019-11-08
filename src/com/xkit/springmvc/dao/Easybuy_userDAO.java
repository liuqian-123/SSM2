package com.xkit.springmvc.dao;

import java.util.List;

import com.xkit.springmvc.entity.Easybuy_user;


//用户表操作dao接口
public interface Easybuy_userDAO {
	public Easybuy_user get( String zh,String mm) throws Exception;
	public int insert(Easybuy_user user) throws Exception;
	public int getCount(String zh) throws Exception;
	public List<Easybuy_user> users();
	
}
