package co.sql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.util.ConnectionUtil;

public class PrepareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection con = ConnectionUtil.getConnection();
			LocalDate date=LocalDate.now();
			java.sql.Date mydate=java.sql.Date.valueOf(date);
			PreparedStatement pstmt=con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?)");
			
			pstmt.setInt(1, 100);
			pstmt.setString(2, "raj");
			pstmt.setString(3, "Joshi");
			pstmt.setString(4, "raj@gmail.com");
			pstmt.setInt(5, 764674);
			pstmt.setDate(6, mydate);
			pstmt.setInt(7, 22444);
			
			int res=pstmt.executeUpdate();
			System.out.println("No of records get inserted"+res);
			
			
			  CallableStatement cstmt=con.prepareCall("{call DeleteRecord(?)}");
			  cstmt.setInt(1, 3234); cstmt.execute();
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
