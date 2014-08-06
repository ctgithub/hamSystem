package com.uestc.hams.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uestc.hams.base.DaoSupport;
import com.uestc.hams.entity.Role;

/**
 * 服务层
 * @author wujingnan
 *
 */

public interface RoleService extends DaoSupport<Role>{
	/*List findAll();

	void delete(Long id);

	void save(Role role);

	Role findById(Long id);

	void update(Role role);*/
}
