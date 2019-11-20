package com.fmmvc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fmmvc.model.DatabaseUtil;

public class Frase {

	private String contenido;
	private String fechaDesde;
	private int cantidad; 
	private PreparedStatement pps = null;
	

	//Initialize connection
	DatabaseUtil conn = new DatabaseUtil();
	
	public boolean Create()
	{
		boolean flag = false;
		try 
		{
			//Query sql
			String sql = "INSERT INTO frase (contenido,cantidad,fechaDesde) VALUES (?,?,?)";
			
			//prepare statement
			pps = conn.getConnection().prepareStatement(sql);
			pps.setString(1, contenido);
			pps.setInt(2, cantidad);
			pps.setString(3, fechaDesde);
			
			//execute query
			pps.executeUpdate();
			flag = true;
			
			//Close connection
		//	conn.closeConnection();
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
	}
	
	public ArrayList getFrases()
	{
		PreparedStatement pps = null;
		String sql = "SELECT * FROM frases";
		//List declaration
		ArrayList frases = new ArrayList();
		try 
		{
			//Prepare statement
			pps = conn.getConnection().prepareStatement(sql);
			ResultSet rs = pps.executeQuery();
			
			while(rs.next())
			{
				Map persona = new HashMap();
				persona.put("id", rs.getString(1));
				persona.put("contenido", rs.getString(2));
				persona.put("canditad", rs.getString(3));
				persona.put("fechadesde", rs.getString(4));
				persona.put("fecha", rs.getString(5));
				
				frases.add(persona);
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
		
		return frases;
	}
	
	//Getters and Setters
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}




