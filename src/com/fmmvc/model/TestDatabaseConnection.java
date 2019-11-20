package com.fmmvc.model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;
public class TestDatabaseConnection 
{
	@Test
	public void testConnection()
	{
		Connection connection = DatabaseUtil.getConnection();
		assertNotNull("Error!",connection);
		try 
		{
			connection.close();
			assertTrue(connection.isClosed());
		} catch (SQLException e) 
		{
		}
	}
}
