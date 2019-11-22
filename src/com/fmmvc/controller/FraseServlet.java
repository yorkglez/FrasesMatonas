package com.fmmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fmmvc.model.Frase;
import com.fmmvc.model.db.DatabaseManager;


@WebServlet("/FraseServlet")
public class FraseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Objects initialization 
		Frase frase = new Frase();
		DatabaseManager databaseManager = new DatabaseManager();
		
		//List declaration
		List<Frase> fraseList = new ArrayList<>();
		fraseList = databaseManager.getFrase();
		
		//Send list to jsp
		request.setAttribute("fraseList", fraseList);
		request.getRequestDispatcher("/frases.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Variables declaration
		String contenido = request.getParameter("txtContenido");
		int cantidad = Integer.parseInt(request.getParameter("txtCantidad"));
		String fechaDesde = request.getParameter("txtFechadesde");
		boolean isCreated  = false;

		//Objects initialization 
		Frase frase = new Frase();
		DatabaseManager databaseManager = new DatabaseManager();
		
		frase.setContenido(contenido);
		frase.setCantidad(cantidad);
		frase.setFechaDesde(fechaDesde);
					
		databaseManager.createFrase(frase);

		
	}

}
