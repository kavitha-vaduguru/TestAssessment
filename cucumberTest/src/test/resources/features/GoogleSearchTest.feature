@regression @smoke
Feature: Google Search Results Detail validation

  @validateGoogleSearchDetails
  Scenario Outline: Validate user can search given data and can click the search results and validate details
    Given I navigated to the google search webpage
    Then I am on the Google search homepage using "<title>"
    When I have entered the text into google search bar "<keyword>"
    And  the result should display in a new page with searchresults
    Then I verify JP Mogan logo is dispalyed on search result page

    Examples: 
      | title | keyword     |
      | Google  | J.P. Morgan |