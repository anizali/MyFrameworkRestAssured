Feature: Forecast for surfing


  Scenario Outline: Verify Current Forecast API with Valid data
    Given The user have proper API key
    When I look up for the weather forecast for next 16 days with postal code "<PostCode>"
    Then API response should return status as "<status>"
    And Response content type should be json
    And Validate Response has status code
    Examples:
      | PostCode | status |
      | 2026     | 200    |