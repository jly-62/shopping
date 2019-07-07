package com.yc.shopping.dao;

import com.yc.shopping.bean.Product;
import com.yc.shopping.bean.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProductMapper {
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    
    //手动添加
    @Select("SELECT * FROM product WHERE categoryId=5 GROUP BY productId")
    List<Product> selectHomePageInfo1();
    
    @Select("SELECT * FROM product WHERE categoryId=6 GROUP BY productId")
    List<Product> selectHomePageInfo2();
    
    @Select("SELECT * FROM product WHERE categoryId=4 GROUP BY productId")
    List<Product> selectHomePageInfo3();
    
    
    @Select("SELECT * FROM product WHERE categoryId IN(SELECT categoryId FROM  category  WHERE parentId=#{categoryId} OR categoryId=#{categoryId} ) GROUP BY productId")
	List<Product> getTotalRecordByProductId(Integer categoryId);

    @Select("SELECT * FROM product WHERE categoryId IN(SELECT categoryId FROM  category  WHERE parentId=#{categoryId} OR categoryId=#{categoryId} ) GROUP BY productId limit #{StartIndex},#{PageSize}")
    List<Product> getNewDetailsPage(@Param("categoryId") Integer categoryId,@Param("StartIndex") Integer StartIndex,@Param("PageSize") Integer PageSize);
    
}