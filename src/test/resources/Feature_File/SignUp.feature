@test
Feature: SignUp application

  Background: Navigate to application
    Given User navigate to  application https://www.google.com/

  # SignUp
  Scenario: Signup To the application
    When User Enter UserName TestSignup
    When User Enter Mobile Number 1234567890
#    When User Enter Password Testing
#    When User Accept Term and conditions
#    Then Navigate to Next page
