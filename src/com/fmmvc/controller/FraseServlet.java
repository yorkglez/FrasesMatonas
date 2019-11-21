package com.fmmvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fmmvc.model.Frase;


@WebServlet("/FraseServlet")
public class FraseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Variables declaration
		String contenido = request.getParameter("txtContenido");
		int cantidad = Integer.parseInt(request.getParameter("txtCantidad"));
		String fechaDesde = request.getParameter("txtFechadesde");
		boolean isCreated  = false;

		//Object initialization 
		Frase frase = new Frase();
		
		frase.setContenido(contenido);
		frase.setCantidad(cantidad);
		frase.setFechaDesde(fechaDesde);
		
		//isCreated = frase.Create();
		
		if(isCreated)
		{
			response.sendRedirect("personas.jsp");
		}	
	}

}
