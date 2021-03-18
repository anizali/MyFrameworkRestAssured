Feature: Forecast for surfing


  Scenario Outline: Verify Current Forecast API with Valid data
    Given I look up for the weather forecast for next 16 days with postal code "<PostCode>"
    When I check the temperature is between "<minTemp>" and "<maxTemp>"
    Then API response should return status as "<status>"
    And Response content type should be json
    And Validate Response has status code
    Examples:
      | PostCode | status | minTemp | maxTemp |
      | 2026     | 200    | 12      | 30      |