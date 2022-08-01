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
		return revrepo.findAll();
	}

	public void save(Review review) {
		revrepo.save(review);
	}

	public void delete(Long id) {
		revrepo.deleteById(id);
	}

	public void update(Long id, Review review) {
		Review update = new Review();
		update = revrepo.getReferenceById(id);
		update.setDescription(update.getDescription());
	}
}
