Feature: Login Scenarios


  Scenario Outline: Login with invalid user name
    When I enter invalid username "<username>"
    And I enter password as "<password>"

    Examples:
      | username | password |
      | Aniz     | Ali      |


  Scenario Outline: Verify Current Forecast API with Valid data
    Given The user have proper API key
    When The user sents GET request and get the Timestamp and weather value
    Then API response should return status as "<status>"
    And Response content type should be json
    And Validate Response has status code
    Examples:
      | status |
      | 200    |