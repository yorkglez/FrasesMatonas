package com.fmmvc.model.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;

import com.fmmvc.model.DatabaseUtil;
import com.fmmvc.model.Frase;
import com.fmmvc.model.Persona;

public class DatabaseManager 
{
	private DatabaseUtil databaseUtil = new DatabaseUtil();
	private Connection conn;
	
	public DatabaseManager()
	{
		this.conn = databaseUtil.getConnection();
	}
	
	public boolean updatePersona(Persona persona)
	{
		PreparedStatement pps = null;
		boolean flag = false;
		try 
		{
			//Sql query
			String sql = "UPDATE persona SET nombre = ?, edad = ?, carrera = ? WHERE idPersona = ?";
			//prepare statement
			pps = conn.prepareStatement(sql);
			pps.setString(1, persona.getNombre());
			pps.setInt(2, persona.getEdad());
			pps.setString(3, persona.getCarrera());
			pps.setInt(4, persona.getId());
			
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
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
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
			databaseUtil.closeConnection();
		}
		return flag;
	}

	public List<Persona> getPersona() 
	{
		PreparedStatement pps = null;
		String sql = "SELECT * FROM persona";
		//List declaration
		List<Persona> personasList = new ArrayList<>();
		
		try 
		{
			//Prepare statement
			pps = conn.prepareStatement(sql);
			ResultSet rs = pps.executeQuery();
			
			while(rs.next())
			{
				//Object declaration
				Persona persona = new Persona();
				//Set data to object
				persona.setNombre(rs.getString(2));
				persona.setCarrera(rs.getString(3));
				persona.setEdad(rs.getByte(4));
				
				//Add object to list
				personasList.add(persona);
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return personasList;
	}
	
	public boolean createFrase(Frase frase)
	{
		PreparedStatement pps = null;
		boolean flag = false;
		try 
		{
			//Query sql
			String sql = "INSERT INTO frase (contenido,cantidad,fechaDesde) VALUES (?,?,?)";
			
			//prepare statement
			pps = conn.prepareStatement(sql);
			pps.setString(1, frase.getContenido());
			pps.setInt(2, frase.getCantidad());
			pps.setDate(3,Date.valueOf(frase.getFechaDesde()));
			
			//execute query
			pps.executeUpdate();
			flag = true;
					}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			databaseUtil.closeConnection();
		}
		return flag;
	}
	
	public boolean updateFrase(Frase frase)
	{
		PreparedStatement pps = null;
		boolean flag = false;
		try 
		{
			//Query sql
			String sql = "UPDATE frase set contenido = ?, cantidad = ?, fechaDesde = ? WHERE idFrase = ?";
			
			//prepare statement
			pps = conn.prepareStatement(sql);
			pps.setString(1, frase.getContenido());
			pps.setInt(2, frase.getCantidad());
			pps.setDate(3,Date.valueOf(frase.getFechaDesde()));
			
			//execute query
			pps.executeUpdate();
			flag = true;
					}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			databaseUtil.closeConnection();
		}
		return flag;
	}
	
	public boolean createFrasePersona(int Persona, int idFrase)
	{
		return false;
	}
	
	public List<Frase> getFrase()
	{
		PreparedStatement pps = null;
		String sql = "SELECT * FROM frase";
		//List declaration
		List<Frase> fraseList = new ArrayList<>();
		
		try 
		{
			//Prepare statement
			pps = conn.prepareStatement(sql);
			ResultSet rs = pps.executeQuery();
			
			while(rs.next())
			{
				//Object declaration
				Frase frase = new Frase();
				//Set data to object
				frase.setId(rs.getInt(1));
				frase.setContenido(rs.getString(2));
				frase.setCantidad(rs.getInt(3));
				frase.setFechaDesde(rs.getString(4));
				
				//Add object to list
				fraseList.add(frase);
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			//conn.close();
			
		}
		
		return fraseList;
	}
 	
}

