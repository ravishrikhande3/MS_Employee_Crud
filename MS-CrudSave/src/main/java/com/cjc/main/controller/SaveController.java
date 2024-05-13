package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.servicei.ServiceI;

@RestController
public class SaveController {

	@Autowired
	ServiceI si;
	
	@PostMapping("/saveEmp")
	public String saveEmployee(@RequestBody Employee e)
	{
		si.saveEmpData(e);
		
		return "Data Save zala tumcha";
	}
}
