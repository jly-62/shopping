package com.yc.shopping.web;

import javax.annotation.Resource;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.shopping.bean.User;
import com.yc.shopping.biz.UserBiz;
import com.yc.shopping.dao.UserMapper;



@Controller
@SessionAttributes("Users")
public class UserAction {

	@Resource
	private UserMapper um;
	@Resource
	private UserBiz ubiz;
	
	@GetMapping("mygxin")
	public String mygxin(){
		return "mygxin";
	}
	
	@GetMapping("mygrxx")
	public String mygrxx(){
		return "mygrxx";
	}
	
	@GetMapping("cart")
	public String cart(){
		return "cart";
	}
	
	@GetMapping("myorderq")
	public String myorderq(){
		return "myorderq";
	}
	
	@GetMapping("myprod")
	public String myprod(){
		return "myprod";
	}
	
	@GetMapping("address")
	public String address(){
		return "address";
	}
	
	@GetMapping("remima")
	public String remima(){
		return "remima";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute("User") @Valid User u,Errors errors,Model model) {
		if(errors.hasErrors()) {
			return "index";
		}else {
		ubiz.update(u);
		/*model.addAttribute("msg","修改成功");*/
		return "updateSuccess";
		}
	}
	
	
}
