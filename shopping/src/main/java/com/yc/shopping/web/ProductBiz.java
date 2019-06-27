package com.yc.shopping.web;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.yc.shopping.bean.Product;
import com.yc.shopping.dao.ProductMapper;


@Service
public class ProductBiz {
	
	@Resource
	private ProductMapper pm;

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return pm.selectByExample(null);
	}

}
