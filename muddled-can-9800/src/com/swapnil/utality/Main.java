package com.swapnil.utality;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn=DUtil.provideConnection();
		
		System.out.println(conn);
	}

}
