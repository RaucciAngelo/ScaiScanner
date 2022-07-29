package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Prenotation;

@Repository
public interface PrenotationRepo extends JpaRepository<Prenotation, Long> {

}
