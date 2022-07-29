package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Review;
import com.example.demo.repository.ReviewRepo;

@Service
public class ReviewService {

	@Autowired
	public ReviewRepo revrepo;

	public List<Review> getAll() {
		// TODO Auto-generated method stub
		return revrepo.findAll();
	}

	public void save(Review review, Long id) {
		revrepo.save(review);
	}

	public void delete(Long id) {
		revrepo.deleteById(id);
	}

	@SuppressWarnings("deprecation")
	public void update(Long id, Review review) {
		Review update = new Review();
		update = revrepo.getById(id);
		update.setDescription(update.getDescription());
	}
}
