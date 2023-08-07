package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    @Given("User is on the login page of the application")
    public void user_is_on_the_login_page_of_the_application() {

        System.out.println("login page");
    }

    @When("^user enter the valid (.+)) and (.+)$")
    public void user_enter_the_valid_and(String string, String string2) {
        System.out.println(string);
        System.out.println(string2);
    }
//    @When("user enter the valid  username {string} and password {string}")
//    public void user_enter_the_valid_username_and_password(String Username, String Password) {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println(Username);
//        System.out.println(Password);
//    }
    @Then("clicks on the login button")
    public void clicks_on_the_login_button() {

        System.out.println("login button");
    }
    @And("home page of the application is displayed with user details")
    public void home_page_of_the_application_is_displayed_with_user_details() {

        System.out.println("home page");
    }
}
