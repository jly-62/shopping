package com.yc.shopping.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class productAction {

	@Resource
	private ProductBiz pbiz;
	
	@GetMapping("proDetail")
	public String proDetail(){
		return "proDetail";
	}
	
	@ModelAttribute
	public void initData(Model model) {
		model.addAttribute("plist",pbiz.findAll());
	}
}
