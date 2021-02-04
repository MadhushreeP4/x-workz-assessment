package com.xworkz.airport.dao;

import com.xworkz.airport.dto.AirportDTO;

public interface AirportDAO {
	
	public void add(AirportDTO dto);
	
	public void add(String name);
	
	public void update(String name,String startPoint);
	
	public void delete(String name);

}
