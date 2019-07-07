package com.yc.shopping.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.shopping.bean.Product;
import com.yc.shopping.biz.CategoryBiz;
import com.yc.shopping.biz.ProductBiz;
import com.yc.shopping.utils.PageHelper;


@Controller
public class IndexAction extends CommonAction{
	@Resource 
	private CategoryBiz cb;
	@Resource
	private ProductBiz pb;
	
	
	
	@RequestMapping(value= {"/","index"})
	public String index(){
		return "index";
	}
	
	@RequestMapping("flowerDer")
	public String category1(Integer categoryId,String pageNum,Model model){
		//System.err.println("categoryid1==="+productId);
		//System.out.println("pageNum===="+pageNum);
		//获取页码
		if(pageNum==null || "".equals(pageNum)){
			pageNum="1";
		}
		Integer pageNum1=Integer.valueOf(pageNum);
		//设置每页显示记录数
		Integer pageSize=24;
		//获取总记录数
		Integer totalRecord=pb.getTotalRecordByProductId(categoryId);
		System.out.println(categoryId+"总记录数是===="+totalRecord);
		//开始分页查询
		PageHelper<Product> ph=pb.getNewDetailsPage(pageNum1, pageSize, totalRecord, categoryId);
		
		model.addAttribute("pageInfo", ph);
		
		return "flowerDer";
	}
	@RequestMapping("paint")
	public String category2(String categoryId){
		//System.err.println("categoryid2==="+categoryId);
		
		return "paint";
	}
		
}
