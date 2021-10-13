package com.example.demo;

import java.sql.*;

import com.example.demo.utils.DbConnection;

public class UsingTransaction {

	public static void main(String[] args) {

		Connection con = DbConnection.getORacleConnection();
		try {
			con.setAutoCommit(false);
			String sql1="insert into student(rollNumber,studentName,markScored)"
					+ "values(201,'tomm',87)";
			
			PreparedStatement pstmt = con.prepareStatement(sql1);
			
			int rowAdded = pstmt.executeUpdate();
			Savepoint sp1= con.setSavepoint("sp1");
			
			String sql2="insert into student(rollNumber,studentName,markScored)"
					+ "values(204,'jerrry',97)";
			
			PreparedStatement pstmt2 = con.prepareStatement(sql2);
		    pstmt2.executeUpdate();
		    
		    Savepoint sp2= con.setSavepoint("sp2");
			
			
			
			String sql3="insert into student(rollNumber,studentName,markScored)"
					+ "values(206,'spiike',77)";
			
			PreparedStatement pstmt3 = con.prepareStatement(sql3);
			pstmt3.executeUpdate();
			
			Savepoint sp3= con.setSavepoint("sp3");
			
			con.rollback(sp2);
			
			
			con.commit();
			System.out.println("Done");
			
			pstmt3.close();
			pstmt2.close();
			pstmt.close();
			
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
