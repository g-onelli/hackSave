package com.hackathon.backend.Dto;

public class FlightClaimDto {
	private String origin;
	private String destination;
	private String depDate;
	private String arrDate;
	private Long seats;
	private String airplane;
	
	
	
	public FlightClaimDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


	public FlightClaimDto(String origin, String destination, String depDate, String arrDate, Long seats,
			String airplane) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.depDate = depDate;
		this.arrDate = arrDate;
		this.seats = seats;
		this.airplane = airplane;
	}





	public String getArrDate() {
		return arrDate;
	}





	public void setArrDate(String arrDate) {
		this.arrDate = arrDate;
	}





	public String getAirplane() {
		return airplane;
	}
	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepDate() {
		return depDate;
	}
	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}
	public Long getSeats() {
		return seats;
	}
	public void setSeats(Long seats) {
		this.seats = seats;
	}
	
	
}
