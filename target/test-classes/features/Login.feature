@login
Feature: Krafttech Log in Test
  #Agile story : As a user, I should be able to log in so I can see my account
  @Hasan @smoke @SDET
  Scenario: Login as a Hasan
    Given The user is on the login page
    When The user enters Hasan credentials
    Then The user should be able to login

  @Sebastian @smoke @QA
  Scenario: Login as Sebastian
    Given The user is on the login page
    When The user enters Sebastian credentials
    Then The user should be able to login

    #class task user enters Jhan Nash credential3 minute
  @developer @db
  Scenario: Login as Jhan Nash
    Given The user is on the login page
    When The user enters Jhan Nash credentials
    Then The user should be able to login

  @SDET @smoke
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters Rosa credentials
    Then The user should be able to login

