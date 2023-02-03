package com.example.demo.repository;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {
	
	public Estudiante buscarporNombreQuery(String nombre);
	public Estudiante buscarporApellidoQuery(String apellido);
	public Estudiante buscarporGenerQuery(String genero);
	public Estudiante buscarporCedulaQuery(String cedula);
	public Estudiante buscarporCiudadQuery(String ciudad);
	
}
