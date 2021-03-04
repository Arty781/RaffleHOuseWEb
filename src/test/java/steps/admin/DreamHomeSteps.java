package steps.admin;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import serenity.admin.LoginInAdminSteps;
import serenity.user.StepsWithValidCreds;

public class DreamHomeSteps {
    @Managed
    WebDriver driver;

    @Steps
    serenity.admin.DreamHomeSteps dreamHomeSteps;
    @Steps
    LoginInAdminSteps logAdminSteps;

    @Given("user logged in as admin with {string} email and {string} password")
    public void user_logged_in_as_admin_with_email_and_password(String email, String pass) {
        logAdminSteps.loginWithCreds(email, pass);
    }

    /*@When("admin go to dream home page")
    public void admin_go_to_dream_home_page() {
        dreamHomeSteps.openDreamHomePage();
    }*/

    @When("click add new dream home")
    public void click_add_new_dream_home() {
        dreamHomeSteps.clickAddNewDreamHome();
    }

    @When("admin title as {string}")
    public void admin_title_as(String string) {
        dreamHomeSteps.inputTitle(string);
    }

    @When("admin input address as {string}")
    public void admin_input_address_as(String string) {
        dreamHomeSteps.inputAddress(string);
    }

    @When("choose start and finish date")
    public void choose_start_and_finish_date() {
        dreamHomeSteps.ChooseStartDateAsNextMonth();
        dreamHomeSteps.ChooseFinishDateAsNextMonth();
    }

    @When("swith in trending toggle")
    public void swith_in_trending_toggle() {
        dreamHomeSteps.switchIsTrending();
    }

    @When("go to Description tab")
    public void go_to_Description_tab() {
        dreamHomeSteps.goToDescription();
    }

    @When("input badroom desctiption as {string}")
    public void input_badroom_desctiption_as(String string) {
        dreamHomeSteps.inputBadroomDescription(string);
    }

    @When("download badroom picture")
    public void download_badroom_picture() {
        dreamHomeSteps.loadGooglePictureAsBadroom();
    }

    @When("input bathroom desctiption as {string}")
    public void input_bathroom_desctiption_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("download bathroom picture")
    public void download_bathroom_picture() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("input Outspace  desctiption as {string}")
    public void input_Outspace_desctiption_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("download Outspace picture")
    public void download_Outspace_picture() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("add about descrition as {string}")
    public void add_about_descrition_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("go to discount & ticket tab")
    public void go_to_discount_ticket_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("input price as {int}")
    public void input_price_as(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Click Save")
    public void click_Save() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user login as user on web")
    public void user_login_as_user_on_web() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
