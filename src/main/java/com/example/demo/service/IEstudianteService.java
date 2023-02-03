package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	

	public Estudiante encontrarNombre(String nombre);
	public Estudiante encontrarApellido(String apellido);
	public Estudiante encontrarGenero(String genero);
	public Estudiante encontrarcedula(String cedula);
	public Estudiante encontrarCiudad(String ciudad);
	

}
