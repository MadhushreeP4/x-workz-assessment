package com.xworkz.airport;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDAOImpl;
import com.xworkz.airport.dto.AirportDTO;

public class AirportTester {

	public static void main(String[] args) {
		
		AirportDTO dto1=new AirportDTO("Airlines", "44ma5", "Bangalore", "Delhi");
		
		AirportDTO dto2=new AirportDTO("Air Asia", "ma45z", "Mumbai", "Hubli");

		AirportDAO dao1=new AirportDAOImpl();
		dao1.add(dto1);
		dao1.add(dto2);
		System.out.println(" ");
		//dao1.add("Bangalore Airport");
		dao1.update("Airlines","Hubli");
		System.out.println(" ");
		dao1.delete("KingFisher");
		System.out.println(" ");
		dao1.displayByName("Airlines");
		System.out.println(" ");
		dao1.getAll();
		System.out.println(" ");
		
		List<AirportDTO> list2=new ArrayList<AirportDTO>();
		AirportDTO dto3=new AirportDTO("Air India", "zay56", "Mumbai", "Dubai");
		list2.add(dto3);
		
		System.out.println(dao1.multipleAdd(list2));
		dao1.getAll();

	}

}
