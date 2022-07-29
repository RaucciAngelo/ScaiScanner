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

import com.example.demo.models.Lodging;
import com.example.demo.services.LodgingService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class LodgingController {
	
	@Autowired
	private LodgingService lodgingService;
	
	@GetMapping("/getAllLodging")
	public List<Lodging> getAllLodging() {
		return lodgingService.getAllLodging();
	}

	@PostMapping("/addLodging")
	public void addLodging(@RequestBody Lodging lodging) {
		lodgingService.saveLodging(lodging);
	}

	@DeleteMapping("/deleteLodging/{​​​​​​id}​​​​​​")
	public void deleteLodging(@PathVariable("id") Long id) {
		lodgingService.deleteLodging(id);
	}

	@PutMapping("/updateLodging/{​​​​​​id}​​​​​​")
	public void updateLodging(@PathVariable("id") Long id, @RequestBody Lodging lodging) {
		lodgingService.updateLodging(id, lodging);
	}

}
