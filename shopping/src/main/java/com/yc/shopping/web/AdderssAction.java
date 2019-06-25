package com.yc.shopping.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.shopping.biz.AddressBiz;
import com.yc.shopping.biz.UserBiz;
import com.yc.shopping.dao.AddressMapper;
import com.yc.shopping.dao.UserMapper;

@Controller
/*@SessionAttributes("address")*/
public class AdderssAction {
	@Resource
	private AddressMapper am;
	@Resource
	private AddressBiz abiz;
	
	
	
	
	
}
