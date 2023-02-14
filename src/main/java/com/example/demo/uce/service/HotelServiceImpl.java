package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repo.IHotelRepo;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepo hotelRepo;
	
	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelInnerJoin(tipoHabitacion);
		
	}
	
	@Override
	public List<Hotel> buscarloHotelLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarloHotelLeftJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> bucarHotelRighJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.bucarHotelRighJoin(tipoHabitacion);
		
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
