package com.yc.shopping.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.shopping.bean.Category;
import com.yc.shopping.bean.CategoryExample;
import com.yc.shopping.dao.CategoryMapper;


@Service
public class CategoryBiz {
	
	@Resource 
	CategoryMapper cm;
	
	public  List<Category> findAll(){
		//查询所有分类
		/*List<Category> list=cm.selectCategory();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}*/
		//System.out.println(cm.selectCategory().get(0).getCatepList().get(1).getCname());
		return cm.selectCategory();
	}

	
}