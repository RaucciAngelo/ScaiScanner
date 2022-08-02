package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class PrenotationRental {

	// attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rental_id")
	private Rental rental;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prenotation_id")
	private Prenotation prenotation;

	private double buyPrice;

	// constructor

	public PrenotationRental() {
		super();
	}

	public PrenotationRental(Rental rental, Prenotation prenotation, double buyPrice) {
		super();
		this.rental = rental;
		this.prenotation = prenotation;
		this.buyPrice = buyPrice;
	}

	// get and set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public Prenotation getPrenotation() {
		return prenotation;
	}

	public void setPrenotation(Prenotation prenotation) {
		this.prenotation = prenotation;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
}
