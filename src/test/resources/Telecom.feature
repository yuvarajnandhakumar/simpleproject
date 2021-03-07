Feature: webtable handling

Background:
    Given launch browser
    And User enter url

  Scenario: Read all data from webtable
    Then user gets the column and row count
    Then user gets onebyone value form webtable
    Then user close the window

  Scenario: Read last row value
    Then user gets the column and row count
    Then user gets last row value form webtable
    Then user close the window
