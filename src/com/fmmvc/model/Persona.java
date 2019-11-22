package com.fmmvc.model;

public class Persona 
{
	private int id;
	private String nombre;
	private int edad;
	private String carrera;
	private String date;

	
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


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
