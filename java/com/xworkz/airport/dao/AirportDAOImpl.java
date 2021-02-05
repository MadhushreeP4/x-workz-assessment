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

	@Override
	public boolean multipleAdd(List<AirportDTO> lists) {
		System.out.println("invoked multipleAdd");

		return this.lists.addAll(lists);

	}

	@Override
	public void getAll() {

		System.out.println("invoked getAll");
		System.out.println(this.lists);

	}

	@Override
	public void displayByName(String name) {
		System.out.println("invoked displayByName");
		if (name != null) {
			for (AirportDTO airportDTO : lists) {
				String planeName = airportDTO.getPlane();
				if(planeName.equals(name)){
					System.out.println(airportDTO);
				}else{
					System.out.println("names are not equal");
				}
				
			}
		}else{
			System.out.println("name is null");
		}

	}

}
