package com.fmmvc.model.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.Connection;

import com.fmmvc.model.DatabaseUtil;
import com.fmmvc.model.Persona;

public class DatabaseManager
{
	private DatabaseUtil databaseUtil = new DatabaseUtil();
	private Connection conn;
	
	public DatabaseManager()
	{
		this.conn = databaseUtil.getConnection();
	}
	
 	public boolean createPerson(Persona persona)
	{
		PreparedStatement pps = null;
		boolean flag = false;
		try 
		{
			//Sql query
			String sql = "INSERT INTO persona (nombre, edad, carrera) VALUES (?,?,?)";
			//prepare statement
			pps = conn.prepareStatement(sql);
			pps.setString(1, persona.getNombre());
			pps.setInt(2, persona.getEdad());
			pps.setString(3, persona.getCarrera());
			
			//execute query
			pps.executeUpdate();
			flag = true;;
		}
		catch (SQLException e)
		{
	
			e.printStackTrace();
		}
		finally
		{
			//conn.close();
		}
		return flag;
	}
	
	
	/*public boolean createFrase(Frase frase)
	{
		
	}
	
	public boolean createFrasePersona(int idPersona, int idFrase)
	{
		
	}
	

	public List<Frase>()
	{
		
	}*/
 	
	public List getPersona() throws SQLException
	{
		PreparedStatement pps = null;
		String sql = "SELECT * FROM persona";
		//List declaration
		List personasList = new ArrayList<>();
		try 
		{
			//Prepare statement
			pps = conn.prepareStatement(sql);
			ResultSet rs = pps.executeQuery();
			
			while(rs.next())
			{
				Map persona = new HashMap();
				persona.put("id", rs.getString(1));
				persona.put("nombre", rs.getString(2));
				persona.put("carrera", rs.getString(3));
				persona.put("edad", rs.getString(4));
				persona.put("fecha", rs.getString(5));
				
				personasList.add(persona);
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			conn.close();
		}
		
		return personasList;
	}
	
}

