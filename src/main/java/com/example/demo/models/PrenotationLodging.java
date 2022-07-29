package com.example.demo.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PrenotationLodging {

	// attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lodging_id")
	private Lodging lodging;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prenotation_id")
	private Prenotation prenotation;

	private double buyPrice;

	// constructor

	public PrenotationLodging() {
		super();
	}

	public PrenotationLodging(Lodging lodging, Prenotation prenotation, double buyPrice) {
		super();
		this.lodging = lodging;
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

	public Lodging getLodging() {
		return lodging;
	}

	public void setLodging(Lodging lodging) {
		this.lodging = lodging;
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
