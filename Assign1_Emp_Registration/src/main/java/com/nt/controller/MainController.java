package com.nt.controller;


import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public final class MainController {
	private EmployeeMgmtService service;

	public MainController(EmployeeMgmtService service) {
		
		this.service = service;
	}
	
	public String processEmployee(EmployeeVO vo)throws Exception{
		EmployeeDTO dto=null;
		String result=null;
		//convert  VO class object to DTO class object
				dto=new EmployeeDTO();
				dto.setEname(vo.getEname());
				dto.setEadd(vo.getEadd());
				dto.setbSal(vo.getbSal());
				dto.setDa(vo.getDa());
				dto.setHra(vo.getHra());
				//use service
				result=service.calculateGrassSalary(dto);
				return result;
	}

}
