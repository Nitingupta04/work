package com.jtcindia.jdbcutilall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtill {
	
	// step -1
	public static Connection getConnection() {

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/custdb";
			String user = "root";
			String pass = "System@123";
			
			con = DriverManager.getConnection(url,user, pass);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	// step -2
	public static void cleanup(Statement st, Connection con, ResultSet rs) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void cleanup(Statement st, Connection con) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
