package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.dto.EstudianteDTO;

public interface IEstudianteService {

	// Consulta un solo estudiante

	public void insertar(Estudiante estudiante);

	public Estudiante buscarPorNombre(String nombre);

	public Estudiante buscarPorNombreTypeQuery(String nombre);

	public Estudiante buscarPorApellidoNamedQuery(String apellido);

	public Estudiante buscarPorApellidoNamedQueryTyped(String apellido);

	public Estudiante buscarPorNombreNativeQuery(String nombre);

	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);

	public Estudiante buscarPorApellido(String apellido);

	public Estudiante buscarPorGenero(String genero);

	public Estudiante buscarPorCedula(String cedula);

	public Estudiante buscarPorCiudad(String ciudad);

	// Obtener el primero

	public Estudiante buscarPorNombreFirst(String genero);

	// Devuelven una lista de estudiantes

	public List<Estudiante> buscarPorNombreQueryList(String Genero);

	public List<Estudiante> buscarPorApellidoNamedQueryTypedList(String apellido);

	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);

	// DTO
	public EstudianteDTO buscarPorNombreTypeQueryDTO(String nombre);

	// Criteria
	public Estudiante buscarPorNombreCriteria(String nombre);

	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String bandera);
	
	
	public int eliminarPorApellido(String apellido);
	
	public int actualizarPorApellido(String apellido, String nombre);

}