package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.servicei.ServiceI;

@RestController
public class SaveController {

	@Autowired
	ServiceI si;
	
	@PutMapping("/updateEmp/{eid}")
	public String UpdateEmp(@PathVariable int eid, @RequestBody Employee e)
	{
		Employee em=si.updateEmp(eid);
		if(em.getEid()==e.getEid())
		{
			si.saveEmp(e);
		}
		return "Update Data";
	}
}
