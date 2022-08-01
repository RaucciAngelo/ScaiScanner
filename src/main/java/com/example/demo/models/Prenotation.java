package com.example.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Prenotation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "review_id")
	private Review review;

	@OneToMany(mappedBy = "prenotation")
	private List<PrenotationRental> prenRental;

	@OneToMany(mappedBy = "flight")
	private List<PrenotationFlight> prenFlight;

	@OneToMany(mappedBy = "lodging")
	private List<PrenotationLodging> prenLodging;

	@ManyToOne
	@JoinColumn(name = "prenotation_id")
	private User user;

	public Prenotation() {
		super();
	}

	public Prenotation(User user, Review review) {
		super();
		this.user = user;
		this.review = review;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
