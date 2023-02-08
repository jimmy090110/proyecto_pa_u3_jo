package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.repo.IEstudianteRepo;
@Service
public class EstudianteServiceImpl implements IEstudianteService{
	@Autowired
	private IEstudianteRepo iEstudianteRepo;
	@Override
	public Estudiante buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreQuery(nombre);
	}

	@Override
	public Estudiante buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorApellidoQuery(apellido);
	}

	@Override
	public void crear(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteRepo.insertar(estudiante);
	}


	@Override
	public Estudiante buscarPorNombreTypedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreTypedQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreNamedQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreNamedQueryTyped(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreNativeQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreNativeQueryTypedNamed(nombre);
	}
	/*
	@Override
	public List<Estudiante> buscarPorNombreTypedQueryList(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreQueryList(nombre);
	}

	@Override
	public List<Estudiante> buscarPorNombreTypedQueryList2(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreQueryList2(nombre);
	}
	*/




}
