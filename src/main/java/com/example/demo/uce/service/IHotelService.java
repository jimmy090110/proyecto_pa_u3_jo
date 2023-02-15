package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelService {
	
	public List<Hotel>buscarHotelInnerJoin(String tipoHabitacion);
	public List<Hotel>buscarloHotelJoinFech(String tipoHabitacion);
;
	
	
	public List<Hotel>buscarHotelOuterLeftJoin();
	public List<Hotel>buscarHotelOuterRigtJoin();
	public List<Hotel>buscarHotelOuterFullJoin();

}
