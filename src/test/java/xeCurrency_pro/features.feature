
Feature: Check XE currency app

 
  Scenario Outline: get euro to canadian dollar conversion rate and comapre
    Given open the webpage and check title 
    And The title should contain "Xe Currency Converter - Live Exchange Rates Today"
    When set <From> value   and <To> value in convert page 
    And click convert button
    Then get convertion value
    And Go to chart page
    Then set <From> value   and <To> value in chart page 
    And click view chart button
    Then get conversion value from chart page
    And compare conversion value from convert and chart pages
    
Examples: 
|From|To|
|"EUR"|"CAD"|
 