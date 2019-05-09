package com.joseGC.cucussured.controller;

import com.joseGC.cucussured.domain.Itinerary;
import com.joseGC.cucussured.repository.ItineraryDAO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ItineraryController{
    private final ItineraryDAO dao;

    public ItineraryController(ItineraryDAO dao){
        this.dao = dao;
    }

    @GetMapping("/itinerary/{id}")
    public ResponseEntity<List<Itinerary>> validateAndReturn(@PathVariable String id){
        Itinerary.isValid(id);
        List<Itinerary> found = dao.getItineraries(id);
        return found.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(found);
    }
}
