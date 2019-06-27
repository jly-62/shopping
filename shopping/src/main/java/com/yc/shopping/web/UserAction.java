package com.yc.shopping.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
}
