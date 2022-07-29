package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.PrenotationRental;

@Repository
public interface PrenotationRentalRepo extends JpaRepository<PrenotationRental, Long> {

}
