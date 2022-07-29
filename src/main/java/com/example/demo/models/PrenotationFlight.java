package com.example.demo.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PrenotationFlight {

	// attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "flight_id")
	private Flight flight;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prenotation_id")
	private Prenotation prenotation;

	private double buyPrice;

	// constructor
	public PrenotationFlight() {
		super();
	}

	public PrenotationFlight(Flight flight, Prenotation prenotation, double buyPrice) {
		super();
		this.flight = flight;
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

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
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
