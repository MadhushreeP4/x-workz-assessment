package com.xworkz.airport;

import com.xworkz.airport.dto.AirportDTO;
import com.xworkz.airport.service.AirportService;
import com.xworkz.airport.service.AirportServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {
		
		AirportDTO dto1=new AirportDTO("Airlines", "44ma5", "Bangalore", "Delhi");
		AirportDTO dto2=new AirportDTO("Airways", "44ma5", "Bangalore", "Delhi");
		
		AirportService service1=new AirportServiceImpl();
		service1.validAndAdd(dto1);
		service1.validAndAdd(dto2);
		service1.validAndUpdate("Airlines", "Hubli");
		service1.validAndDelete("Airlines");

	}

}
