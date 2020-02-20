package com.cap.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDao {
	public static Connection getConnection1()throws ClassNotFoundException, SQLException
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shiva","haishiva499");
		return con;
	}
}
