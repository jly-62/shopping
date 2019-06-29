package com.yc.shopping.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexAction {

	@GetMapping(value= {"/","index"})
	public String index() {
		return "index";
	}
}
