
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Flight;
import com.example.demo.repository.FlightRepo;

@Service
public class FlightService {

	@Autowired
	private FlightRepo flightRepo;
	
	public List<Flight> getAllFlights(){
		return flightRepo.findAll();
	}
	
	public void saveFlight(Flight flight) {
		flightRepo.save(flight);
	}
	
	public void deleteFlight(Long id) {
		flightRepo.deleteById(id);
	}
	
	@SuppressWarnings("deprecation")						//Se servirà, idk
	public Flight getFlightById(long id) {
		return flightRepo.getById(id);
	}
	
	@SuppressWarnings("deprecation")
	public void update(Long id, Flight flight) {
		Flight updateFlight = new Flight();
		updateFlight = flightRepo.getById(id);
		updateFlight.setDepartureCity(flight.getDepartureCity());
		updateFlight.setDepartureTime(flight.getDepartureTime());
		updateFlight.setArrivalCity(flight.getArrivalCity());
		updateFlight.setArrivalTime(flight.getArrivalTime());
		updateFlight.setFlightCompany(flight.getFlightCompany());
		updateFlight.setSeat(flight.getSeat());
		updateFlight.setBuyPrice(flight.getBuyPrice());
		flightRepo.save(updateFlight);
	}
	
	
}
