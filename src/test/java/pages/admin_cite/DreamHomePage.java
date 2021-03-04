package pages.admin_cite;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://admin-staging.rafflehouse.com/#/dreamHome")
public class DreamHomePage extends PageObject {
    @FindBy(css = "a[title='Dream home']")
    private WebElement dreamHome;

    @FindBy(xpath = "//span[text()='Add new dream home']")
    private WebElement addDreamHome;

    @FindBy(id = "name")
    private WebElement title;

    @FindBy(css="div.MuiInput-formControl input")
    private WebElement address;

    @FindBy(css = "select.react-datetime-picker__inputGroup__input")
    private WebElement ampmChooser1;

    @FindBy(css = "input[name='day']")//"button.react-datetime-picker__calendar-button")//"input[name='year']:nth-child(1)")
    private WebElement dataTimePicker1;

    @FindBy(xpath = "(//input[@name='day'])[2]")
    private WebElement dataTimePicker2;

    @FindBy(css = "button.react-calendar__navigation__next-button")
    private WebElement nextMonthArrow;

    @FindBy(xpath = "(//button[text()='›'])[2]")
    private WebElement nextMonthArrowSecond;

    @FindBy(css = "button.react-calendar__navigation__next2-button")
    private WebElement nextYearBtn;

    @FindBy(css = "button abbr")
    private WebElement firstDateCell;

    @FindBy(id = "isTrending")
    private WebElement isTrandingToggle;

    @FindBy(css = "div[role='toolbar'] button:nth-child(1)")
    private WebElement saveBtn;

    @FindBy(xpath = "//span[text()='Description']")
    private WebElement descriptionTab;

    @FindBy(css = "div.ql-editor p")
    private WebElement BadroomDescriptonInput;

    @FindBy(id="property.filesBedroom")
    private WebElement BadroomPictureChooser;


    @FindBy(css = "div[role='toolbar'] button:nth-child(2)")
    private WebElement cancelBtn;

    public void clickAddNewDreamHome() {
        addDreamHome.click();
    }

    public void inputTitle(String inp) {
        title.sendKeys(inp);
    }

    public void inputAddress(String inp) {
        address.sendKeys(inp);
    }

    public void clickStartDate() {
        /*dataTimePicker1.sendKeys(Keys.TAB);

        //Fill time as 02:45 PM

        dataTimePicker1.sendKeys("0245PM");*/

        dataTimePicker1.click();
    }

    public void clickFinishDate() {
        dataTimePicker2.click();
    }

    public void clickNextMonth() {
        nextMonthArrow.click();
    }

    public void clickFirstDateCell() {
        firstDateCell.click();
    }

    public void clickIsTrandingToggle() {
        isTrandingToggle.click();
    }

    public void goToDescription() {
        descriptionTab.click();
    }

    public void inputBadroomDescription(String string) {
        BadroomDescriptonInput.sendKeys(string);
    }

    public void clickSelectBadroomPicture() {
        BadroomPictureChooser.click();
    }

    public void clickDreamHome() {
        dreamHome.click();
    }

    public void clickNextMonthOnFinish(){
        nextMonthArrowSecond.click();
    }
}
