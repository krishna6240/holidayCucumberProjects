$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineBooking.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10657475601,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "TC-001 Create New User/SignUp",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-001-create-new-user/signup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I send email on email textBox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "onlineBookingStepsdef.iAmOnHomePage()"
});
formatter.result({
  "duration": 233387100,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iSendEmailOnEmailTextBox()"
});
formatter.result({
  "duration": 304572899,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iClickOnSignupButton()"
});
formatter.result({
  "duration": 678625100,
  "status": "passed"
});
formatter.after({
  "duration": 1018027201,
  "status": "passed"
});
formatter.before({
  "duration": 4849602900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "TC-002 Input all information on Search Form",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-002-input-all-information-on-search-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I select DepartFrom",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can Input destination \"Costa Almeria - Spain\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I can select date",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I can view offer",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I can check Availability",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Nights \"3 Nights\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I can select Boardbasis \"All Inclusive\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I can select Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I can click on Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I can select Room",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I can click on continue",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I can click On checkout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "onlineBookingStepsdef.iAmOnHomePage()"
});
formatter.result({
  "duration": 46801,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iSelectDepartFrom()"
});
formatter.result({
  "duration": 325718701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Costa Almeria - Spain",
      "offset": 25
    }
  ],
  "location": "onlineBookingStepsdef.iCanInputDestination(String)"
});
formatter.result({
  "duration": 718752100,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanSelectDate()"
});
formatter.result({
  "duration": 1083960200,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanViewOffer()"
});
formatter.result({
  "duration": 1928869199,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanCheckAvailability()"
});
formatter.result({
  "duration": 333519899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3 Nights",
      "offset": 19
    }
  ],
  "location": "onlineBookingStepsdef.iClickOnNights(String)"
});
formatter.result({
  "duration": 114040800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Inclusive",
      "offset": 25
    }
  ],
  "location": "onlineBookingStepsdef.iCanSelectBoardbasis(String)"
});
formatter.result({
  "duration": 56614400,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanSelectRooms()"
});
formatter.result({
  "duration": 197377001,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanClickOnSearchButton()"
});
formatter.result({
  "duration": 118801201,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanSelectRoom()"
});
formatter.result({
  "duration": 20072366001,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#lblPrice-28174-0-0\"}\n  (Session info: chrome\u003d99.0.4844.51)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027DELL7480\u0027, ip: \u0027172.24.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [c892736d10d8205490c76099312498ea, findElement {using\u003dcss selector, value\u003d#lblPrice-28174-0-0}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.51, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\Krishna\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:58476}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:58476/devtoo..., se:cdpVersion: 99.0.4844.51, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c892736d10d8205490c76099312498ea\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy24.click(Unknown Source)\r\n\tat uk.co.holidaygems.utility.Utility.pmClickOnElement(Utility.java:36)\r\n\tat uk.co.holidaygems.pages.SearchForm.selectRoomAndclick(SearchForm.java:154)\r\n\tat uk.co.holidaygems.cucumber.steps.onlineBookingStepsdef.iCanSelectRoom(onlineBookingStepsdef.java:75)\r\n\tat ✽.And I can select Room(onlineBooking.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanClickOnContinue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanClickOnCheckoutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1817601799,
  "status": "passed"
});
});