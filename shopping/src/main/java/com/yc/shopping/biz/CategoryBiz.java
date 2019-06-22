package com.yc.shopping.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.shopping.bean.Category;
import com.yc.shopping.dao.CategoryMapper;


@Service
public class CategoryBiz {
	
	@Resource 
	CategoryMapper cm;
	
	public List<Category> findAll(){
		//查询所有分类
		return cm.selectByExample(null);
	}
}