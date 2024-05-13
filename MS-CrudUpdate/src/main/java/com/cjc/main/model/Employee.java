package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee 
{

	@Id
	private int eid;
	private String ename;
	private String eadd;
	private int esal;
	private String edesig;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEdesig() {
		return edesig;
	}
	public void setEdesig(String edesig) {
		this.edesig = edesig;
	}
	
	
}
