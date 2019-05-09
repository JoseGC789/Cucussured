package com.joseGC.cucussured.repository;

import com.joseGC.cucussured.domain.Itinerary;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ItineraryDAO{

    private static final List<Itinerary> database = new ArrayList<>();

    @PostConstruct
    public void init(){
        database.add(Itinerary.builder().designation("alpha").number(530).build());
        database.add(Itinerary.builder().designation("alpha").number(786).build());
        database.add(Itinerary.builder().designation("alpha").number(2754).build());
        database.add(Itinerary.builder().designation("alpha").number(12378).build());
        database.add(Itinerary.builder().designation("alpha").number(1231).build());
        database.add(Itinerary.builder().designation("bravo").number(89).build());
        database.add(Itinerary.builder().designation("bravo").number(5435331).build());
        database.add(Itinerary.builder().designation("bravo").number(767).build());
        database.add(Itinerary.builder().designation("bravo").number(76).build());
        database.add(Itinerary.builder().designation("bravo").number(13878).build());
        database.add(Itinerary.builder().designation("charlie").number(699878).build());
        database.add(Itinerary.builder().designation("charlie").number(777).build());
        database.add(Itinerary.builder().designation("charlie").number(53555552).build());
        database.add(Itinerary.builder().designation("charlie").number(565666632).build());
        database.add(Itinerary.builder().designation("charlie").number(4444).build());
    }

    public List<Itinerary> getItineraries(String designation){
        Itinerary toBeFound = Itinerary.builder().designation(designation).build();
        return database.stream().filter(itinerary -> itinerary.getDesignation().equalsIgnoreCase(designation)).collect(Collectors.toList());
    }
}
