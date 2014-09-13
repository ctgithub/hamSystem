package com.uestc.hams.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uestc.hams.base.DaoSupportImpl;
import com.uestc.hams.entity.Role;
import com.uestc.hams.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl extends DaoSupportImpl<Role> implements RoleService{

	/*@Resource
	private RoleDao roleDao;*/
	/*public List findAll() {
		return roleDao.findAll();
		
	}
	public void delete(Long id) {
		roleDao.delete(id);
	}
	public void save(Role role) {
		roleDao.save(role);
	}
	public Role findById(Long id) {
		return roleDao.getById(id);
	}
	public void update(Role role) {
		roleDao.update(role);
	}*/

}
