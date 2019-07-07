package com.yc.shopping.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.shopping.bean.Picture;
import com.yc.shopping.bean.PictureExample;
import com.yc.shopping.bean.Product;
import com.yc.shopping.bean.ProductExample;
import com.yc.shopping.dao.PictureMapper;
import com.yc.shopping.dao.ProductMapper;
import com.yc.shopping.utils.PageHelper;


@Service
public class ProductBiz {
	@Resource
	ProductMapper pm;
	@Resource
	PictureMapper pim;
	/* 
	 * 首页
	 * 心水-特色  采用烛台风灯前6件商品	------5
	 * 摆件-花艺  采用台面花瓶前6件商品------6
	 * 壁挂-北欧  采用逼饰壁画前8件商品------4
	 */
	
	//心水-特色  采用烛台风灯前6件商品	------5
	public List<Product> selectHomePageInfo1() {
		
		List<Product> list=pm.selectHomePageInfo1();
		if(list.size()>=6){
			return list.subList(0, 6);
		}
		return list;
	}
	//摆件-花艺  采用台面花瓶前6件商品------6
	public List<Product> selectHomePageInfo2() {
		
		List<Product> list=pm.selectHomePageInfo2();
		if(list.size()>=6){
			return list.subList(0, 6);
		}
		return list;
	}
	//壁挂-北欧  采用逼饰壁画前8件商品------4
	public List<Product> selectHomePageInfo3() {
		List<Product> list=pm.selectHomePageInfo3();
		if(list.size()>=8){
			return list.subList(0, 8);
		}
		return list;
	}
	//查出每件商品的详细信息
	public List<Product> selectProductById(String productId) {
		ProductExample pe=new ProductExample();
		pe.createCriteria().andProductidEqualTo(productId);
		return pm.selectByExample(pe);
	}
	//查出没件商品的几张详情图
	public List<Picture> selectPictureById(String productId) {
		PictureExample pe=new PictureExample();
		pe.createCriteria().andProductidEqualTo(productId);
		return pim.selectByExample(pe);
	}
	public Integer getTotalRecordByProductId(Integer categoryId) {

		List<Product> list=pm.getTotalRecordByProductId(categoryId);
		return list.size();
	}
	public PageHelper<Product> getNewDetailsPage(Integer pageNum1, Integer pageSize, Integer totalRecord,
			Integer categoryId) {
		//创建一个分页工具对象
		PageHelper<Product> ph=new PageHelper<>(pageNum1, pageSize, totalRecord,categoryId);
		
		Integer StartIndex=ph.getStartIndex();
		Integer PageSize=ph.getPageSize();
		
		List<Product> list=pm.getNewDetailsPage(categoryId,StartIndex,PageSize);
		
		ph.setList(list);
		return ph;
	}
	
}
