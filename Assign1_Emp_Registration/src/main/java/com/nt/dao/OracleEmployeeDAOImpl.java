package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public final class OracleEmployeeDAOImpl implements EmployeeDAO{
	private  static final  String   CUSTOMER_INSERT_QUERY="INSERT INTO EMP_REG VALUES(ENO_SEQ1.NEXTVAL,?,?,?,?)";
	private  DataSource ds;
	public OracleEmployeeDAOImpl(DataSource ds) {
		
		this.ds = ds;
	}
	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get pooled jdbc connection
		con=ds.getConnection();
		//create PreparedStatement object
		ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);
		//set values to query params
	    
		ps.setString(1,bo.geteName());
		ps.setString(2,bo.geteAddr());
		ps.setFloat(3,bo.getgSal());
		ps.setFloat(4,bo.getNetSal());
		//execute the SQL query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}
	

}
