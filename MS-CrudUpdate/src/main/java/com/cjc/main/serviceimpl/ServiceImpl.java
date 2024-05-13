package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repository.SaveRepository;
import com.cjc.main.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	SaveRepository sp;

	@Override
	public Employee updateEmp(int eid) {
		
		return sp.getById(eid);
	}

	@Override
	public void saveEmp(Employee e) {
		sp.save(e);
		
	}

	
	

}
