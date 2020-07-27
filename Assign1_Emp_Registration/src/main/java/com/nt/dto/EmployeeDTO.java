package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	
	private String ename;
	private  String eadd;
	private  float bSal;
	private float da;
	private float hra;
	//Generate Getters && Setters
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
	public float getbSal() {
		return bSal;
	}
	public void setbSal(float bSal) {
		this.bSal = bSal;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	

}
