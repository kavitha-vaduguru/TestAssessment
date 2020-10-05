@regression @sanity
Feature: Google Search example of how to test web pages with cucumber

  @verifyWebPageLogo
  Scenario Outline: finding logo on JP Morgan homepage
    Given I navigated to the google search webpage
    Then I am on the Google search homepage using "<website>"
    When I have entered the text into google search bar "<keyword>"
    And  the result should display in a new page with searchresults
    Then I verify JP Mogan logo is dispalyed on search result page

    Examples: 
      | website | keyword     |
      | Google  | J.P. Morgan |