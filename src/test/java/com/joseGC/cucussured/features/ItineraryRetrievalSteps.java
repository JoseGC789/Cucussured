package com.joseGC.cucussured.features;

import com.joseGC.cucussured.FunctionalTest;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import io.restassured.http.ContentType;
import org.springframework.http.HttpStatus;
import static io.restassured.RestAssured.given;

public class ItineraryRetrievalSteps extends FunctionalTest{

    @Dado("que quiero conocer el itinerario de un {string}")
    public void aDesignatorToBeIntroducedAsAPathVariable(String arg0) {
        super.pathVariables.put("pathVariable", arg0);
    }

    @Cuando("accedo al sitio {string}")
    public void iSendItToTheApi(String arg0) {
        super.response = given()
                .port(port)
                .when()
                .contentType(ContentType.JSON)
                .pathParams(pathVariables)
                .get(arg0);
    }

    @Entonces("la api deberá responder con {string}")
    public void theApiShouldRespond(String arg0) {
        response.then()
                .assertThat()
                .statusCode(HttpStatus.valueOf(arg0).value());
    }
}
