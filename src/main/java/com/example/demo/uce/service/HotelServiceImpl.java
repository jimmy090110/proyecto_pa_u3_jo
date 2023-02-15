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
	public List<Hotel> buscarloHotelJoinFech(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarloHotelJoinFech(tipoHabitacion);
	}



	@Override
	public List<Hotel> buscarHotelOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterLeftJoin();
	}

	@Override
	public List<Hotel> buscarHotelOuterRigtJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterRigtJoin();
	}

	@Override
	public List<Hotel> buscarHotelOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterFullJoin();
	}

	

}
