package com.uestc.hams.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uestc.hams.entity.Role;

/**
 * 服务层
 * @author wujingnan
 *
 */

public interface RoleService {
	List findAll();

	void delete(Long id);

	void save(Role role);

	Role findById(Long id);

	void update(Role role);
}
