package com.fmmvc.model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.PreparedStatement;
import java.sql.ResultSet;;

public class Persona 
{
	private String nombre;
	private byte edad;
	private String carrera;

	//Initialize connection
	//DatabaseUtil conn = new DatabaseUtil();
	
	
	/*public ArrayList getPersonas()
	{
		PreparedStatement pps = null;
		String sql = "SELECT * FROM persona";
		//List declaration
		ArrayList personas = new ArrayList();
		try 
		{
			//Prepare statement
			pps = conn.getConnection().prepareStatement(sql);
			ResultSet rs = pps.executeQuery();
			
			while(rs.next())
			{
				Map persona = new HashMap();
				persona.put("id", rs.getString(1));
				persona.put("nombre", rs.getString(2));
				persona.put("carrera", rs.getString(3));
				persona.put("edad", rs.getString(4));
				persona.put("fecha", rs.getString(5));
				
				personas.add(persona);
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			conn.closeConnection();
		}
		
		return personas;
	}
	
	public boolean Create()
	{
		PreparedStatement pps = null;
		boolean flag = false;
		try 
		{
			//Query sql
			String sql = "INSERT INTO persona (nombre,edad,carrera) VALUES (?,?,?)";
			
			//prepare statement
			pps = conn.getConnection().prepareStatement(sql);
			pps.setString(1, nombre);
			pps.setByte(2, edad);
			pps.setString(3, carrera);
			
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
			conn.closeConnection();
		}
		return flag;
	}*/

	/*Getters and Setters*/

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(byte edad) {
		this.edad = edad;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	
	
}
