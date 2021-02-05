package com.xworkz.airport;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println(" ");
		service1.validAndUpdate("Airlines", "Hubli");
		System.out.println(" ");
		//service1.validAndDelete("Airlines");
		service1.validDisplayByName("Airlines");
		System.out.println(" ");
		
		List<AirportDTO> list2=new ArrayList<AirportDTO>();
		AirportDTO dto3=new AirportDTO("Air India", "zay56", "Mumbai", "Dubai");
		
		System.out.println(service1.validMultipleAdd(list2));

	}

}
