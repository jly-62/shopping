package com.yc.shopping.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.shopping.bean.Picture;
import com.yc.shopping.bean.Product;
import com.yc.shopping.biz.CategoryBiz;
import com.yc.shopping.biz.ProductBiz;

@Controller
public class ProductAction {
	@Resource 
	private CategoryBiz cb;
	@Resource
	private ProductBiz pb;
	
	@ModelAttribute
	public void initHeaderData(Model model){
		//查询所有分类及其子类信息
		model.addAttribute("cateList",cb.findAll());
		/* 首页
		 * 心水-特色  采用烛台风灯前6件商品	------5
		 * 摆件-花艺  采用台面花瓶前6件商品------6
		 * 壁挂-北欧  采用逼饰壁画前8件商品------4
		 */
		model.addAttribute("homePageList1",pb.selectHomePageInfo1());
		model.addAttribute("homePageList2",pb.selectHomePageInfo2());
		model.addAttribute("homePageList3",pb.selectHomePageInfo3());
		
	}
	//展示每一件商品详情
	@RequestMapping("proDetail")
	public String productInfo(String productId,Model model){
		System.out.println("productId===="+productId);
		List<Product> lProducts=pb.selectProductById(productId);
		List<Picture> lPictures=pb.selectPictureById(productId);
		model.addAttribute("lProducts", lProducts);
		model.addAttribute("lPictures", lPictures);
		return "proDetail";
	}
}
