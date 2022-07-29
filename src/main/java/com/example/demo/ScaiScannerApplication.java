package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.models.*;
import com.example.demo.repository.*;

@SpringBootApplication
public class ScaiScannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaiScannerApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(FlightRepo flightRepo, LodgingRepo lodgingRepo, PrenotationRepo prenotationRepo,
			PrenotationFlightRepo prenotationFlightRepo, PrenotationRentalRepo prenotationRentalRepo, PrenotationLodgingRepo prenotationLodgingRepo,
			RentalRepo rentalRepo, ReviewRepo reviewRepo, RoleRepository roleRepo) {
		return args -> {

			// Flight creation
			Flight flight1 = new Flight();
			Flight flight2 = new Flight();
			Flight flight3 = new Flight();
			flightRepo.save(flight1);
			flightRepo.save(flight2);
			flightRepo.save(flight3);

			// Lodging creation
			Lodging lodging1 = new Lodging();
			Lodging lodging2 = new Lodging();
			Lodging lodging3 = new Lodging();
			Lodging lodging4 = new Lodging();
			lodgingRepo.save(lodging1);
			lodgingRepo.save(lodging2);
			lodgingRepo.save(lodging3);
			lodgingRepo.save(lodging4);

			// Prenotation creation
			Prenotation prenotation1 = new Prenotation();
			Prenotation prenotation2 = new Prenotation();
			Prenotation prenotation3 = new Prenotation();
			Prenotation prenotation4 = new Prenotation();
			prenotationRepo.save(prenotation1);
			prenotationRepo.save(prenotation2);
			prenotationRepo.save(prenotation3);
			prenotationRepo.save(prenotation4);

			// PrenotationFlight creation
			PrenotationFlight prenotationFlight1 = new PrenotationFlight();
			PrenotationFlight prenotationFlight2 = new PrenotationFlight();
			PrenotationFlight prenotationFlight3 = new PrenotationFlight();
			PrenotationFlight prenotationFlight4 = new PrenotationFlight();
			prenotationFlightRepo.save(prenotationFlight1);
			prenotationFlightRepo.save(prenotationFlight2);
			prenotationFlightRepo.save(prenotationFlight3);
			prenotationFlightRepo.save(prenotationFlight4);

			// PrenotationRental creation
			PrenotationRental prenotationRental1 = new PrenotationRental();
			PrenotationRental prenotationRental2 = new PrenotationRental();
			PrenotationRental prenotationRental3 = new PrenotationRental();
			PrenotationRental prenotationRental4 = new PrenotationRental();
			prenotationRentalRepo.save(prenotationRental1);
			prenotationRentalRepo.save(prenotationRental2);
			prenotationRentalRepo.save(prenotationRental3);
			prenotationRentalRepo.save(prenotationRental4);

			// PrenotationLodging creation
			PrenotationLodging prenotationLodging1 = new PrenotationLodging();
			PrenotationLodging prenotationLodging2 = new PrenotationLodging();
			PrenotationLodging prenotationLodging3 = new PrenotationLodging();
			PrenotationLodging prenotationLodging4 = new PrenotationLodging();
			prenotationLodgingRepo.save(prenotationLodging1);
			prenotationLodgingRepo.save(prenotationLodging2);
			prenotationLodgingRepo.save(prenotationLodging3);
			prenotationLodgingRepo.save(prenotationLodging4);

			// Rental creation
			Rental rental1 = new Rental();
			Rental rental2 = new Rental();
			Rental rental3 = new Rental();
			Rental rental4 = new Rental();
			rentalRepo.save(rental1);
			rentalRepo.save(rental2);
			rentalRepo.save(rental3);
			rentalRepo.save(rental4);

			// Review creation
			Review review1 = new Review();
			Review review2 = new Review();
			Review review3 = new Review();
			Review review4 = new Review();
			reviewRepo.save(review1);
			reviewRepo.save(review2);
			reviewRepo.save(review3);
			reviewRepo.save(review4);

			// Role creation
			Role admin = new Role(ERole.ROLE_ADMIN);
			Role user = new Role(ERole.ROLE_USER);
			roleRepo.save(admin);
			roleRepo.save(user);

		};
	}
	
}
