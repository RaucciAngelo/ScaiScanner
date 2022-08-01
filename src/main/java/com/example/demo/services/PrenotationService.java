package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.*;
import com.example.demo.repository.*;

@Service
public class PrenotationService {

	@Autowired
	private PrenotationRepo prenRepo;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private ReviewRepo reviewRepo;
	

	public List<Prenotation> getAllPrenotation() {
		return prenRepo.findAll();
	}

	public void save(Long idUser, Long idReview) {
		User user = userRepo.getReferenceById(idUser);
		Review review = reviewRepo.getReferenceById(idReview);
		
		Prenotation prenotation = new Prenotation(user, review);
		
		prenRepo.save(prenotation);
	}

	public void delete(Long id) {
		prenRepo.deleteById(id);
	}

	public void update(Long idPrenotation, Long idUser, Long idReview) {
		User user = userRepo.getReferenceById(idUser);
		Review review = reviewRepo.getReferenceById(idReview);
		
		Prenotation updatePrenotation = new Prenotation();
		updatePrenotation = prenRepo.getReferenceById(idPrenotation);
		updatePrenotation.setReview(review);
		updatePrenotation.setUser(user);
		prenRepo.save(updatePrenotation);
		
	}

}
