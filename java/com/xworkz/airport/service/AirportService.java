package com.xworkz.airport.service;

import com.xworkz.airport.dto.AirportDTO;

public interface AirportService {
	
	public boolean validAndAdd(AirportDTO dto);
	
	public boolean validAndUpdate(String name,String startPoint);
	
	public boolean validAndDelete(String name);

}
