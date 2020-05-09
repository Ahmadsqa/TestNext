Feature: Search for new collections range
  as a customer
  i want the ability to search for newly available range
  so that i can view all of the collections of my choice
  before i buy.

  Scenario: newly available collection search
    Given i navigate to next homepage
    When  i click on Men link
    And   i click on Newly in link
    And   i click on Brand
    And   i click on Next
    And   i click on colour
    And   i click on Blue
    And   i click on size type
    And   i click on Big
    And   i click on size
    And   i click on 17IN
    And   i click on shirt of my choice
    Then  the details desction of the selected shirt is displayed.

