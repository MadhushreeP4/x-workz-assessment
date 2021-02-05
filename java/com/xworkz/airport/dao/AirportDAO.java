package com.xworkz.airport.dao;

import java.util.List;

import com.xworkz.airport.dto.AirportDTO;

public interface AirportDAO {
	
	public void add(AirportDTO dto);
	
	public void update(String name,String startPoint);
	
	public void delete(String name);
	
	public boolean multipleAdd(List<AirportDTO> lists);
	
	public void getAll();
	
	public void displayByName(String name);

}
