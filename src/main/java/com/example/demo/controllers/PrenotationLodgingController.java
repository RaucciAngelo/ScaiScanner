package com.example.demo.controllers;

import com.example.demo.models.PrenotationLodging;
import com.example.demo.services.PrenotationLodgingService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/prenotationLodging")
public class PrenotationLodgingController {

    @Autowired
    PrenotationLodgingService prenotationLodgingService;

    @PostMapping("/addPrenotationLodging/{idLodging}/{idPrenotation}")
    public void addPrenotationLodging(@PathVariable("idLodging")Long idLodging, @PathVariable("idPrenotation")Long idPrenotation, Double buyPrice){
        prenotationLodgingService.addPrenotationLodging(idLodging, idPrenotation, buyPrice);
    }

    @DeleteMapping("/deletePrenotationLodging/{id}")
    public void deletePrenotationLodging(@PathVariable("id")Long id){
        prenotationLodgingService.deletePrenotationLodging(id);
    }

    @PutMapping("/updatePrenotationLodging/{id}/{idLodging}/{idPrenotation}")
    public void updatePrenotationLodging(@PathVariable("id")Long id, @PathVariable("idLodging")Long idLodging, @PathVariable("idPrenotation")Long idPrenotation, @RequestBody double buyPrice){
        prenotationLodgingService.updatePrenotationLodging(id, idLodging, idPrenotation, buyPrice);
    }

    @GetMapping("/getPrenotationLodging")
    public List<PrenotationLodging> getPrenotationLodging(){
        return prenotationLodgingService.getPrenotationLodging();
    }




}
