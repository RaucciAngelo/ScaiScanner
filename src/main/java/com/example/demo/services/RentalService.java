package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.models.Rental;
import com.example.demo.repository.RentalRepo;

@Service
public class RentalService {
	
	@Autowired
	RentalRepo rentalRepo;

	public List<Rental> getAllRental() {
		return rentalRepo.findAll();
	}

	public void saveRental(Rental rental) {
		rentalRepo.save(rental);
			
	}
	
	public void deleteRental(Long id) {
		rentalRepo.deleteById(id);
		
	}
	
	@SuppressWarnings("deprecation")
	public void updateRental(Long id, Rental rental) {
		Rental rentalUser = new Rental();
		rentalUser = rentalRepo.getById(id);
		rentalUser.setCity(rental.getCity());
		rentalUser.setDailyPrice(rental.getDailyPrice());
		rentalUser.setEndTimeDate(rental.getEndTimeDate());
		rentalUser.setLocality(rental.getLocality());
		rentalUser.setNumberOfBags(rental.getNumberOfBags());
		rentalUser.setNumberOfPorts(rental.getNumberOfPorts());
		rentalUser.setNumberOfSeats(rental.getNumberOfSeats());
		rentalUser.setOptional(rental.getOptional());
		rentalUser.setPrenRental(rental.getPrenRental());
		rentalUser.setBuyPrice(rental.getBuyPrice());
		rentalUser.setShift(rental.getShift());
		rentalUser.setStartTimeDate(rental.getStartTimeDate());
		rentalRepo.save(rentalUser);	
	}
}
