package uk.co.holidaygems.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.holidaygems.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='newslettersignupbutton']")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='newslettersignupform']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Thank you for subscribing.')]")
    WebElement thankyouMsg;
    @CacheLookup
    @FindBy(id = "acceptcookies")
    WebElement acceptcookies;

    public void sendEmailOnTextbox(String email1) {
        log.info("clicking on sign in button : " + email.toString());
        pmSendTextToElement(email, email1);
    }

    public void clickOnSignInButton() {
        log.info("clicking on sign in button : " + signInButton.toString());
        pmClickOnElement(signInButton);
    }


    public void verifyThankMsg(String Text){
        log.info("verifying the order is completed : " + thankyouMsg.getText()+ "<br>");
        Assert.assertTrue(thankyouMsg.getText().contains(Text));
    }
    public void clickOnAcceptcookies(){
        pmClickOnElement(acceptcookies);
    }
}