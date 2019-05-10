package com.joseGC.cucussured.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import java.util.Arrays;
import static lombok.AccessLevel.PRIVATE;

@Getter
@Builder
@AllArgsConstructor(access = PRIVATE)
@JsonDeserialize(builder = Itinerary.ItineraryBuilder.class)
public final class Itinerary{
    private final String designation;
    private final Integer number;

    public static boolean isValid(String designation){
        if(null == designation){
            throw new AssertionError();
        }
        if(Arrays.stream(Fields.values()).anyMatch(value -> value.getField().equalsIgnoreCase(designation))){
            return true;
        }
        throw new AssertionError();
    }

    private enum Fields{
        ALPHA("Alpha"),
        BRAVO("Bravo"),
        CHARLIE("Charlie"),
        DELTA("Zulu");

        private final String field;

        Fields(String field){
            this.field = field;
        }

        public String getField(){
            return field;
        }
    }

}
