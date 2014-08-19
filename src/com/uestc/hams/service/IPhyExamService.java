package com.uestc.hams.service;

import java.util.List;

import com.uestc.hams.base.DaoSupport;
import com.uestc.hams.entity.PhyExam;

public interface IPhyExamService extends DaoSupport<PhyExam> {

	List<PhyExam> findAll(Long id);
}
