package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudainteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public Estudiante buscarporNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_nombre= 'Jimmy'
		//select e from  Estudiante e where e.nombre =:datoNombre
		Query jpqlQuerry=this.entityManager.
				createQuery("select e from  Estudiante e where e.nombre =:datoNombre");
		jpqlQuerry.setParameter("datoNombre", jpqlQuerry);
		return (Estudiante) jpqlQuerry.getSingleResult();
	}
	@Override
	public Estudiante buscarporApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Estudiante buscarporNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Estudiante buscarporApellido(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
