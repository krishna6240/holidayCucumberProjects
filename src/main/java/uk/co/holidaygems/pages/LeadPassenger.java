package uk.co.holidaygems.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.holidaygems.utility.Utility;

public class LeadPassenger extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public LeadPassenger() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "BookingFormData_PassengerDetails_0__Title")
    WebElement Title;
    @CacheLookup
    @FindBy(name = "BookingFormData.PassengerDetails[0].FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(name = "BookingFormData.PassengerDetails[0].MiddleName")
    WebElement middleName;
    @CacheLookup
    @FindBy(name = "BookingFormData.PassengerDetails[0].LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "day-pax-0")
    WebElement day;
    @CacheLookup
    @FindBy(id = "month-pax-0")
    WebElement month;
    @CacheLookup
    @FindBy(id = "year-pax-0")
    WebElement year;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BookingFormData_ContactDetails_PrimaryNumber']")
    WebElement primaryNumber;
    @CacheLookup
    @FindBy(css = "#BookingFormData_ContactDetails_EmailAddress1")
    WebElement emailAddress;
    @CacheLookup
    @FindBy(css = "#BookingFormData_ContactDetails_EmailAddress2")
    WebElement confirmEmailAddress;
    @CacheLookup
    @FindBy(xpath = "///a[@id='passengerDetails']")
    WebElement continubtn;

    public void selectTitle(String text) {
        pmSelectByValueFromDropDown(Title, text);

    }
    public void enterfirstName(String text) {
        pmSendTextToElement(firstName, text);

    }
    public void enterMiddleName(String text) {
        pmSendTextToElement(middleName, text);

    }
    public void enterLastName(String text) {
        pmSendTextToElement(lastName, text);

    }
    public void selectDay(String value) {
        pmSelectByValueFromDropDown(day, value);

    }
    public void selectMonth(String value) {
        pmSelectByValueFromDropDown(month, value);

    }
    public void selectYear(String value) {
        pmSelectByValueFromDropDown(year, value);

    }
    public void enterPrimaryNumber(String value) {
        pmSendTextToElement(primaryNumber, value);

    }
    public void enterEmail(String text) {
        pmSendTextToElement(emailAddress, text);

    }
    public void enterConfirmEmail(String text) {
        pmSendTextToElement(confirmEmailAddress, text);

    }
    public void clickOnContinueBtn() {
        pmClickOnElement(continubtn);

    }
}
