package com.xkit.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.xkit.springmvc.entity.Easybuy_user;
import com.xkit.springmvc.service.Easybuy_userService;
import com.xkit.springmvc.validator.UserLogin;

@Controller
public class UserController {
	@Autowired
	private Easybuy_userService u;

	@RequestMapping("/login")
	public String Login(
			@Validated(value = { UserLogin.class }) Easybuy_user param,
			BindingResult r, Model m) throws Exception {
		Easybuy_user user = u.UserLogin(param.getLoginName(),
				param.getPassword());
		if (user != null) {
			m.addAttribute(user);
			m.addAttribute("msg", "µÇÂ¼³É¹¦");
			return "WEB-INF/manage/main";
		}
		m.addAttribute("msg", "µÇÂ¼Ê§°Ü");
		return "login";

	}

	@RequestMapping("/check")
	@ResponseBody
	public String check(String zh) throws Exception {
		boolean isok = u.checkLoginUsed(zh);
		String rs = "{\"msg\":0}";
		if (isok) {
			rs = "{\"msg\":1}";

		}
		return rs;
	}

	@RequestMapping("/reg")
	public String register(
			@Validated(value = { UserLogin.class }) Easybuy_user user,
			BindingResult r, Model m) throws Exception {
		if (r.hasErrors()) {
			return "regist";
		} else {
			boolean isok = u.UserRegist(user);
			if (isok) {
				m.addAttribute("msg", "×¢²á³É¹¦");
				return "login";
			} else {
				m.addAttribute("msg", "×¢²áÊ§°Ü");
				return "regist";
			}

		}

	}
	@RequestMapping("/userList")
	@ResponseBody
	public String getUser(){
		List<Easybuy_user> list=u.selectuser();
		return JSON.toJSONString(list);
		
	}
	@RequestMapping("/deleteUser/{abc}")
	public String delete(@PathVariable("abc")Integer id){
		System.out.println("ÄúµÄidÎª:"+id);
		return "index";
		
	}
}
