package com.fmmvc.model;
import java.sql.*;
public class DatabaseUtil 
{
	//Connection declaration
	private static Connection conn = null;	
	private static final String URL_FORMAT = "jdbc:%s://%s:%s/%s"
											+"?useUnicode=true"
											+"&useJDBCCompliantTimezoneShift=true"
											+"&useLegacyDatetimeCode=false"
											+"&serverTimezone=UTC";
	
	public static Connection getConnection()
	{
		//Variables declaration 
		String dbms ="mysql";
		String host = "localhost";
		String port = "3306";
		String database = "frasesmatonas_db";
		String user = "root";
		String password = "root";	
		String url = String.format(URL_FORMAT,dbms,host,port,database);
				
		//
		try {
			//Close connection if is connected
			if(!conn.isClosed())
			{
				closeConnection();
			}
			//Driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/frasesmatonas_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", user, password);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void closeConnection()
	{
		try 
		{
			conn.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
