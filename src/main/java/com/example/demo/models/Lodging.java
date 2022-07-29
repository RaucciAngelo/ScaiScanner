package com.example.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Lodging {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameHotel;
	private String location;
	private Double vote;
	private int stars;
	private String tipology;
	private String checkIn;
	private String checkOut;
	private String services;
	private String availability;
	private String description;
	private Float price;
	private String city;
	
	@JsonIgnore
	@OneToMany(mappedBy = "lodging")
	private List<PrenotationLodging> prenotation;
	
	public Lodging() {
		super();
	}
	public Lodging(String nameHotel, String location, Double vote, int stars, String tipology, String checkIn,
			String checkOut, String services, String availability, String description, Float price, String city) {
		super();
		this.nameHotel = nameHotel;
		this.location = location;
		this.vote = vote;
		this.stars = stars;
		this.tipology = tipology;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.services = services;
		this.availability = availability;
		this.description = description;
		this.price = price;
		this.city = city;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameHotel() {
		return nameHotel;
	}
	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getVote() {
		return vote;
	}
	public void setVote(Double vote) {
		this.vote = vote;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getTipology() {
		return tipology;
	}
	public void setTipology(String tipology) {
		this.tipology = tipology;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<PrenotationLodging> getPrenotation() {
		return prenotation;
	}
	public void setPrenotation(List<PrenotationLodging> prenotation) {
		this.prenotation = prenotation;
	}
	
}
