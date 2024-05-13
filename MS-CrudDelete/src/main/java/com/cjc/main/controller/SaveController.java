package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.main.servicei.ServiceI;

@RestController
public class SaveController {

	@Autowired
	ServiceI si;
	
	@DeleteMapping("deleteEmp/{eid}")
	public String deleteEmp(@PathVariable int eid)
	{
		si.deleteEmp(eid);
		
		return "Data Deleted";
	}
}
