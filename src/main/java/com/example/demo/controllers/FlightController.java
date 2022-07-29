package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Flight;
import com.example.demo.services.FlightService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@GetMapping("/getAllFlight")
	public List<Flight> getAllFlights(){
		return flightService.getAllFlights();
	}
	
	@PostMapping("/addFlight")
	public void addFlight(@RequestBody Flight flight) {
		flightService.saveFlight(flight);
	}
	
	@DeleteMapping("/deleteFlight/{id}")
	public void deleteFlight(@PathVariable("id") long id) {
		flightService.deleteFlight(id);
	}
	
	@PutMapping("/updateFlight/{id}")
	public void updateFlight(@PathVariable("id") long id, @RequestBody Flight flight) {
		flightService.update(id, flight);
	}
	
	
}