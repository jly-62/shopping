package com.yc.shopping.web;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.shopping.bean.User;
import com.yc.shopping.biz.BizException;
import com.yc.shopping.biz.UserBiz;
import com.yc.shopping.dao.UserMapper;
import com.yc.shopping.util.RandomValidateCodeUtil;

@Controller
@SessionAttributes("loginedUser")
public class LoginAction {
	
private final static Logger logger = LoggerFactory.getLogger(LoginAction.class);
	
	@Resource
	private UserMapper um;
	@Resource
	private UserBiz ubiz;
	

	
	@GetMapping("/login")
	public String login(@ModelAttribute("User") User u) {
		return "login";
	}
	
	//生成验证码
	 @RequestMapping(value = "/getVerify")
	    public void getVerify(HttpServletRequest request, HttpServletResponse response) {
	        try {
	            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
	            response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
	            response.setHeader("Cache-Control", "no-cache");
	            response.setDateHeader("Expire", 0);
	            RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
	            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
	        } catch (Exception e) {
	            logger.error("获取验证码失败>>>>   ", e);
	        }
	    }
	 
	/* 
	 *
	 //获取验证码
	 @RequestMapping(value = "/checkVerify", method = RequestMethod.POST,headers = "Accept=application/json")
	    public boolean checkVerify(@RequestParam String verifyInput, HttpSession session) {
	        try{
	            //从session中获取随机数
	            String inputStr = verifyInput;
	            String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
	            if (random == null) {
	                return false;
	            }
	            if (random.equals(inputStr)) {
	                return true;
	            } else {
	                return false;
	            }
	        }catch (Exception e){
	            logger.error("验证码校验失败", e);
	            return false;
	        }
	    }*/
	

	@PostMapping("index")
	@RequestMapping(value = "/checkVerify", method = RequestMethod.POST,headers = "Accept=application/json")
	public String tologin(@ModelAttribute("User") @Valid User u,Errors errors,Model model,HttpServletRequest request,@RequestParam String verifyInput, HttpSession session) {
		
		
		System.out.println(errors);
		if(errors.hasFieldErrors("username") || errors.hasFieldErrors("upwd")) {
			return "login";
		}try {
			
			User dbu = ubiz.login(u);
			model.addAttribute("loginedUser",dbu);
     		System.out.println("密码正确");
			
			try{
				String inputStr = verifyInput;
		        String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
				
			if (random == null) {
                return "login";
                
            }
            if (random.equals(inputStr)) {
            	return "index";
            } 
			else {
                return "login";
            }
        }catch (Exception e){
            logger.error("验证码校验失败", e);
            return "login";
        }
			

			
			
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
