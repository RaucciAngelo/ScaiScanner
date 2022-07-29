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

import com.example.demo.models.Review;
import com.example.demo.services.ReviewService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class ReviewController {

	@Autowired
	private ReviewService revservice;

	@GetMapping("/getAllReview")
	public List<Review> getAll() {
		return revservice.getAll();
	}

	@PostMapping("/addNewReview/{id}")
	public void addNewReview(@RequestBody Review review, @PathVariable("id") Long id) {
		revservice.save(review, id);
	}

	@DeleteMapping("/deleteReview/{id}")
	public void delete(@PathVariable("id") Long id) {
		revservice.delete(id);
	}

	@PutMapping("/updateReview/{id}")
	public void updateTeam(@PathVariable("id") Long id, @RequestBody Review review) {
		revservice.update(id, review);
	}
}