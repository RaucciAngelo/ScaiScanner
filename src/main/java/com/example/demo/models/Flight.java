package com.example.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departureCity;
	private String arrivalCity;
	private String seat;
	private String departureTime;
	private String arrivalTime;
	private String flightCompany;
	private boolean oneWay;
	private String flightTime;
	private double buyPrice;
	
	@JsonIgnore
	@OneToMany(mappedBy = "flight")
	private List<PrenotationFlight> prenotation;

	public Flight() {
	}

	public Flight(String departureCity, String arrivalCity, String seat, String departureTime, String arrivalTime,
			String flightCompany, boolean oneWay, String flightTime, double buyPrice) {
		super();
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.seat = seat;
		this.departureTime = departureTime;
		this.flightCompany = flightCompany;
		this.oneWay = oneWay;
		this.arrivalTime = arrivalTime;
		this.flightTime = flightTime;
		this.buyPrice = buyPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getFlightCompany() {
		return flightCompany;
	}

	public void setFlightCompany(String flightCompany) {
		this.flightCompany = flightCompany;
	}

	public boolean isOneWay() {
		return oneWay;
	}

	public void setOneWay(boolean oneWay) {
		this.oneWay = oneWay;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

}