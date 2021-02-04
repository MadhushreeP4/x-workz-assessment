package com.xworkz.airport.dto;

public class AirportDTO {

	private String plane;
	private String id;
	private String startPoint;
	private String destination;

	public AirportDTO() {

		System.out.println("created AirportDTO");
	}

	public AirportDTO(String plane, String id, String startPoint, String destination) {
		super();
		this.plane = plane;
		this.id = id;
		this.startPoint = startPoint;
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "AirportDTO [plane=" + plane + ", id=" + id + ", startPoint=" + startPoint + ", destination="
				+ destination + "]";
	}

	public String getPlane() {
		return plane;
	}

	public void setPlane(String plane) {
		this.plane = plane;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
