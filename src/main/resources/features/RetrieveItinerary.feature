Feature: Retrieve Itinerary
  As a client of this airline
  I want to retrieve available itineraries
  So I can make a decision on which flight to buy

  Scenario: Retrieve itinerary
    Given a designator "BRAVO" to be introduced as a path variable
    And I write a http request
    And its content type is json
    When I send it to the api "/itinerary"
    And the http verb is get
    Then api should respond
    And the code should be "OK"