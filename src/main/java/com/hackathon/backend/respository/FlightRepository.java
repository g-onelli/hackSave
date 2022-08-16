package com.hackathon.backend.respository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hackathon.backend.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	@Query("select f from Flight f where f.depDate=?1 and f.arrDate=?2 and f.claimedSeat!=f.totalSeat")
	List<Flight> showOpenFlightByDates(String dDate, String aDate);
	
	@Query("select f from Flight f where f.originLoc=?1 and f.destLoc=?2 and f.claimedSeat!=f.totalSeat")
	List<Flight> showOpenFlightByLocation(String origin, String destination);
	
	@Query("select f from Flight f where f.originLoc=?1 and f.destLoc=?2 and f.depDate=?3 and f.arrDate=?4 and f.airplaine=?5 ")
	Flight claimSeat(String origin, String destination,String dDate,String aDate, String air);
	
}
