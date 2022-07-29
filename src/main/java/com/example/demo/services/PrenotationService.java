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
		// TODO Auto-generated method stub
		return prenRepo.findAll();
	}

	public void save(Prenotation prenotation, Long id) {
		prenRepo.save(prenotation);
	}

	public void delete(Long id) {
		prenRepo.deleteById(id);
	}

	@SuppressWarnings("deprecation")
	public void updateBimbi(Long id, Prenotation prenotation) {
		Prenotation update = new Prenotation();
		update = prenRepo.getById(id);
		update.setIdReview(update.getIdReview());
		update.setIdUser(update.getId());
		prenRepo.save(update);

	}

}
