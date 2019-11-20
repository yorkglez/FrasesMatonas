package com.fmmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fmmvc.model.Persona;

@WebServlet("/PersonaServlet")
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Variables declaration	
		String nombre = request.getParameter("txtNombre");
		String carrera = request.getParameter("txtCarrera");
		byte edad = Byte.parseByte(request.getParameter("txtEdad"));
		boolean isCreated  = false;

		//Object initialization 
		Persona persona = new Persona();

		persona.setNombre(nombre);
		persona.setCarrera(carrera);
		persona.setEdad(edad);
		
		isCreated = persona.Create();
		
		if(isCreated)
		{
			response.sendRedirect("personas.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
