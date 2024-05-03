package com.it.unicam.progetto_ids_2023.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.it.unicam.progetto_ids_2023.model.contenuto.ContenutiStati;
import com.it.unicam.progetto_ids_2023.model.contenuto.ContenutoTipo;
import com.it.unicam.progetto_ids_2023.model.puntodiinteresse.Comune;
import com.it.unicam.progetto_ids_2023.model.puntodiinteresse.PuntoDiInteresse;
import com.it.unicam.progetto_ids_2023.model.utente.Utente;

public record ContenutoDTO(
      Long id,

     // Comune comune,

     // PuntoDiInteresse puntoDiInteresse,


      String nome,
      boolean pending, // da rimuovere
      ContenutiStati stati, // da rimuovere

      ContenutoTipo tipo,

      String testo,

      String file






) {
}
