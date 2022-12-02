package com.krafttech.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_stepDefs {

    @When("At first get the text of dashboard")
    public void atFirstGetTheTextOfDashboard() {
        System.out.println("Dashboard");
    }

    @Then("Then go to Developers menu and get the text of Developer")
    public void thenGoToDevelopersMenuAndGetTheTextOfDeveloper() {
        System.out.println("Developer");
    }

    @When("Get the text of dashboard")
    public void getTheTextOfDashboard() {
        System.out.println("Dashboard");

    }
    @Then("Then go to Edit Profile menu and get the text of Edit User Profile")
    public void thenGoToEditProfileMenuAndGetTheTextOfEditUserProfile() {
        System.out.println("Edit User");
    }

    @Then("Then go to My Profile menu and get the text of User Profile")
    public void thenGoToMyProfileMenuAndGetTheTextOfUserProfile() {
        System.out.println("Dashboard");
        System.out.println("User Profile");
    }

}
