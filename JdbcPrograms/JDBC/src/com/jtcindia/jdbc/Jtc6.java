package com.jtcindia.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.jtcindia.jdbcutil.JDBCUtil;

public class Jtc6 {
	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;

		try {
			con = JDBCUtil.getConnection();			
			String qr2 = "insert into users values(108,'Nitin','Nitin@gmail.com',7999,'Indore')";
			st = con.createStatement();
			int x = st.executeUpdate(qr2);
			if (x == 1) {
				System.out.println("-- Customer record inserted sucessfully --");
			} else {
				System.out.println("-- sorry customer record not inserted --");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("-- Cleaning all the resources --");
			JDBCUtil.cleanup(st, con);
			System.out.println("-- Here we are at the finally block in class Jtc4 --");
		}

	}

}
