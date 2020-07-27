package com.nt.service;

import com.nt.bo.EmployeeBO;

import com.nt.dao.EmployeeDAO;

import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements EmployeeMgmtService{
	
	private  EmployeeDAO dao;

	public EmployeeMgmtServiceImpl(EmployeeDAO dao) {
		
		this.dao = dao;
	}
	@Override
	public String calculateGrassSalary(EmployeeDTO dto) throws Exception {
	    float gSal=0.0f,netSal=0.0f;
	    int deduction = 0;
	    EmployeeBO bo=null;
	    int count=0;
		//calculate Grass_Salary
	    gSal=(dto.getbSal()+dto.getDa()+dto.getHra());
	    //calculate Net_Salary
	    netSal=(gSal)-(deduction);
	    
		//prepare CustomerBO object having persistable data...
	    bo=new EmployeeBO();
	    bo.seteName(dto.getEname());
	    bo.seteAddr(dto.getEadd());
	    bo.setgSal(gSal);
	    bo.setNetSal(netSal);
	    
	    //use dAO
	    count=dao.insert(bo);
	    // process the result
	    if(count==0)
	    	  return "Employee Registration failed ";
	    else 
	    	 return "Employee Registration Succeded :: Basic_Salary::"+dto.getbSal()+" DA::"+dto.getDa()+" Hra::"+dto.getHra()+" Total Grass_Salary::"+gSal+"Total Net_Salary::"+netSal;
	}
	


}
