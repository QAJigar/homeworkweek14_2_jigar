package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement loginErrorMessage;


    public void enterUsername(String value) {
        sendTextToElement(userNameField, value);
        Reporter.log("enter " + value);
        CustomListeners.test.log(Status.PASS, "enter " + value);

    }

    public void enterPassword(String value) {
        sendTextToElement(passwordField, value);
        Reporter.log("enter " + value);
        CustomListeners.test.log(Status.PASS, "enter " + value);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        Reporter.log("click on " + loginButton);
        CustomListeners.test.log(Status.PASS, "click on " + loginButton);
    }

    public void loginToApp(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickOnLoginButton();
    }

    public String getLoginErrorMsg() {
        Reporter.log("get " + loginErrorMessage);
        CustomListeners.test.log(Status.PASS, "get " + loginErrorMessage);
        return getTextFromElement(loginErrorMessage);
    }


}
