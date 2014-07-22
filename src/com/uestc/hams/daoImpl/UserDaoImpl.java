package com.uestc.hams.daoImpl;

import org.springframework.stereotype.Repository;

import com.uestc.hams.base.BaseDao;
import com.uestc.hams.base.BaseDaoImpl;
import com.uestc.hams.dao.UserDao;
import com.uestc.hams.entity.User;

@Repository//注释持久层:父类中有@resource也可以注入
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

}
