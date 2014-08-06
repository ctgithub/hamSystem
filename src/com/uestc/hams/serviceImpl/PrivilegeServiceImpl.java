package com.uestc.hams.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uestc.hams.base.DaoSupportImpl;
import com.uestc.hams.entity.Privilege;
import com.uestc.hams.service.PrivilegeService;
@Service
@Transactional
public class PrivilegeServiceImpl extends DaoSupportImpl<Privilege> implements PrivilegeService{

}
