Feature: Forecast for surfing


  Scenario Outline: As a choosy surfer I want to get the list of dates which satisfy my requirements
    Given I look up for the weather forecast for next 16 days with postal code "<PostCode>"
    When I check the temperature is between "<minTemp>" and "<maxTemp>"
    And I check the wind speed is between "<minSpeed>" and "<maxSpeed>"
    And I check to see if the UV index is less than or equal to "<UVindex>"
    Then List all the dates which satisfy surfer requirement
    Examples:
      | PostCode | minTemp | maxTemp | minSpeed | maxSpeed | UVindex |
      | 2026     | 12      | 30      | 3        | 9        | 12      |