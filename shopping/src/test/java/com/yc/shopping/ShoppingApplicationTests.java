package com.yc.shopping;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yc.shopping.dao.ProductMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Resource
	ProductMapper pm;
	
	@Test
	public void test(){
		System.out.println("==============测试============="+pm.selectByExample(null));
	}

}
