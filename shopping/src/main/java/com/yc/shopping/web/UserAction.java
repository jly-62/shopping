package com.yc.shopping.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.yc.shopping.bean.User;
import com.yc.shopping.biz.BizException;
import com.yc.shopping.biz.UserBiz;



@Controller
public class UserAction {

	
	@Resource
	private UserBiz ubiz;
	
	@GetMapping("mygxin")
	public String mygxin() {
		return "mygxin";
	}
	
	@ModelAttribute
	public void initData(Model model) {
		model.addAttribute("ulist",ubiz.findAll());
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "index";
		
	}
}
