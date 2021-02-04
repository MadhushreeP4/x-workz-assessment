package com.xworkz.airport.service;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDAOImpl;
import com.xworkz.airport.dto.AirportDTO;

public class AirportServiceImpl implements AirportService {
	
	private AirportDAO dao;

	public AirportServiceImpl() {
		dao=new AirportDAOImpl();
	}

	@Override
	public boolean validAndAdd(AirportDTO dto) {
		System.out.println("invoked validAndAdd");
		if (dto != null) {
			boolean validate = false;
			String plane = dto.getPlane();
			if (plane != null && !plane.isEmpty()) {
				System.out.println("plane name is valid");
				validate = true;
			} else {
				System.out.println("plane name is not valid");
				validate = false;
			}
			if (validate) {
				String startPoint = dto.getStartPoint();
				if (startPoint != null && !startPoint.isEmpty()) {
					System.out.println("start point is valid");
					validate = true;
				} else {
					System.out.println("start point is not valid");
					validate = false;
				}
			}
			if (validate) {
				String id = dto.getId();
				if (id != null && !id.isEmpty() && id.length() <= 7) {
					System.out.println("id is valid");
					validate = true;
				} else {
					System.out.println("id is not valid");
					validate = false;
				}
			}
			if (validate) {
				String destination = dto.getDestination();
				if (destination != null && !destination.isEmpty()) {
					System.out.println("destination is valid");
					validate = true;
				} else {
					System.out.println("destination is invalid");
					validate = false;
				}
			}
			if (validate) {
				System.out.println("dto is valid, can invoke add");
				validate=true;
				dao.add(dto);
				
			}else{
				validate=false;
			}

		}
		return false;
	}

	@Override
	public boolean validAndUpdate(String name, String startPoint) {
		System.out.println("invoked validAndUpdate");
		boolean validate=false;
		if(name!=null && !name.isEmpty()){
			System.out.println("name is valid");
			validate=true;
		}else{
			System.out.println("name is invalid");
			validate=false;
		}
		if(validate){
			if(startPoint!=null && !startPoint.isEmpty()){
				System.out.println("start point is valid");
				validate=true;
			}else{
				System.out.println("start point is invalid");
				validate=false;
			}
		}
		if(validate){
			System.out.println("validation is done can invoke update");
			validate=true;
			dao.update(name, startPoint);
		}else{
			validate=false;
		}
		return false;
	}

	@Override
	public boolean validAndDelete(String name) {
		System.out.println("invoked validAndDelete");
		boolean validate=false;
		if(name!=null && !name.isEmpty()){
			System.out.println("name is valid");
			validate=true;
		}else{
			System.out.println("name is invalid");
			validate=false;
		}
		if(validate){
			System.out.println("validation is done can invoke delete");
			validate=true;
			dao.delete(name);
		}else{
			validate=false;
		}
		return false;
	}

}
