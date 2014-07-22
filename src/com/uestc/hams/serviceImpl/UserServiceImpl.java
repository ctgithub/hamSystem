package com.uestc.hams.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uestc.hams.dao.UserDao;
import com.uestc.hams.entity.User;
import com.uestc.hams.service.UserService;

@Service
@Transactional//开启事物
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;
	
	public List findAll() {
		return userDao.findAll();
	}

	public void delete(Long id) {
		userDao.delete(id);
	}

	public void save(User user) {
		userDao.save(user);
	}

	public void update(User user) {
		userDao.update(user);
	}

}
