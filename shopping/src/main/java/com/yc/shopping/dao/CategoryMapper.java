package com.yc.shopping.dao;

import com.yc.shopping.bean.Category;
import com.yc.shopping.bean.CategoryExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CategoryMapper {
    long countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int deleteByPrimaryKey(Integer categoryid);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Integer categoryid);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
    
    /*手动添加*/
    @Select("SELECT * FROM ( SELECT a.cname pname, b.cname cname ,b.categoryId FROM category a LEFT JOIN category b ON a.categoryId=b.parentId WHERE a.parentId=0) a")
	public List<Map<String, Object>> selectCategoryAllInfo();
    
	List<Category> selectCategory();
}