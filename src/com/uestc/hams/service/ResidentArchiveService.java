package com.uestc.hams.service;

import java.util.List;

import com.uestc.hams.base.DaoSupport;
import com.uestc.hams.entity.ResidentArchive;

public interface ResidentArchiveService extends DaoSupport<ResidentArchive>{
	
	/*
	 * by yang
	 * 
	 */
	public boolean isIdExist(Long id);
	


}
