package serenity;

import driver.DriverSingleton;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

public class StepsWithValidCreds {
    private static DriverSingleton DrS;
    LoginPage loginPage;

    @Step
    public void open_login_page() {
        /*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);*/
        loginPage.setDriver(DrS.getDriver());
        loginPage.open();
    }
    @Step
    public void inputEmail(String email) {
        loginPage.inputEmail(email);
    }
    @Step
    public void inputPassword(String pass) {
        loginPage.inputPass(pass);
    }
    @Step
    public void clickSubmit() {
        loginPage.clickLogIn();
    }

    @Step
    public void should_be_signin_page() {
        Assert.assertEquals("https://staging.rafflehouse.com/sign-in", DrS.getDriver().getCurrentUrl());
    }

    @Step
    public void should_be_main_page() {
        Assert.assertEquals("https://staging.rafflehouse.com", DrS.getDriver().getCurrentUrl());
        Assert.assertEquals("Raffle House", DrS.getDriver().getTitle());
    }
    @Step
    public void should_be_profile_page() {
        WebDriverWait wait = new WebDriverWait(DrS.getDriver(), 10); // seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Details']")));

        Assert.assertEquals("https://staging.rafflehouse.com/profile", DrS.getDriver().getCurrentUrl());
        Assert.assertEquals("Raffle House", DrS.getDriver().getTitle());
    }
}
