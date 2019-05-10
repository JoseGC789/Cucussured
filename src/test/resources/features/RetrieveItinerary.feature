
Feature: Retrieve Itinerary
  As a client of this airline
  I want to retrieve available itineraries
  So I can make a decision on which flight to buy

  Background:
    Given the site is running

  Scenario Outline: <description>
    Given a designator <designator> to be introduced as a path variable
    And the request content type is json
    When I send it to the api "/itinerary/{pathVariable}"
    And the http verb is get
    Then the api should respond
    And the code should be <response>
    Examples:
    |designator|response     |description         |
    |"BRAVO"   |"OK"         |"Retrieve itinerary"|
    |"ZULU"    |"NO_CONTENT" |"Empty itinerary"   |
    |"PAPA"    |"BAD_REQUEST"|"Wrong designator"  |