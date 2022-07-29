package com.example.demo.services;


import com.example.demo.models.Flight;
import com.example.demo.models.Prenotation;
import com.example.demo.models.PrenotationFlight;
import com.example.demo.models.PrenotationLodging;
import com.example.demo.repository.FlightRepo;
import com.example.demo.repository.PrenotationFlightRepo;
import com.example.demo.repository.PrenotationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotationFlightService {

    @Autowired
    FlightRepo flightRepo;
    @Autowired
    PrenotationFlightRepo prenotationFlightRepo;
    @Autowired
    PrenotationRepo prenotationRepo;

    public void addPrenotationFlight(Long idFlight, Long idPrenotation, Double buyPrice) {
        PrenotationFlight prenotationFlight = new PrenotationFlight(flightRepo.getReferenceById(idFlight), prenotationRepo.getReferenceById(idPrenotation), buyPrice);
        prenotationFlightRepo.save(prenotationFlight);
    }

    public void deletePrenotationFlight(Long id) {
        PrenotationFlight prenotationFlight = prenotationFlightRepo.getReferenceById(id);
        prenotationFlightRepo.delete(prenotationFlight);
    }


    public void updatePrenotationFlight(Long id, Long idFlight, Long idPrenotation, double buyPrice) {
        PrenotationFlight update = prenotationFlightRepo.getReferenceById(id);
        Prenotation prenotation = prenotationRepo.getReferenceById(idPrenotation);
        Flight flight = flightRepo.getReferenceById(idFlight);

        update.setPrenotation(prenotation);
        update.setFlight(flight);
        update.setBuyPrice(buyPrice);

        prenotationFlightRepo.save(update);
    }

    public List<PrenotationFlight> getPrenotationFlight() {
        return prenotationFlightRepo.findAll();
    }
}
