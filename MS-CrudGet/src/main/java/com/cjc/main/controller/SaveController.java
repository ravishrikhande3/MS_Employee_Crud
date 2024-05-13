package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.servicei.ServiceI;

@RestController
public class SaveController {

	@Autowired
	ServiceI si;
	
	@GetMapping("/getEmp")
	public Iterable<Employee> getEmployee()
	{
		return si.getEmp();
	}
}
