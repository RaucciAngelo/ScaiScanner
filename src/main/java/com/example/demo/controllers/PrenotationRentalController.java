package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.PrenotationRental;
import com.example.demo.services.PrenotationRentalService;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/prenotationRental")
public class PrenotationRentalController {

	@Autowired
	private PrenotationRentalService prenotationRentalService;

	@GetMapping("/getAllPrenotationRental")
	public List<PrenotationRental> getAllPrenotationRental() {
		return prenotationRentalService.getAllPrenotationRental();
	}

	@GetMapping("/getPrenotationRentalById/{id}")
	public PrenotationRental getPrenotationRentalById(@PathVariable("id") Long id) {
		return prenotationRentalService.getPrenotationRentalById(id);
	}

	@PostMapping("/addPrenotationRental/{idPrenotation}/{idRental}")
	public void addPrenotationRental(@PathVariable("idPrenotation") Long idPrenotation, @PathVariable("idRental") Long idRental , @RequestBody double buyPrice) {
		prenotationRentalService.addPrenotationRental(idPrenotation, idRental, buyPrice);
	}

	@DeleteMapping("/deletePrenotationRental/{id}")
	public void deletePrenotationRental(@PathVariable("id") Long id) {
		prenotationRentalService.deletePrenotationRental(id);
	}

	@PutMapping("/updatePrenotationRental/{idPrenotationRental}/{idPrenotation}/{idRental}")
	public void updatePrenotationRental(@PathVariable("idPrenotationRental") Long idPrenotationRental, @PathVariable("idPrenotation") Long idPrenotation, @PathVariable("idRental") Long idRental , @RequestBody double buyPrice) {
		prenotationRentalService.updatePrenotationRental(idPrenotationRental, idPrenotation, idRental, buyPrice);
	}
	
}
