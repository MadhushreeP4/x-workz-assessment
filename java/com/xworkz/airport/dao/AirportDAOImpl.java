package com.xworkz.airport.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.airport.dto.AirportDTO;

public class AirportDAOImpl implements AirportDAO {

	private List<AirportDTO> lists;

	public AirportDAOImpl() {
		lists = new ArrayList<AirportDTO>();
	}

	@Override
	public void add(AirportDTO dto) {
		System.out.println("Invoked add with dto type");
		if (dto != null) {
			System.out.println("dto is not null, can add to lists");
			lists.add(dto);
			System.out.println(dto);
		} else {
			System.out.println("dto is null");
		}
	}

	@Override
	public void add(String name) {
		System.out.println("Invoked add with String type");
		/*
		 * if(name!=null){
		 * System.out.println("name is not null, can add to lists");
		 * lists.add(name); System.out.println(name); }else{
		 * System.out.println("name is not null"); }
		 */

	}

	private boolean name(String name) {
		for (AirportDTO airportDTO : lists) {
			if (airportDTO.getPlane().equals(name)) {
				System.out.println("plane is already in list");
				return true;
			}
		}
		return false;
	}

	@Override
	public void update(String name, String startPoint) {

		System.out.println("invoked update");

		if (name != null) {
			System.out.println("name is not null");
			for (AirportDTO airportDTO : lists) {
				String plane = airportDTO.getPlane();
				if (plane.equals(name)) {
					System.out.println("plane before update: " + airportDTO.getStartPoint());
					airportDTO.setStartPoint(startPoint);
					System.out.println("plane after update: " + airportDTO.getStartPoint());
				}
			}
		}

	}

	

	@Override
	public void delete(String name) {
		System.out.println("invoked delete");
		if (name != null) {
			Iterator<AirportDTO> iterator = lists.iterator();
			while (iterator.hasNext()) {
				AirportDTO dto = iterator.next();
				if (dto != null && dto.getPlane().equals(name)) {
					System.out.println("plane is in list can delete");
					iterator.remove();
				}
			}
		}

	}

}
