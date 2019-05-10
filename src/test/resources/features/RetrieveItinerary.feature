
Feature: Retrieve Itinerary
  As a client of this airline
  I want to retrieve available itineraries
  So I can make a decision on which flight to buy

  Background:
    Given the site is running

  Scenario: Retrieve itinerary
    Given a designator "BRAVO" to be introduced as a path variable
    And the request content type is json
    When I send it to the api "/itinerary/{pathVariable}"
    And the http verb is get
    Then the api should respond
    And the code should be "OK"

  Scenario: Empty itinerary
    Given a designator "ZULU" to be introduced as a path variable
    And the request content type is json
    When I send it to the api "/itinerary/{pathVariable}"
    And the http verb is get
    Then the api should respond
    And the code should be "NO_CONTENT"

  Scenario: Wrong designator
    Given a designator "PAPA" to be introduced as a path variable
    And the request content type is json
    When I send it to the api "/itinerary/{pathVariable}"
    And the http verb is get
    Then the api should respond
    And the code should be "BAD_REQUEST"