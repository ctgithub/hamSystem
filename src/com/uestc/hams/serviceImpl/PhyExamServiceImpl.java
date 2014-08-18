package com.uestc.hams.serviceImpl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.uestc.hams.base.DaoSupportImpl;
import com.uestc.hams.entity.PhyExam;
import com.uestc.hams.service.IPhyExamService;

@Service
@Transactional
public class PhyExamServiceImpl extends DaoSupportImpl<PhyExam> implements
		IPhyExamService {


}
