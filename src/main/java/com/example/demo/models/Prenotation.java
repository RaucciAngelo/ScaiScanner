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

	private Long idUser;
	private Long idReview;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idReview")
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

	public Prenotation(Long idUser, Long idReview) {
		super();
		this.idUser = idUser;
		this.idReview = idReview;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdReview() {
		return idReview;
	}

	public void setIdReview(Long idReview) {
		this.idReview = idReview;
	}

}
