package com.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbcUtil.ConnectionUtil;
import com.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	CallableStatement cstmt;
	
	List<Employee> empList;
	public  EmployeeRepositoryImpl() {
		// TODO Auto-generated constructor stub
		con=ConnectionUtil.getConnection();
		empList=new ArrayList<Employee>();
		
	}
	

	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		try {
			pstmt=con.prepareStatement("insert into Employee values (?,?,?)");
			pstmt.setInt(1, e.getEmployee_id());
			pstmt.setString(2,e.getFirstName());
			pstmt.setString(3, e.getLastName());
			int rs=pstmt.executeUpdate();
			System.out.println("No of records added: "+rs);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e=null;
			e1.printStackTrace();
		}
		
		
		return e;
	}

	@Override
	public int updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		int rs=0;
		try {
			pstmt=con.prepareStatement("Update Employee set firstName=?,lastName=? where employee_id=?");
			pstmt.setString(1, e.getFirstName());
			pstmt.setString(2, e.getLastName());
			pstmt.setInt(3, e.getEmployee_id());
		    rs=pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return rs;
	}

	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		try {
			cstmt=con.prepareCall("{call deleteEmployee(?)}");
			cstmt.setInt(1, empid);
			cstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from Employee");
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEmployee_id(rs.getInt("emp_id"));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				empList.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}
	
	

}
