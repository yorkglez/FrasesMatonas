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
import com.fmmvc.model.db.DatabaseManager;
@WebServlet("/PersonaServlet")
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Objects initialization 
		Persona persona = new Persona();
		DatabaseManager databaseManager = new DatabaseManager();
		
		//List declaration
		List<Persona> personList = new ArrayList<>();
		personList = databaseManager.getPersona();
		
		//Send list to jsp
		request.setAttribute("personsList", personList);
		request.getRequestDispatcher("/personas.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Variables declaration	
		String nombre = "";
		String carrera = "";
		byte edad = 0;

		
		nombre = request.getParameter("txtNombre");
		carrera = request.getParameter("txtCarrera");
		edad = Byte.parseByte(request.getParameter("txtEdad"));
		boolean isCreated  = false;

		//Objects initialization 
		Persona persona = new Persona();
		DatabaseManager databaseManager = new DatabaseManager();
		

		persona.setNombre(nombre);
		persona.setCarrera(carrera);
		persona.setEdad(edad);
		
		databaseManager.createPerson(persona);
		//isCreated = persona.Create();
		
		
		if(isCreated)
		{
			response.sendRedirect("personas.jsp");
		}
	}

}
