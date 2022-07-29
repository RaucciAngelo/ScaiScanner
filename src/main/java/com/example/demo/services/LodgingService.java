package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Lodging;
import com.example.demo.repository.LodgingRepo;

@Service
public class LodgingService {
	
	@Autowired
	private LodgingRepo lodgingRepo;
	
	public List<Lodging> getAllLodging() {
		return lodgingRepo.findAll();
	}

	public void saveLodging(Lodging lodging) {
		lodging = new Lodging(lodging.getNameHotel(), lodging.getLocation(), lodging.getVote(), lodging.getStars(), lodging.getTipology(), lodging.getCheckIn(), lodging.getCheckOut(), lodging.getServices(), lodging.getAvailability(), lodging.getDescription(), lodging.getPrice(), lodging.getCity());
		lodgingRepo.save(lodging);
	}

	public void deleteLodging(Long id) {
		lodgingRepo.deleteById(id);
	}

	public void updateLodging(Long id, Lodging lodging) {
		Lodging updateLodging = new Lodging();
        updateLodging = lodgingRepo.getReferenceById(id);
        updateLodging.setNameHotel(lodging.getNameHotel());
        updateLodging.setLocation(lodging.getLocation());
        updateLodging.setVote(lodging.getVote());
        updateLodging.setStars(lodging.getStars());
        updateLodging.setTipology(lodging.getTipology());
        updateLodging.setCheckIn(lodging.getCheckIn());
        updateLodging.setCheckOut(lodging.getCheckOut());
        updateLodging.setServices(lodging.getServices());
        updateLodging.setAvailability(lodging.getAvailability());
        updateLodging.setDescription(lodging.getDescription());
        updateLodging.setPrice(lodging.getPrice());
        updateLodging.setCity(lodging.getCity());
        lodgingRepo.save(updateLodging);
	}

}

