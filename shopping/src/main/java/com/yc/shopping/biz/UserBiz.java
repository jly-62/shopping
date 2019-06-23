package com.yc.shopping.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.shopping.bean.User;
import com.yc.shopping.bean.UserExample;
import com.yc.shopping.dao.UserMapper;


@Service
@Transactional(rollbackFor= BizException.class)
public class UserBiz {
	@Resource
	private UserMapper um;


	public User login(User u) throws BizException{
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameLike(u.getUsername()).andUpwdLike(u.getUpwd());
		List<User> list=um.selectByExample(ue);
		if(list.size()==0) {
			throw new BizException("用户名或密码错误");
		}
		return list.get(0);
	}


	public void reg(User u) {
	       um.insert(u);
	}
	
	public void myreg(User u) {
	       um.insertSelective(u);
	}
}
