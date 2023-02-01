package com.example.demo.repository;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {
	public Estudiante buscarporNombre(String nombre);
	public Estudiante buscarporApellido(String apellido);
	public Estudiante buscarporNombreQuery(String nombre);
	public Estudiante buscarporApellidoQuery(String apellido);
}
