package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.*;
import com.example.demo.repository.*;

@Service
public class PrenotationRentalService {

	@Autowired
	PrenotationRentalRepo prenotationRentalRepo;

	@Autowired
	RentalRepo rentalRepo;

	@Autowired
	PrenotationRepo prenotationRepo;

	public List<PrenotationRental> getAllPrenotationRental() {
		return prenotationRentalRepo.findAll();
	}
	
	public PrenotationRental getPrenotationRentalById(Long id) {
		return prenotationRentalRepo.getReferenceById(id);
	}

	public void addPrenotationRental(Long idPrenotation, Long idRental, double buyPrice) {
		Rental rental = rentalRepo.getReferenceById(idRental);
		Prenotation prenotation = prenotationRepo.getReferenceById(idPrenotation);

		PrenotationRental prenotationRental = new PrenotationRental(rental, prenotation, buyPrice);
		prenotationRentalRepo.save(prenotationRental);
	}

	public void deletePrenotationRental(Long id) {
		prenotationRentalRepo.deleteById(id);
	}

	public void updatePrenotationRental(Long id, Long idPrenotation, Long idRental, double buyPrice) {
		Rental rental = rentalRepo.getReferenceById(idRental);
		Prenotation prenotation = prenotationRepo.getReferenceById(idPrenotation);

		PrenotationRental updatePrenotationRental = new PrenotationRental();
		updatePrenotationRental = prenotationRentalRepo.getReferenceById(id);
		updatePrenotationRental.setRental(rental);
		updatePrenotationRental.setPrenotation(prenotation);
		updatePrenotationRental.setBuyPrice(buyPrice);
		prenotationRentalRepo.save(updatePrenotationRental);
	}

	

}
