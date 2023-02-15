package com.example.demo.uce.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HabitacionRepoImpl implements IHabitacionRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	


	@Override
	public List<Habitacion> buscarHabitacionOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion>myQuery=this.entityManager.createQuery(
				"select h from Hotel h left join h.habitacion ha where ha.tipo=:datoTipo", Habitacion.class);
	List<Habitacion>lista=myQuery.getResultList();
		return myQuery.getResultList();
	}

	@Override
	public List<Habitacion> buscarHabitacionOuterRigtJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion>myQuery=this.entityManager.createQuery(
				"select h from Hotel h rigt join h.habitacion ha where ha.tipo=:datoTipo", Habitacion.class);
	List<Habitacion>lista=myQuery.getResultList();
		return myQuery.getResultList();
	}

	@Override
	public List<Habitacion> buscarHabitacionOuterFullJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion>myQuery=this.entityManager.createQuery(
				"select h from Hotel h full join h.habitacion ha where ha.tipo=:datoTipo", Habitacion.class);
	List<Habitacion>lista=myQuery.getResultList();
		return myQuery.getResultList();
	}
	

}
