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

import com.example.demo.models.Prenotation;
import com.example.demo.services.PrenotationService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/prenotation")
public class PrenotationController {

	@Autowired
	private PrenotationService prenservice;

	@GetMapping("/getAllPrenotation")
	public List<Prenotation> getAllPrenotation() {
		return prenservice.getAllPrenotation();
	}

	@PostMapping("/addPrenotation/{idUser}/{idReview}")
	public void add(@PathVariable("idUser") Long idUser, @PathVariable("idReview") Long idReview) {
		prenservice.save(idUser, idReview);

	}

	@DeleteMapping("/deletePrenotation/{id}")
	public void delete(@PathVariable("id") Long id) {
		prenservice.delete(id);
	}

	@PutMapping("/updatePrenotation/{idPrenotation}/{idUser}/{idReview}")
	public void update(@PathVariable("idPrenotation") Long idPrenotation, @PathVariable("idUser") Long idUser, @PathVariable("idReview") Long idReview) {
		prenservice.update(idPrenotation, idUser, idReview);
	}
}