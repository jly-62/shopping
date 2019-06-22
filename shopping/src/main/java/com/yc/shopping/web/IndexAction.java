package com.yc.shopping.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.shopping.biz.CategoryBiz;


@Controller
public class IndexAction {
	
	@Resource 
	private CategoryBiz cb;
	
	/**
	 * 测试
	 */
	@RequestMapping("index")
	public String index(){
		return "admin/index";
	}
	
	@ModelAttribute
	public void initHeaderData(Model model){
		//查询所有分类
		model.addAttribute("cateList",cb.findAll());
	}
}
