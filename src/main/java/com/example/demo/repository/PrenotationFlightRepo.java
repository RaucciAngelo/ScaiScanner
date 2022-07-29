package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.PrenotationFlight;

@Repository
public interface PrenotationFlightRepo extends JpaRepository<PrenotationFlight, Long> {

    @Query(value = "SELECT idPrenotation FROM PrenotationFlight WHERE id = :id", nativeQuery = true)
    Long getPrenotationId(@Param("id") Long id);

    @Query(value = "SELECT idFlight FROM PrenotationFlight WHERE id = :id", nativeQuery = true)
    Long getFlightId(@Param("id") Long id);
}
