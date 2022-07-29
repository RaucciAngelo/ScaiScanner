package com.example.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.enumeration.Shift;

@Entity
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String locality;
	private String city;
	private String startTimeDate;
	private String endTimeDate;
	private int numberOfSeats;
	private int numberOfPorts;
	private int numberOfBags;
	private String optional;
	private String dailyPrice;
	private String price;
	private Shift shift;
	
	@OneToMany(mappedBy="prenotation")
	private List<PrenotationRental> prenRental;

	public Rental() {}
	
	public Rental(String locality, String city, String startTimeDate, String endTimeDate, int numberOfSeats,
			int numberOfPorts, int numberOfBags, String optional, String dailyPrice, String price, Shift shift,
			List<PrenotationRental> prenRental) {
	
		this.locality = locality;
		this.city = city;
		this.startTimeDate = startTimeDate;
		this.endTimeDate = endTimeDate;
		this.numberOfSeats = numberOfSeats;
		this.numberOfPorts = numberOfPorts;
		this.numberOfBags = numberOfBags;
		this.optional = optional;
		this.dailyPrice = dailyPrice;
		this.price = price;
		this.shift = shift;
		this.prenRental = prenRental;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStartTimeDate() {
		return startTimeDate;
	}

	public void setStartTimeDate(String startTimeDate) {
		this.startTimeDate = startTimeDate;
	}

	public String getEndTimeDate() {
		return endTimeDate;
	}

	public void setEndTimeDate(String endTimeDate) {
		this.endTimeDate = endTimeDate;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfPorts() {
		return numberOfPorts;
	}

	public void setNumberOfPorts(int numberOfPorts) {
		this.numberOfPorts = numberOfPorts;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public String getOptional() {
		return optional;
	}

	public void setOptional(String optional) {
		this.optional = optional;
	}

	public String getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(String dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

	public List<PrenotationRental> getPrenRental() {
		return prenRental;
	}

	public void setPrenRental(List<PrenotationRental> prenRental) {
		this.prenRental = prenRental;
	}
	
}
