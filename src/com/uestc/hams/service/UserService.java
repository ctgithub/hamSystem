package com.uestc.hams.service;

import java.util.List;

import com.uestc.hams.entity.User;

public interface UserService {

	List findAll();

	void delete(Long id);

	void save(User user);

	void update(User user);

}
