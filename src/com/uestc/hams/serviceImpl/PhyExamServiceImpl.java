package com.uestc.hams.serviceImpl;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.uestc.hams.base.DaoSupportImpl;
import com.uestc.hams.entity.PhyExam;
import com.uestc.hams.service.IPhyExamService;

@Service
@Transactional
public class PhyExamServiceImpl extends DaoSupportImpl<PhyExam> implements
		IPhyExamService {

	/**
	 * 根据健康档案id查找对应的健康体检记录
	 */
	public List<PhyExam> findAll(Long id) {
		List<PhyExam> phyExams;
		if(id != null){
			phyExams = getSession().createQuery("From PhyExam where residentArchive.id=?").setParameter(0, id).list();
		}else{
			return null;
		}
		
		
		return phyExams;
	}


}
