package com.xworkz.airport.service;

import java.util.List;

import com.xworkz.airport.dto.AirportDTO;

public interface AirportService {
	
	public boolean validAndAdd(AirportDTO dto);
	
	public boolean validAndUpdate(String name,String startPoint);
	
	public boolean validAndDelete(String name);
	
	public boolean validDisplayByName(String name);
	
	public boolean validMultipleAdd(List<AirportDTO> lists);

}
