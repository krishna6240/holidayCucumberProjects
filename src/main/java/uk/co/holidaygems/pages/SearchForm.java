package uk.co.holidaygems.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.holidaygems.utility.Utility;

import java.util.List;

public class SearchForm extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public SearchForm() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "search_form_to")
    WebElement destination;
    @CacheLookup
    @FindBy(xpath = "//div[@id='DepartureControl']//i[@class='fa fa-chevron-down']")
    WebElement departfrom;
    @CacheLookup
    @FindBy(xpath = "//label[@for='London']//span")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search_depart']")
    WebElement selectDate;
    @CacheLookup
    @FindBy(id = "_hjRemoteVarsFrame")
    WebElement iframe;
    @CacheLookup
    @FindBy(id = "6-2022")
    WebElement month;
    @FindBy(xpath = "//a[contains(text(),'16')]")
    WebElement finaldate;
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Offer')])[1]")
    WebElement viewoffer;
    @CacheLookup
    @FindBy(id = "CheckAvailability")
    WebElement checkavailable;
    @CacheLookup
    @FindBy(xpath = "//div[@class='dropbtn']")
    WebElement selectnights;
    @CacheLookup
    @FindBy(id = "d3")
    List<WebElement> nights;
    @CacheLookup
    @FindBy(id = "AI")
    List<WebElement> boardbasis;
    @CacheLookup
    @FindBy(id = "search_rooms_summary_chev")
    WebElement searchroom;
    @CacheLookup
    @FindBy(linkText = "Apply")
    WebElement apply;
    @CacheLookup
    @FindBy(id = "search_button")
    WebElement searchbtn;
    @CacheLookup
    @FindBy(css = "#lblPrice-28174-0-0")
    WebElement selectroom;
    @CacheLookup
    @FindBy(css = "#search_pax_adults_input_room_1")
    WebElement selectadult;
    @CacheLookup
    @FindBy(css = ".button-continue.continueflightsummary")
    WebElement continueflight;
    @CacheLookup
    @FindBy(xpath = "//div[@class='proceedBooking']")
    WebElement checkout;

    public void inputYourDestination(String text) {
        pmSendTextToElement(destination, text);

    }

    public void selectDepartFrom() {
        pmMouseHoverAndClick(departfrom);
    }

    public void selectCity() {
        pmClickOnElement(city);
    }

    public void selectDate() {
        pmClickOnElement(selectDate);
        // Date Selection
        String date = "25";
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }

        }
    }


    public void clickOnViewOffer() {
        pmClickOnElement(viewoffer);
    }

    public void clickOnAvailability() {
        pmClickOnElement(checkavailable);
    }

    public void clickOnNights(String text) {
        //pmClickOnElement(selectnights);
        for (WebElement day : nights) {
            if (day.getText().equals(text)) {
                log.info("Click on product '" + nights + "' : " + day.getText());
                clickOnElement(day);
                break;
            }
        }
    }

    public void selectBoardbasis(String text) {
        for (WebElement day : boardbasis) {
            if (day.getText().equals(text)) {
                log.info("Click on product '" + boardbasis + "' : " + day.getText());
                clickOnElement(day);
                break;
            }
        }
    }

    public void clickOnRooms() {
        pmMouseHoverAndClick(searchroom);
    }

    public void selectadult(String value) {
        pmSelectByValueFromDropDown(selectadult, value);
    }

    public void clickOnApply() {
        pmClickOnElement(apply);
    }

    public void clickOnSearchbtn() {
        pmClickOnElement(searchbtn);
    }

    public void selectRoomAndclick() {
        pmClickOnElement(selectroom);
    }

    public void clickOnContinue() {
        pmClickOnElement(continueflight);
    }

    public void clickOncheckout() {
        pmClickOnElement(checkout);
    }

}
