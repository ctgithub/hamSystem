package com.uestc.hams.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uestc.hams.base.DaoSupportImpl;
import com.uestc.hams.entity.ResidentArchive;
import com.uestc.hams.service.ResidentArchiveService;
@Service
@SuppressWarnings("unchecked")
public class ResidentArchiveServiceImpl extends DaoSupportImpl<ResidentArchive> implements ResidentArchiveService {

	public boolean isIdExist(Long id) {
		
		List<ResidentArchive> raList = getSession().createQuery("from ResidentArchive r where r.id = ?").setParameter(0, id).list();
		
		if(!raList.isEmpty() && raList!=null){
			
			return true;
			
		}
		return false;
	}

	
}
