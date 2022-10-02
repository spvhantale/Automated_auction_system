package com.swapnil.utality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DUtil {

	
	public static Connection provideConnection() {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/auction";
		try {
			conn=DriverManager.getConnection(url, "root", "4935");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
