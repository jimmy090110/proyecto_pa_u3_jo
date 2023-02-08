package com.example.demo.uce.repo;

import java.util.List;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public void insertar(Estudiante estudiante);
	//Typed Query
	public Estudiante buscarPorNombreTypedQuery(String nombre);
	//Named Query
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	//Name Typed Query
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	//Native Query
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	//Query Typed Named
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
	
	/*
	public List<Estudiante> buscarPorNombreQueryList(String nombre);
	public List<Estudiante> buscarPorNombreQueryList2(String nombre);
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre);
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);
	 */

	
	
}
