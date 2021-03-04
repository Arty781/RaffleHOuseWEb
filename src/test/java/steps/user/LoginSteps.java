package steps.user;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import serenity.user.StepsWithValidCreds;

public class LoginSteps {
    @Managed
    WebDriver driver;

    @Steps
    StepsWithValidCreds loginS;

    @When("user go to login page")
    public void user_go_to_login_page() {
        loginS.open_login_page();
    }

    @When("input in email value {string}")
    public void input_in_email_value(String string) {
        loginS.inputEmail(string);
    }

    @When("input in password {string}")
    public void input_in_password(String pass) {
        loginS.inputPassword(pass);
    }

    @When("click submit")
    public void click_submit() {
        loginS.clickSubmit();
    }

    @Then("user redirected to dream house page")
    public void user_redirected_to_dream_house_page() {
        loginS.should_be_profile_page();
    }

    @Given("user logout")
    public void user_logout() {

    }
//    @When("user go to login page")
//    public void user_go_to_login_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("input in email value {string}")
//    public void input_in_email_value(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("input in password {string}")
//    public void input_in_password(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("click submit")
//    public void click_submit() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("user redirected to dream house page")
//    public void user_redirected_to_dream_house_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }

}
