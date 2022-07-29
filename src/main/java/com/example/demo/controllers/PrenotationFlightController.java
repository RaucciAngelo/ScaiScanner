package com.example.demo.controllers;

import com.example.demo.models.PrenotationFlight;
import com.example.demo.services.PrenotationFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/prenotationFlight")
public class PrenotationFlightController {

    @Autowired
    PrenotationFlightService prenotationFlightService;

    @PostMapping("/addPrenotationFlight/{idFlight}/{idPrenotation}")
    public void addPrenotationFlight(@PathVariable("idFlight")Long idFlight, @PathVariable("idPrenotation")Long idPrenotation, Double buyPrice){
        prenotationFlightService.addPrenotationFlight(idFlight, idPrenotation, buyPrice);
    }

    @DeleteMapping("/deletePrenotationFlight/{id}")
    public void deletePrenotationFlight(@PathVariable("id")Long id){
        prenotationFlightService.deletePrenotationFlight(id);
    }

    @PutMapping("/updatePrenotationFlight/{id}/{idFlight}/{idPrenotation}")
    public void updatePrenotationFlight(@PathVariable("id")Long id, @PathVariable("idFlight")Long idFlight, @PathVariable("idPrenotation")Long idPrenotation, @RequestBody double buyPrice){
        prenotationFlightService.updatePrenotationFlight(id, idFlight, idPrenotation, buyPrice);
    }

    @GetMapping("/getPrenotationFlight")
    public List<PrenotationFlight> getPrenotationFlight(){
        return prenotationFlightService.getPrenotationFlight();
    }

}
