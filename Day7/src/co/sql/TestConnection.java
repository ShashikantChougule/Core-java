package co.sql;



import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.ConnectionUtil;

public class TestConnection {

	public static void main(String[] args) {

		try {
			Connection con = ConnectionUtil.getConnection();

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM Employee");
			
			System.out.println("Employee Details.......");
			while(rs.next())
			{
				System.out.println("Employee ID :"+rs.getInt(1));
				System.out.println("Employee First Name :"+rs.getString(2));
				System.out.println("Employee Last Name :"+rs.getString(3));
				System.out.println("Employee Email :"+rs.getString(4));
				System.out.println("Employee Phone Number :"+rs.getInt(5));
				System.out.println("Employee Hire Date :"+rs.getDate(6));
				System.out.println("Employee Salary :"+rs.getInt(7));
				
				
			}
			
			System.out.println("----------------------------");
			int res=stmt.executeUpdate("INSERT INTO Employee (EMPLOYEEID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE,Salary)\r\n"
					+ "VALUES ('2324', 'James', 'Gosling', 'James@gmail.com', '52446', DATE('2021-07-02'),90992);");
		
			if(res==1)
			{
				System.out.println("Inserted record Succesfully....");
			}
			else
			{
				System.out.println("Failed while inserting....");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}