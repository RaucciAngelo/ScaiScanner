package com.example.demo;

import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.enumeration.Shift;
import com.example.demo.models.*;
import com.example.demo.repository.*;

@SpringBootApplication
public class ScaiScannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaiScannerApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner runner(FlightRepo flightRepo, LodgingRepo lodgingRepo, PrenotationRepo prenotationRepo,
//			PrenotationFlightRepo prenotationFlightRepo, PrenotationRentalRepo prenotationRentalRepo,
//			PrenotationLodgingRepo prenotationLodgingRepo, RentalRepo rentalRepo, ReviewRepo reviewRepo,
//			RoleRepository roleRepo, UserRepository userRepo) {
//		return args -> {
//
//			// Role creation
//			Role adminRole = new Role(ERole.ROLE_ADMIN);
//			Role userRole = new Role(ERole.ROLE_USER);
//			roleRepo.save(adminRole);
//			roleRepo.save(userRole);
//
//			// User creation
//			User user1 = new User("Io", "Me", "MexIox00", "MeMedesimo", "Io@gmail.com", "ProprioIo");
//			User user2 = new User("Tu", "Te", "Textux00", "TuProprio", "Tu@gmail.com", "ProprioTu");
//			userRepo.save(user1);
//			userRepo.save(user2);
//
//			// Flight creation
//			Flight flight1 = new Flight("Napoli", "Milano", "32", "23/06/2022 - 8.00", "23/06/2022 - 10.30", "Ryanair",
//					true, "2.30", 23.43);
//			Flight flight2 = new Flight("Roma", "Napoli", "25", "26/06/2022 - 9.00", "23/06/2022 - 11.30", "Wizzair",
//					true, "2.30", 15.00);
//			Flight flight3 = new Flight("Milano", "Bari", "14", "23/07/2022 - 13.00", "23/07/2022 - 16.30", "Alitalia",
//					true, "3.30", 30.00);
//			Flight flight4 = new Flight("Milano", "Torino", "14", "10/08/2022 - 17.00", "10/08/2022 - 19.00", "EasyJet",
//					true, "3.30", 30.00);
//			flightRepo.save(flight1);
//			flightRepo.save(flight2);
//			flightRepo.save(flight3);
//			flightRepo.save(flight4);
//
//			// Lodging creation
//			Lodging lodging1 = new Lodging("Mirò", "Qua", "Proprio qua", 3.5, 3, "Hotel", "12.00", "11.00",
//					"Aria condizionata - televisore", 5, "Camera molto bella", 53.50);
//
//			Lodging lodging2 = new Lodging("Hotello", "La", "Proprio la", 1, 1, "Ostello", "12.00", "11.00", "Letto",
//					10, "Camera poco bella", 10.00);
//
//			Lodging lodging3 = new Lodging("MiraMare", "Li", "Proprio li", 5, 5, "Hotel", "12.00", "11.00",
//					"Aria condizionata - Televisore - Lavatrice - Servizio in camera - Asciugamani", 5,
//					"Camera troppo bella", 155.50);
//
//			Lodging lodging4 = new Lodging("Accoglienza", "Qua", "Proprio qua", 3.5, 3, "Appartamento", "12.00",
//					"11.00", "Aria condizionata - televisore - lavatrice", 5, "Camera bella", 53.50);
//			lodgingRepo.save(lodging1);
//			lodgingRepo.save(lodging2);
//			lodgingRepo.save(lodging3);
//			lodgingRepo.save(lodging4);
//
//			// Review creation
//			Review review1 = new Review("Troppo bello");
//			Review review2 = new Review("Non proprio bello");
//			Review review3 = new Review("Molto bello");
//			Review review4 = new Review("Bellissimo");
//			reviewRepo.save(review1);
//			reviewRepo.save(review2);
//			reviewRepo.save(review3);
//			reviewRepo.save(review4);
//
//			// Prenotation creation
//			Prenotation prenotation1 = new Prenotation(user1, review1);
//			Prenotation prenotation2 = new Prenotation(user1, review2);
//			Prenotation prenotation3 = new Prenotation(user2, review3);
//			Prenotation prenotation4 = new Prenotation(user2, review4);
//			prenotationRepo.save(prenotation1);
//			prenotationRepo.save(prenotation2);
//			prenotationRepo.save(prenotation3);
//			prenotationRepo.save(prenotation4);
//
//			// Rental creation
//			Rental rental1 = new Rental("Fiat", "Panda", "Bari", "Bari", "22/07/2022 - 11.00", "29/07/2022 - 12.00",
//					5, 5, 2, "Aria condizionata - Sedili riscaldati", 23, 141, Shift.Manual);
//			Rental rental2 = new Rental("Ford", "Kuga", "Roma", "Roma", "26/07/2022 - 11.00", "29/07/2022 - 12.00", 5,
//					5, 2, "Aria condizionata", 70, 210, Shift.Automatic);
//			Rental rental3 = new Rental("Kia", "Sportage", "Milano", "Milano", "12/06/2022 - 11.00",
//					"12/07/2022 - 12.00", 2, 5, 2, "Aria condizionata", 60, 1900, Shift.Manual);
//			Rental rental4 = new Rental("Ferrari", "Berlinetta", "Napoli", "Napoli", "01/01/2022 - 11.00",
//					"31/12/2022 - 12.00", 2, 3, 1, "Aria condizionata - Sedili riscaldati", 300, 11000,
//					Shift.Sequential);
//			rentalRepo.save(rental1);
//			rentalRepo.save(rental2);
//			rentalRepo.save(rental3);
//			rentalRepo.save(rental4);
//
//			// PrenotationFlight creation
//			PrenotationFlight prenotationFlight1 = new PrenotationFlight(flight1, prenotation1, 59.50);
//			PrenotationFlight prenotationFlight2 = new PrenotationFlight(flight2, prenotation3, 35.00);
//			PrenotationFlight prenotationFlight3 = new PrenotationFlight(flight3, prenotation4, 700.00);
//			PrenotationFlight prenotationFlight4 = new PrenotationFlight(flight4, prenotation2, 43.90);
//			prenotationFlightRepo.save(prenotationFlight1);
//			prenotationFlightRepo.save(prenotationFlight2);
//			prenotationFlightRepo.save(prenotationFlight3);
//			prenotationFlightRepo.save(prenotationFlight4);
//
//			// PrenotationRental creation
//			PrenotationRental prenotationRental1 = new PrenotationRental(rental2, prenotation1, rental2.getBuyPrice());
//			PrenotationRental prenotationRental2 = new PrenotationRental(rental4, prenotation1, rental4.getBuyPrice());
//			PrenotationRental prenotationRental3 = new PrenotationRental(rental3, prenotation1, rental3.getBuyPrice());
//			PrenotationRental prenotationRental4 = new PrenotationRental(rental1, prenotation1, rental1.getBuyPrice());
//			prenotationRentalRepo.save(prenotationRental1);
//			prenotationRentalRepo.save(prenotationRental2);
//			prenotationRentalRepo.save(prenotationRental3);
//			prenotationRentalRepo.save(prenotationRental4);
//
//			// PrenotationLodging creation
//			PrenotationLodging prenotationLodging1 = new PrenotationLodging(lodging1, prenotation1, 200.00);
//			PrenotationLodging prenotationLodging2 = new PrenotationLodging(lodging2, prenotation2, 40.00);
//			PrenotationLodging prenotationLodging3 = new PrenotationLodging(lodging3, prenotation3, 200);
//			PrenotationLodging prenotationLodging4 = new PrenotationLodging(lodging4, prenotation4, 300.70);
//			prenotationLodgingRepo.save(prenotationLodging1);
//			prenotationLodgingRepo.save(prenotationLodging2);
//			prenotationLodgingRepo.save(prenotationLodging3);
//			prenotationLodgingRepo.save(prenotationLodging4);
//
//		};
//	}

}
