package com.example.demo.repository;

import org.springframework.stereotype.Repository;


import com.example.demo.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vehiculo.class, id);
	}

	@Override
	public Vehiculo buscarPlaca(String placa) {
		// TODO Auto-generated method stub
		Query jpqlQuerry=this.entityManager.
				createQuery("select e from  Vehiculo e where e.placa =:datoPlaca");
		jpqlQuerry.setParameter("datoPlaca", placa);
		return (Vehiculo) jpqlQuerry.getSingleResult();
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Vehiculo vehi = this.buscar(id);
		this.entityManager.remove(vehi);
	
		
	}

}
