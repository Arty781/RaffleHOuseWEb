package pages.admin_cite;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://admin-staging.rafflehouse.com/#/login")
public class LoginAdminPage extends PageObject {

    @FindBy(name = "email")
    WebElement emailInput;

    @FindBy(name = "password")
    WebElement passInput;

    @FindBy(css = "button[type='submit']")
    WebElement signInButton;

    public void inputEmail(String keywords) {
        emailInput.sendKeys(keywords);
    }

    public void clickLogIn() {
        signInButton.click();
    }

    public void inputPass(String keywords) {
        passInput.sendKeys(keywords);
    }
}
