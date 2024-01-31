package com.it.unicam.progetto_ids_2023.controller;

import com.it.unicam.progetto_ids_2023.model.contenuto.Contenuto;
import com.it.unicam.progetto_ids_2023.model.contenuto.Segnalazione;
import com.it.unicam.progetto_ids_2023.service.SegnalazioniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/segnalazioni")
public class SegnalazioniController {

    private SegnalazioniService segnalazioniService;


    @Autowired
    public SegnalazioniController(SegnalazioniService segnalazioniService){
        this.segnalazioniService = segnalazioniService;
    }


    @GetMapping("/")
    public List<Segnalazione> getSegnalazione(/*@RequestParam Long id, @RequestParam Contenuto contenuto*/){
        segnalazioniService.popolaRepository();
        return  segnalazioniService.getSegnalazioni();
    }

    @PostMapping("add")
    public Segnalazione addSegnalazione(@RequestParam String testo, @RequestParam Contenuto contenuto){
        return segnalazioniService.aggiungiSegnalazione(testo, contenuto);
    }


    //Da sistemare
    @DeleteMapping("/{id}")
    public void deleteSegnalazione(@RequestParam Long id){
        segnalazioniService.eliminaSegnalazione(id);
    }



   //Da sistemare
    @DeleteMapping("/{id}/rifiuta")
    public void rifiutaContenuto(Long testoId/* mediaId*/){
        segnalazioniService.rifiutaContenuto(testoId);
    }





}