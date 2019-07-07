package com.yc.shopping.web;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.shopping.bean.User;
import com.yc.shopping.biz.BizException;
import com.yc.shopping.biz.UserBiz;
import com.yc.shopping.dao.UserMapper;
import com.yc.shopping.util.EmailCode;


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
	public String tologin(@ModelAttribute("User") @Valid User u,Errors errors,
			Model model,HttpServletRequest request, HttpSession session) {
		
		if(errors.hasFieldErrors("username") || errors.hasFieldErrors("upwd")) {
			return "login";
		}try {
			
		    User dbu = ubiz.login(u);
			model.addAttribute("loginedUser",dbu);
     		System.out.println("密码正确");
     		
     		
     		
			/*//没有获取到前台传过来的验证码
     		 String inputStr = verifyInput;
     		 System.out.println(inputStr+"：这是测试");*/
     		 
     		 
		     /* String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
		      System.out.println(random+"是的");
		      
			      if (random.equals(inputStr)) {*/
			        return "index";
			      /*} else {
			    	System.out.println("警告");
			        return "login";
			      }*/
			/*return "index";*/
			
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
	
	
	
	//邮箱验证码
	@Autowired
	private JavaMailSender mailSender;
	
	@Value("${mail.fromMail.addr}")
	private String from;
	
	public void sendSimpleMail(String to,String subject,String content) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(content);
		mailSender.send(message);
		}
	

	@RequestMapping("email")
	@ResponseBody
	public String send(String to/*,String content*/) {
		
		String code =EmailCode.getNumber();
		
		sendSimpleMail(to,"系统邮件",code);
		return "发送成功";
	}
	
	
}
