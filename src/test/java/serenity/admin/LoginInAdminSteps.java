package serenity.admin;

import driver.DriverSingleton;
import net.thucydides.core.annotations.Step;
import pages.admin_cite.LoginAdminPage;

public class LoginInAdminSteps {
    private static DriverSingleton DrS;
    LoginAdminPage loginAdmin;

    @Step
    public void loginWithCreds(String email, String pass) {
        //loginAdmin.setDriver(DrS.getDriver());
        loginAdmin.open();

        loginAdmin.inputEmail(email);
        loginAdmin.inputPass(pass);
        loginAdmin.clickLogIn();
    }
}
