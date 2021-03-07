#Author: your.email@your.domain.com

Feature: facebook login

  Scenario: Verify fb blogin functionlality

    Given launch browser
    And use enter fb url "https://www.facebook.com/"
    Then user enter credentials "ezhil@gmail.com" "dsafsd"
    And clicks login button
