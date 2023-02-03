package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public Estudiante buscarporNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_nombre= 'Jimmy'
		//select e from  Estudiante e where e.nombre =:datoNombre
		Query jpqlQuerry=this.entityManager.
				createQuery("select e from  Estudiante e where e.nombre =:datoNombre");
		jpqlQuerry.setParameter("datoNombre", nombre);
		return (Estudiante) jpqlQuerry.getSingleResult();
	}
	@Override
	public Estudiante buscarporApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		Query jpqlQuerry=this.entityManager.
				createQuery("select e from  Estudiante e where e.apellido =:datoApellido");
		jpqlQuerry.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuerry.getSingleResult();
	}
	@Override
	public Estudiante buscarporGenerQuery(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuerry=this.entityManager.
				createQuery("select e from  Estudiante e where e.genero =:datoGenero");
		jpqlQuerry.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuerry.getSingleResult();
	}
	@Override
	public Estudiante buscarporCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuerry=this.entityManager.
				createQuery("select e from  Estudiante e where e.cedula =:datoCedula");
		jpqlQuerry.setParameter("datoCedula", cedula);
		return (Estudiante) jpqlQuerry.getSingleResult();
	}
	@Override
	public Estudiante buscarporCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		Query jpqlQuerry=this.entityManager.
				createQuery("select e from  Estudiante e where e.ciudad =:datoCiudad");
		jpqlQuerry.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuerry.getSingleResult();
	}


	

}
