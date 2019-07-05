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
public class LoginAction {
	@Resource
	private UserMapper um;
	@Resource
	private UserBiz ubiz;
	

	
	@GetMapping("/login")
	public String login(@ModelAttribute("User") User u) {
		return "login";
	}
	

	@PostMapping("index")
	public String tologin(@ModelAttribute("User") @Valid User u,Errors errors,Model model,HttpServletRequest request) {
		
		System.out.println(errors);
		if(errors.hasFieldErrors("username") || errors.hasFieldErrors("upwd")) {
			return "login";
		}try {
			
			User dbu = ubiz.login(u);
			model.addAttribute("loginedUser",dbu);
			return "index";
			
			
		} catch (BizException e) {
			e.printStackTrace();
			model.addAttribute("msg",e.getMessage());
			System.out.println("登录失败");
			return "login";
		}
		
	}

	@GetMapping("/reg")
	public String reg(@ModelAttribute("User") User u) {
		return "reg";
	}
	
	@PostMapping("reg")
	public String toreg(@ModelAttribute("User") @Valid User u,Errors errors,Model model) {
		if(errors.hasErrors()) {
			return "reg";
		}
		ubiz.reg(u);
		model.addAttribute("msg","注册成功");
		return "login";
	}
	
	
}
