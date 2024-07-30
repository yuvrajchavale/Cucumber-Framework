Feature: Employee Management
  Testing employee creation and deletion functionalities.

  @employeeCreation
  Scenario Outline: Create New Employee
    Given I open the browser with URL "http://www.orangehrm.qedgetech.com/"
    Then I should see the login page
    When I enter username as "Admin"
    And I enter password as "Qedge123!@#"
    And I click login
    Then I should see the PIM module
    When I click the PIM button
    And I wait for the add button
    When I click on the add button
    Then I wait for the Employee Id
    When I enter first name as "<fname>"
    And I enter middle name as "<mname>"
    And I enter last name as "<lname>"
    And I click on the save button
    Then user wait for the Employee Id
    And I capture the Employee Id
    When I close the browser

  Examples:
    | fname  | mname | lname    |
    | Yuvraj | N     | Chavale  |
    | Manish | N     | Chawale  |
    | Naveen | D     | Mogili   |
    | Nitesh | R     | Pidurkar |

  @employeeDeletion
  Scenario: Delete Existing Employee
    Given I open the browser with URL "http://www.orangehrm.qedgetech.com/"
    Then I should see the login page
    When I enter username as "Admin"
    And I enter password as "Qedge123!@#"
    And I click login
    Then I should see the PIM module
    When I click the PIM button
    And I search for the employee with id "1670"
    And Click on search button
    When select the employee
    And I click the delete button
    And  I should see OK Button
    And Click on OK Button
    Then I should see the employee deleted sucessfully
    When I close the browser
