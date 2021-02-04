package com.xworkz.airport;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDAOImpl;
import com.xworkz.airport.dto.AirportDTO;

public class AirportTester {

	public static void main(String[] args) {
		
		AirportDTO dto1=new AirportDTO("Airlines", "44ma5", "Bangalore", "Delhi");
		
		AirportDAO dao1=new AirportDAOImpl();
		dao1.add(dto1);
		//dao1.add("Bangalore Airport");
		dao1.update("Airlines","Hubli");
		dao1.delete("KingFisher");

	}

}
