package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {

}
