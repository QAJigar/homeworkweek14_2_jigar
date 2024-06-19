package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddUserPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'oxd-select-wrapper'][1]")
    WebElement userRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement selectAdminRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[2]")
    WebElement statusDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Disabled')]")
    WebElement selectDisabledDropdown;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement empName;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userNameTextBox;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement selectDisableStatus;

//    @CacheLookup
//    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]")
//    WebElement statusDropdown;


    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;


    public String getAddUserText() {
        Reporter.log("get " + addUserText);
        CustomListeners.test.log(Status.PASS, "get " + addUserText);
        return getTextFromElement(addUserText);
    }

    public void clickOnRoleDropdown() {
        clickOnElement(userRoleDropdown);
        Reporter.log("click " + userRoleDropdown);
        CustomListeners.test.log(Status.PASS, "get " + userRoleDropdown);
    }

    public void selectAdminRoleFromDropdown() {
        clickOnElement(selectAdminRoleDropdown);
        Reporter.log("click " + selectAdminRoleDropdown);
        CustomListeners.test.log(Status.PASS, "click " + selectAdminRoleDropdown);
    }

   public void selectDisabledStatusFromDropdown() {
        clickOnElement(selectDisabledDropdown);
        Reporter.log("click " + selectDisabledDropdown);
        CustomListeners.test.log(Status.PASS, "click " + selectDisabledDropdown);
    }

    public void enterEmpName(String val) {
        sendTextToElement(empName, val);
        Reporter.log("click " + selectAdminRoleDropdown);
        CustomListeners.test.log(Status.PASS, "get " + selectAdminRoleDropdown);
    }

    public void enterUserName(String val) {
        sendTextToElement(userNameTextBox, val);
        Reporter.log("enter " + userNameTextBox);
        CustomListeners.test.log(Status.PASS, "enter " + userNameTextBox);
    }

    public void selectStatusDropdown() {
        clickOnElement(statusDropdown);
        Reporter.log("select " + statusDropdown);
        CustomListeners.test.log(Status.PASS, "select " + statusDropdown);
    }

    public void enterPassword(String val) {
        sendTextToElement(passwordField, val);
        Reporter.log("select " + passwordField);
        CustomListeners.test.log(Status.PASS, "select " + passwordField);
    }

    public void enterConfirmPassword(String val) {
        sendTextToElement(confirmPasswordField, val);
        Reporter.log("select " + confirmPasswordField);
        CustomListeners.test.log(Status.PASS, "select " + confirmPasswordField);
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
        Reporter.log("select " + saveButton);
        CustomListeners.test.log(Status.PASS, "select " + saveButton);
    }


}
