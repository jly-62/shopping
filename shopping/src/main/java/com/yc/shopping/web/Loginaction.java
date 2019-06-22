package com.yc.shopping.web;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.shopping.bean.User;
import com.yc.shopping.biz.BizException;
import com.yc.shopping.biz.UserBiz;
import com.yc.shopping.dao.UserMapper;

@Controller
@SessionAttributes("loginedUser")
public class Loginaction {
	@Resource
	private UserMapper um;
	@Resource
	private UserBiz ubiz;
	
	@GetMapping("index")
	public String index(){
		return "index";
	}
	
	
	@GetMapping("/login")
	public String login(@ModelAttribute("User") User u) {
		return "login";
	}
	

	@PostMapping("tologin")
	public String tologin(@ModelAttribute @Valid User u,Errors errors,Model model,HttpServletRequest request) {
		if(errors.hasErrors()) {
			return "login";
		}
		try {
			User dbu = ubiz.login(u);
			model.addAttribute("loginedUser",dbu);
			System.out.println("登录成功");
			return "index";
		} catch (BizException e) {
			e.printStackTrace();
			model.addAttribute("msg",e.getMessage());
			return "login";
		}
		
	}
	
	@GetMapping("/register")
	public String register(@ModelAttribute("User") User u) {
		return"register";
	}
	@PostMapping("/toregister")
	public String toregister(@ModelAttribute("User") @Valid User u,Errors errors,Model model) {
		if(errors.hasErrors()) {
			return "register";
		}
		ubiz.register(u);
		model.addAttribute("msg","注册成功");
		return "index";
	}
	
}
