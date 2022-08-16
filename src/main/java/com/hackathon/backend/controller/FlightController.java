package com.hackathon.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.backend.Dto.FlightClaimDto;
import com.hackathon.backend.model.Flight;
import com.hackathon.backend.respository.FlightRepository;

@RestController
//@CrossOrigin(origins="http:localhost:8080")
public class FlightController {
	@Autowired
	private FlightRepository flightRepository;
	
	@PostMapping("/flight/add")
	public void addFlight(@RequestBody Flight flight) {
		flightRepository.save(flight);
	}
	
	@GetMapping("/flight/date")
	public List<Flight>showOpenFlightsDate(@RequestParam(name="dDate") String dDate, 
			@RequestParam(name="aDate") String aDate) {
		List<Flight> flightList = flightRepository.showOpenFlightByDates(dDate, aDate);
		return flightList;
	}
	
	@GetMapping("/flight/location")
	public List<Flight>showOpenFlightsLoc(@RequestParam(name="oLoc") String oLoc, 
			@RequestParam(name="dLoc") String dLoc){
		List<Flight> flightList = flightRepository.showOpenFlightByLocation(oLoc, dLoc);
		return flightList;
	}
	
	@PutMapping("/flight/claim")
	public void claimOpenSeat(@RequestBody FlightClaimDto flightClaim) {
		//String origin, String destination,String dDate,String aDate, String air
		Flight flight = flightRepository.claimSeat(flightClaim.getOrigin(),flightClaim.getDestination(),flightClaim.getDepDate(),flightClaim.getArrDate(),flightClaim.getAirplane());
		flight.setClaimedSeat(flight.getClaimedSeat()+flightClaim.getSeats());
		flightRepository.save(flight);
	}
}
