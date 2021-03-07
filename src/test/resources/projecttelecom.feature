#Author: yuvaraj
@count
Feature: Title of your feature
  I want to use this template for my feature file

  @zero
  Scenario: Title of your scenario
    Given launch and verify url
    And click add customer link
    Then fill values for firstname lastname normal
    Then fill values for firstname lastname using onedim list
      | yuvaraj | ezhil |
    Then fill values for firstname lastname using onedim map
      | firstname | hello |
      | lastname  | dude  |
    Then fill values for firstname lastname using twodim map
      | firstname | lastname |
      | hello     | dude     |
      | yuvraj    | nandha   |
      | exhil     | explode  |
    Then fill values for firstname lastname using twodim list
      | yuvaraj | ezhil   |
      | nandha  | explode |

  @firstsce
  Scenario: value passed in step declaration
    Given launch and verify url
    And click add customer link
    Then pass value for "<yuva>" "<raj>"

  @secondsce
  Scenario Outline: value passed using example
    Given launch and verify url
    And click add customer link
    Then pass value for firstname and lastname "<fname>" "<lname>"
   # Then close browser

    Examples: 
      | fname           | lname   |
      | ezhil@gmail.com | explode |
      #| yuvaraj@mail.com | nandha  |
      #| karthi@.com      | rajan   |
