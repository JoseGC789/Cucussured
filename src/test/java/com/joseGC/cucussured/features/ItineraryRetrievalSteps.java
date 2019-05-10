package com.joseGC.cucussured.features;

import com.joseGC.cucussured.FunctionalTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;
import org.springframework.http.HttpStatus;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertNotNull;

public class ItineraryRetrievalSteps extends FunctionalTest{
    private RequestSpecification request;
    private String path;

    @Given("a designator {string} to be introduced as a path variable")
    public void aDesignatorToBeIntroducedAsAPathVariable(String arg0) {
        super.pathVariables.put("pathVariable", arg0);
    }

    @And("the request content type is json")
    public void theRequestContentTypeIsJson() {
         super.headers.put("Content-Type", "application/json");
    }

    @When("I send it to the api {string}")
    public void iSendItToTheApi(String arg0) {
        path = arg0;
        request = given().port(port)
                .when()
                .headers(headers)
                .pathParams(pathVariables);
    }

    @And("the http verb is get")
    public void theHttpVerbIsGet() {
        response = request.get(path);
    }

    @Then("the api should respond")
    public void theApiShouldRespond() {
        assertNotNull(response);
    }

    @And("the code should be {string}")
    public void theCodeShouldBe(String arg0) {
        response.then()
                .assertThat()
                .statusCode(HttpStatus.valueOf(arg0).value());
    }
}
