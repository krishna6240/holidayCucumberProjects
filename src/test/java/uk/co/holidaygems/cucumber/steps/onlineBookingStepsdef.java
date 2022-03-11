package uk.co.holidaygems.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.holidaygems.pages.Address;
import uk.co.holidaygems.pages.HomePage;
import uk.co.holidaygems.pages.LeadPassenger;
import uk.co.holidaygems.pages.SearchForm;

public class onlineBookingStepsdef {
    static String email1 = "abcde@gmail.com";
    static String PrimaryNo = "07447588091";
    static String EmailAddress = "xyz@gmail.com";
    static String ConfirmEmail = "xyz@gmail.com";

    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }


    @When("^I send email on email textBox$")
    public void iSendEmailOnEmailTextBox() {
        new HomePage().sendEmailOnTextbox(email1);
    }

    @And("^I click on signup button$")
    public void iClickOnSignupButton() {
        new HomePage().clickOnSignInButton();
    }

    @Then("^I should verify the massage for successful signup$")
    public void iShouldVerifyTheMassageForSuccessfulSignup(String Text) {
        new HomePage().verifyThankMsg(Text);
        new HomePage().clickOnAcceptcookies();
    }

    @When("^I can Input destination \"([^\"]*)\"$")
    public void iCanInputDestination(String text) {
        new SearchForm().inputYourDestination(text);
        new SearchForm().selectCity();
    }

    @And("^I can select date$")
    public void iCanSelectDate() {
        new SearchForm().selectDate();
    }

    @And("^I can select final date$")
    public void iCanSelectFinalDate() {
        new SearchForm().selectDate();
    }

    @And("^I can view offer$")
    public void iCanViewOffer() {
        new SearchForm().clickOnViewOffer();
    }

    @And("^I can check Availability$")
    public void iCanCheckAvailability() {
        new SearchForm().clickOnAvailability();
    }


    @And("^I can select Rooms$")
    public void iCanSelectRooms() {
        new SearchForm().clickOnRooms();
    }

    @And("^I can click on Search Button$")
    public void iCanClickOnSearchButton() {
        new SearchForm().clickOnSearchbtn();
    }

    @And("^I can select Room$")
    public void iCanSelectRoom() {
        new SearchForm().selectRoomAndclick();
    }

    @And("^I can click on continue$")
    public void iCanClickOnContinue() {
        new SearchForm().clickOnContinue();

    }

    @Then("^I can click On checkout Button$")
    public void iCanClickOnCheckoutButton() {
        new SearchForm().clickOncheckout();
    }

    @When("^I select DepartFrom$")
    public void iSelectDepartFrom() {
        new SearchForm().selectDepartFrom();
    }

    @And("^I click on Nights \"([^\"]*)\"$")
    public void iClickOnNights(String text) {
        new SearchForm().clickOnNights(text);
    }


    @And("^I can select Boardbasis \"([^\"]*)\"$")
    public void iCanSelectBoardbasis(String text) {
        new SearchForm().selectBoardbasis(text);

    }

    @And("^I can add adults \"([^\"]*)\"$")
    public void iCanAddAdults(String value) {
        new SearchForm().selectadult(value);
    }

    @And("^I can click on Apply button$")
    public void iCanClickOnApplyButton() {
        new SearchForm().clickOnApply();
    }

    @And("^I enter FirstName \"([^\"]*)\"$")
    public void iEnterFirstName(String name) {
        new LeadPassenger().enterfirstName(name);
    }

    @And("^I enter MiddleName \"([^\"]*)\"$")
    public void iEnterMiddleName(String text) {
        new LeadPassenger().enterMiddleName(text);
    }

    @And("^I enter LastName \"([^\"]*)\"$")
    public void iEnterLastName(String text) {
        new LeadPassenger().enterLastName(text);

    }


    @And("^I enter Title \"([^\"]*)\"$")
    public void iEnterTitle(String text ){
        new LeadPassenger().selectTitle(text);

    }

    @And("^I enter Primary Number$")
    public void iEnterPrimaryNumber() {
        new LeadPassenger().enterPrimaryNumber(PrimaryNo);
    }

    @And("^I enter Email Address$")
    public void iEnterEmailAddress() {
        new LeadPassenger().enterEmail(EmailAddress);
    }

    @And("^I enter confirm Email Address$")
    public void iEnterConfirmEmailAddress() {
        new LeadPassenger().enterConfirmEmail(ConfirmEmail);
    }

    @And("^I click on Continue Button$")
    public void iClickOnContinueButton() {
        new LeadPassenger().clickOnContinueBtn();
    }

    @And("^I enter House Number$")
    public void iEnterHouseNumber(String number) {
        new Address().enterHouseNo(number);
    }

    @And("^I enter (\\d+)nd Line Address$")
    public void iEnterNdLineAddress(String text) {
        new Address().enterSecoundLineAddress(text);
    }

    @And("^I enter City$")
    public void iEnterCity(String name) {
        new Address().enterCityName(name);
    }

    @And("^I enter County$")
    public void iEnterCounty(String name) {
        new Address().enterCountyName(name);
    }

    @And("^I enter Country$")
    public void iEnterCountry(String value) {
        new Address().selectCountryFromDropDown(value);
    }

    @And("^I enter PostCode$")
    public void iEnterPostCode(String text) {
        new Address().enterPostCode(text);
    }

    @Then("^I click on Continue Btn$")
    public void iClickOnContinueBtn() {
        new Address().clickOnContinueButton();
    }


    @And("^I enter day \"([^\"]*)\"$")
    public void iEnterDay(String value) {
        new LeadPassenger().selectDay(value);
    }

    @And("^I enter month \"([^\"]*)\"$")
    public void iEnterMonth(String value) {
        new LeadPassenger().selectMonth(value);
    }

    @And("^I enter year \"([^\"]*)\"$")
    public void iEnterYear(String value) {
        new LeadPassenger().selectYear(value);
    }
}
