package uk.co.holidaygems.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.holidaygems.utility.Utility;

public class Address extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public Address() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='search']")
    WebElement streetName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BookingFormData_PaymentDetails_HouseNoName']")
    WebElement HouseNo;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BookingFormData_PaymentDetails_Street']")
    WebElement SecoundLineAddress;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BookingFormData_PaymentDetails_Town']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BookingFormData_PaymentDetails_County']")
    WebElement county;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BookingFormData_PaymentDetails_Country']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BookingFormData_PaymentDetails_PostCode']")
    WebElement Postcode;
    @CacheLookup
    @FindBy(xpath = "//a[@id='contactDetailsGo']")
    WebElement countiBtn;

    public void enterStreetName(String name) {
        log.info("clicking on sign in button : " + streetName.toString());
        pmSendTextToElement(streetName, name);
    }
    public void enterHouseNo(String number) {
        log.info("clicking on sign in button : " + HouseNo.toString());
        pmSendTextToElement(HouseNo, number);
    }
    public void enterSecoundLineAddress(String text) {
        log.info("clicking on sign in button : " + SecoundLineAddress.toString());
        pmSendTextToElement(SecoundLineAddress, text);
    }
    public void enterCityName(String name) {
        log.info("clicking on sign in button : " + city.toString());
        pmSendTextToElement(city, name);
    }
    public void enterCountyName(String name) {
        log.info("clicking on sign in button : " + county.toString());
        pmSendTextToElement(county, name);
    }
    public void selectCountryFromDropDown(String value) {
        log.info("clicking on sign in button : " + country.toString());
        pmSelectByValueFromDropDown(country, value);
    }
    public void enterPostCode(String text) {
        log.info("clicking on sign in button : " + Postcode.toString());
        pmSendTextToElement(Postcode, text);
    }
    public void clickOnContinueButton(){
        pmClickOnElement(countiBtn);

    }
}
