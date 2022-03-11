Feature: SignUp, Sign In and Purchase Product

  @Regression
  Scenario: TC-001 Create New User/SignUp
    Given I am on home page
    When I send email on email textBox
    Then I click on signup button

  @Regression
  Scenario: TC-002 Input all information on Search Form
    Given I am on home page
    When I select DepartFrom
    And I can Input destination "Costa Almeria - Spain"
    And I can select date
    And I can view offer
    And I can check Availability
    And I click on Nights "3 Nights"
    And I can select Boardbasis "All Inclusive"
    And I can select Rooms
    And I can click on Search Button
    And I can select Room
    And I can click on continue
    Then I can click On checkout Button

  Scenario Outline: verify when user tries to fill up passenger Details
    And I enter Title "<Title>"
    And I enter FirstName "<FirstName>"
    And I enter MiddleName "<MiddleName>"
    And I enter LastName "<LastName>"
    And I enter day "<Day>"
    And I enter month "<Month>"
    And I enter year "<Year>"
    And I enter Primary Number
    And I enter Email Address
    And I enter confirm Email Address
    And I click on Continue Button
    And I enter House Number
    And I enter 2nd Line Address
    And I enter City
    And I enter County
    And I enter Country
    And I enter PostCode
    Then I click on Continue Btn
    Examples:
      | Title | FirstName | MiddleName | LastName | Day | Month | Year |
      | Mr    | Harry     | M          | Potter   | 12  | 03    | 1970 |
      | Mr    | Andy      | M          | Potter   | 18  | 07    | 1975 |


