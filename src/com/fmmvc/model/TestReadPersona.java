package com.fmmvc.model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.util.List;

import org.junit.Test;
import com.fmmvc.model.DatabaseUtil;
import com.fmmvc.model.db.DatabaseManager;

public class TestReadPersona 
{

	@Test
	public void testReadPersona()
	{
		//Connection conn = DatabaseUtil.getConnection();
		DatabaseManager dbManager = new DatabaseManager();
		///assertNotNull();
		List<Persona> list = dbManager.getPersona();
		assertNotNull("No se consultaron los datos",list);
		assertTrue(list.size() > 0);
		
	}
}
