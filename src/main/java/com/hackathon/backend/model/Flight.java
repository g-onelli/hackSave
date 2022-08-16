package com.hackathon.backend.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String airplane;
	@Column
	private String depDate;
	@Column
	private String arrDate;
	@Column
	private String originLoc;
	@Column
	private String destLoc;
	@Column
	private String depTime;
	@Column
	private String arrTime;
	@Column
	private String duration;
	@Column
	private double aFare;
	@Column
	private double cFare;
	@Column
	private Long totalSeat;
	@Column
	private Long claimedSeat;
	
	
	//Constructors
	public Flight() {
		super();
	}


	
	public Flight(String airplane, String depDate, String arrDate, String originLoc, String destLoc, String depTime,
			String arrTime, String duration, double aFare, double cFare, Long totalSeat, Long claimedSeat) {
		super();
		this.airplane = airplane;
		this.depDate = depDate;
		this.arrDate = arrDate;
		this.originLoc = originLoc;
		this.destLoc = destLoc;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.duration = duration;
		this.aFare = aFare;
		this.cFare = cFare;
		this.totalSeat = totalSeat;
		this.claimedSeat = claimedSeat;
	}



	public String getAirplane() {
		return airplane;
	}

	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}
	
	//Getters and Setters
	public String getDepDate() {
		return depDate;
	}

	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}

	public String getArrDate() {
		return arrDate;
	}

	public void setArrDate(String arrDate) {
		this.arrDate = arrDate;
	}

	public String getOriginLoc() {
		return originLoc;
	}

	public void setOriginLoc(String originLoc) {
		this.originLoc = originLoc;
	}

	public String getDestLoc() {
		return destLoc;
	}

	public void setDestLoc(String destLoc) {
		this.destLoc = destLoc;
	}

	public String getDepTime() {
		return depTime;
	}

	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}

	public String getArrTime() {
		return arrTime;
	}

	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getaFare() {
		return aFare;
	}

	public void setaFare(double aFare) {
		this.aFare = aFare;
	}

	public double getcFare() {
		return cFare;
	}

	public void setcFare(double cFare) {
		this.cFare = cFare;
	}

	public Long getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(Long totalSeat) {
		this.totalSeat = totalSeat;
	}

	public Long getClaimedSeat() {
		return claimedSeat;
	}

	public void setClaimedSeat(Long claimedSeat) {
		this.claimedSeat = claimedSeat;
	}

	//ToString Override
	@Override
	public String toString() {
		return "Flight [depDate=" + depDate + ", arrDate=" + arrDate + ", originLoc=" + originLoc + ", destLoc="
				+ destLoc + ", depTime=" + depTime + ", arrTime=" + arrTime + ", duration=" + duration + ", aFare="
				+ aFare + ", cFare=" + cFare + ", totalSeat=" + totalSeat + ", claimedSeat=" + claimedSeat + "]";
	}

}
