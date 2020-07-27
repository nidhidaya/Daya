package com.nt.bo;

public class EmployeeBO {
	
	private String eName;
	private String eAddr;
	private float gSal;
	private float netSal;
	
	//Getters && Setters
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddr() {
		return eAddr;
	}
	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}
	public float getgSal() {
		return gSal;
	}
	public void setgSal(float gSal) {
		this.gSal = gSal;
	}
	public float getNetSal() {
		return netSal;
	}
	public void setNetSal(float netSal) {
		this.netSal = netSal;
	}
	
	
}
