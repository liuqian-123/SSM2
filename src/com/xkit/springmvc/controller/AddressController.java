package com.xkit.springmvc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xkit.springmvc.entity.Easybuy_user;
import com.xkit.springmvc.entity.Easybuy_user_address;
import com.xkit.springmvc.service.Easybuy_userService;
import com.xkit.springmvc.service.Easybuy_user_addressService;

@Controller
public class AddressController {
	@Autowired
	private Easybuy_user_addressService a;
	@Autowired
	private Easybuy_userService u;
	@RequestMapping("/init")
	public String init(){
		return "WEB-INF/jsp/address";
	}
	@RequestMapping("/address")
	public String address(Easybuy_user_address add,Model m){
		add.setCreateTime(new Date());
		if(add.getIsDefault()==null){
			add.setIsDefault(0);
		}
		boolean isok=a.insert(add);
		if(isok){
			m.addAttribute("msg","添加成功");
		}else{
			m.addAttribute("msg","添加失败");

		}
		return "WEB-INF/jsp/address";
		
	}
	@ModelAttribute("userList")
	public List<Easybuy_user> getUser(){
		List<Easybuy_user> list=u.selectuser();
		return list;
		
	}
	

}
