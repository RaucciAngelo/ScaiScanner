package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Prenotation;
import com.example.demo.repository.PrenotationRepo;

@Service
public class PrenotationService {

	@Autowired
	private PrenotationRepo prenRepo;

	public List<Prenotation> getAllPrenotation() {
		return prenRepo.findAll();
	}

	public void save(Prenotation prenotation, Long id) {
		prenRepo.save(prenotation);
	}

	public void delete(Long id) {
		prenRepo.deleteById(id);
	}

	public void update(Long id, Prenotation prenotation) {
		Prenotation update = new Prenotation();
		update = prenRepo.getReferenceById(id);
		update.setReview(update.getReview());
		update.setUser(update.getUser());
		prenRepo.save(update);

	}

}
