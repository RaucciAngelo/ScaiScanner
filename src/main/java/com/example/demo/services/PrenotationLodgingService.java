package com.example.demo.services;

import com.example.demo.models.Lodging;
import com.example.demo.models.Prenotation;
import com.example.demo.models.PrenotationLodging;
import com.example.demo.models.PrenotationRental;
import com.example.demo.repository.LodgingRepo;
import com.example.demo.repository.PrenotationLodgingRepo;
import com.example.demo.repository.PrenotationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotationLodgingService {

    @Autowired
    PrenotationLodgingRepo prenotationLodgingRepo;
    @Autowired
    LodgingRepo lodgingRepo;
    @Autowired
    PrenotationRepo prenotationRepo;

    public void addPrenotationLodging(Long idLodging, Long idPrenotation, Double buyPrice) {
        PrenotationLodging prenotationLodging = new PrenotationLodging(lodgingRepo.getReferenceById(idLodging), prenotationRepo.getReferenceById(idPrenotation), buyPrice);
        prenotationLodgingRepo.save(prenotationLodging);
    }

    public void deletePrenotationLodging(Long id) {
        PrenotationLodging prenotationLodging = prenotationLodgingRepo.getReferenceById(id);
        prenotationLodgingRepo.delete(prenotationLodging);
    }

    public void updatePrenotationLodging(Long id, Long idLodging, Long idPrenotation, double buyPrice) {
        PrenotationLodging update = prenotationLodgingRepo.getReferenceById(id);
        Prenotation prenotation = prenotationRepo.getReferenceById(idPrenotation);
        Lodging lodging = lodgingRepo.getReferenceById(idLodging);

        update.setPrenotation(prenotation);
        update.setLodging(lodging);
        update.setBuyPrice(buyPrice);

        prenotationLodgingRepo.save(update);
    }

    public List<PrenotationLodging> getPrenotationLodging() {
        return prenotationLodgingRepo.findAll();
    }
}
