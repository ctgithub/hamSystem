package com.uestc.hams.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uestc.hams.dao.DistrictInsDao;
import com.uestc.hams.entity.DistrictIns;
import com.uestc.hams.service.DistrictInsService;

@Service
@Transactional
public class DistrictInsServiceImpl implements DistrictInsService{
	
	@Resource
	private DistrictInsDao districtInsDao;
	
	public List<DistrictIns> findAll() {
 		return districtInsDao.findAll();
	}

}
