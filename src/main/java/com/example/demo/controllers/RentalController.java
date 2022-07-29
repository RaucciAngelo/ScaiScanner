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


import com.example.demo.models.Rental;
import com.example.demo.services.RentalService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class RentalController {
	
	@Autowired
	private RentalService rentalService;

	@GetMapping("/getAllRental")
	public List<Rental> getAllRental() {
		return rentalService.getAllRental();
	}

	@PostMapping("/addRental")
	public void addRental(@RequestBody Rental rental) {
		rentalService.saveRental(rental);
	}

	@DeleteMapping("/deleteRental/{​​​​​​id}​​​​​​")
	public void deleteRental(@PathVariable("id") Long id) {
		rentalService.deleteRental(id);
	}

	@PutMapping("/updateRental/{​​​​​​id}​​​​​​")
	public void updateRental(@PathVariable("id") Long id, @RequestBody Rental rental) {
		rentalService.updateRental(id, rental);
	}
}

