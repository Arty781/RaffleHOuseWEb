package serenity.admin;

import driver.DriverSingleton;
import net.thucydides.core.annotations.Step;
import pages.admin_cite.DreamHomePage;

public class DreamHomeSteps {
    private static DriverSingleton DrS;
    DreamHomePage dreamHomePage;

   /* @Step
    public void openDreamHomePage() {
        dreamHomePage.setDriver(DrS.getDriver());
        dreamHomePage.clickDreamHome();
    }*/

    public void clickAddNewDreamHome() {
        dreamHomePage.clickAddNewDreamHome();
    }

    public void inputTitle(String title) {
        dreamHomePage.inputTitle(title);
    }

    public void inputAddress(String string) {
        dreamHomePage.inputAddress(string);
    }

    public void ChooseStartDateAsNextMonth() {
        dreamHomePage.clickStartDate();
        dreamHomePage.clickNextMonth();
        dreamHomePage.clickFirstDateCell();
    }

    public void ChooseFinishDateAsNextMonth() {
        dreamHomePage.clickFinishDate();
        dreamHomePage.clickNextMonthOnFinish();
        dreamHomePage.clickNextMonthOnFinish();
        dreamHomePage.clickFirstDateCell();
    }

    public void switchIsTrending() {
        dreamHomePage.clickIsTrandingToggle();
    }

    public void goToDescription() {
        dreamHomePage.goToDescription();
    }

    public void inputBadroomDescription(String string) {
        dreamHomePage.inputBadroomDescription(string);
    }

    public void loadGooglePictureAsBadroom() {
        dreamHomePage.clickSelectBadroomPicture();

    }
}
