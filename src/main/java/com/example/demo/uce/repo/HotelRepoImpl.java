package com.example.demo.uce.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel>myQuery=this.entityManager.createQuery("select h from Hotel h inner join h.habitacion ha where ha.tipo=:datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		//Bajo demanda
		List<Hotel>listaHoteles=myQuery.getResultList();
		for (Hotel hotel : listaHoteles) {
			hotel.getHabitacion().size();
		}
		return myQuery.getResultList();
		
		
	}
	@Override
	public List<Hotel> buscarloHotelLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel>myQuery=this.entityManager.createQuery("select h from Hotel h left join h.habitacion ha where ha.tipo=:datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		//Bajo demanda
		List<Hotel>listaHoteles=myQuery.getResultList();
		for (Hotel hotel : listaHoteles) {
			List<Habitacion> ListaTmp= new ArrayList<>();
			//for(Habitacion ha: h. ) {
				
			
		}
		return myQuery.getResultList();
	}
	@Override
	public List<Hotel> bucarHotelRighJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel>myQuery=this.entityManager.createQuery("select h from Hotel h righ join h.habitacion ha where ha.tipo=:datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		//Bajo demanda
		List<Hotel>listaHoteles=myQuery.getResultList();
		//for (Hotel hotel : listaHoteles) {
			//hotel.getHabitacion().size();
		//}
		return myQuery.getResultList();
	}
	@Override
	public List<Hotel> buscarHotelFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Hotel> buscarHotelOuterJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
