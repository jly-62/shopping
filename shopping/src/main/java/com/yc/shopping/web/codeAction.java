package com.yc.shopping.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yc.shopping.utils.RandomValidateCodeUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/code")
public class codeAction {
  private final static Logger logger = LoggerFactory.getLogger(codeAction.class);
 
  /**
   * 生成验证码
   */
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
      logger.error("获取验证码失败>>>>  ", e);
    }
  }
 
  /**
   * 校验验证码
   *//*
  @RequestMapping(value = "/checkVerify", method = RequestMethod.POST,headers = "Accept=application/json")
  public String checkVerify(@RequestParam String verifyInput, HttpSession session) {
    try{
      //从session中获取随机数
      String inputStr = verifyInput;
      String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
      if (random == null) {
        return "login";
      }
      if (random.equals(inputStr)) {
        return "index";
      } else {
        return "login";
      }
    }catch (Exception e){
      logger.error("验证码校验失败", e);
      return "login";
    }
  }*/
}
