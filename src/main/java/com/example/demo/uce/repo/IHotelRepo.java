package com.example.demo.uce.repo;

import java.util.List;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;

public interface IHotelRepo {
	
	public List<Hotel>buscarHotelInnerJoin(String tipoHabitacion);
	public List<Hotel>buscarloHotelJoinFech(String tipoHabitacion);
	//public List<Hotel>bucarHotelRighJoin(String tipoHabitacion);
	//public List<Hotel>buscarHotelFullJoin(String tipoHabitacion);
	//public List<Hotel>buscarHotelOuterJoin(String tipoHabitacion);

	//
	
	public List<Hotel>buscarHotelOuterLeftJoin();
	public List<Hotel>buscarHotelOuterRigtJoin();
	public List<Hotel>buscarHotelOuterFullJoin();
}
