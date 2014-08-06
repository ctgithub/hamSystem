package com.uestc.hams.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uestc.hams.base.DaoSupportImpl;
import com.uestc.hams.entity.User;
import com.uestc.hams.service.UserService;

@Service
@Transactional//开启事物
public class UserServiceImpl extends DaoSupportImpl<User> implements UserService{

	public User findByLoginNameAndPassword(String loginName,String password) {
		//返回唯一值结果
		return (User) getSession().createQuery("From User u where u.loginName=? and u.password=?")//
		.setParameter(0, loginName)//
		.setParameter(1, password)//
		.uniqueResult();
		 
	}
	

}
