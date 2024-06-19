package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class ViewSystemUsersPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'oxd-select-wrapper'][1]")
    WebElement userRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement selectAdminRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'ESS')]")
    WebElement selectESSRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[2]")
    WebElement statusDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Enabled')]")
    WebElement selectEnabledDropdown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Disabled')]")
    WebElement selectDisabledDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card']//div[@role='row']//div[@role='cell']")
    List<WebElement> userDetailsRow;

    @CacheLookup
    @FindBy(xpath = "//div[@role='table']//div[1]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1]")
    WebElement selectUserCheckbox;

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-container']//button[1]")
    WebElement deleteUserButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement yesDeleteButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement toasterSuccessDelete;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement recordFoundText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-paper-container']/div[@class='orangehrm-container']/div[@role='table']/div[@role='rowgroup']/div[@class='oxd-table-card']/div[@role='row']/div[2]")
    WebElement usernameText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement empNameField;

    public void enterUsername(String val) {
        sendTextToElement(usernameField, val);
        Reporter.log("enter " + val);
        CustomListeners.test.log(Status.PASS, "enter " + val);
    }

    public void clickOnRoleDropdown() {
        clickOnElement(userRoleDropdown);
        Reporter.log("click " + userRoleDropdown);
        CustomListeners.test.log(Status.PASS, "get " + userRoleDropdown);
    }

    public void selectRoleFromDropdown(String role) {
        if (role == "Admin")
            clickOnElement(selectAdminRoleDropdown);
        if (role == "ESS")
            clickOnElement(selectESSRoleDropdown);
        Reporter.log("click " + role);
        CustomListeners.test.log(Status.PASS, "click " + role);
    }

    public void selectStatusFromDropdown(String status) {
        if (status == "Enabled")
            clickOnElement(selectEnabledDropdown);
        if (status == "Disabled")
            clickOnElement(selectDisabledDropdown);
        Reporter.log("click " + status);
        CustomListeners.test.log(Status.PASS, "click " + status);
    }

    public void selectStatusDropdown() {
        clickOnElement(statusDropdown);
        Reporter.log("select " + statusDropdown);
        CustomListeners.test.log(Status.PASS, "select " + statusDropdown);
    }

    public void clickOnSearchButton() {

        clickOnElement(searchButton);
        Reporter.log("click " + searchButton);
        CustomListeners.test.log(Status.PASS, "click " + searchButton);
    }

    public void clickOnResetButton() {
        clickOnElement(resetButton);
        Reporter.log("click " + resetButton);
        CustomListeners.test.log(Status.PASS, "click " + resetButton);
    }

    public List<String> getUserDetails() {
        List<String> userDetails = new ArrayList<>();
        List<WebElement> userDetails1 = userDetailsRow;
        for (WebElement e : userDetails1)
            userDetails.add(e.getText());
        return userDetails;
    }

    public void clickOnSelectUserCheckbox() {
        clickOnElement(selectUserCheckbox);
        Reporter.log("click " + selectUserCheckbox);
        CustomListeners.test.log(Status.PASS, "click " + selectUserCheckbox);
    }

    public void clickOnDeleteUserButton() {
        clickOnElement(deleteUserButton);
        Reporter.log("click " + deleteUserButton);
        CustomListeners.test.log(Status.PASS, "click " + deleteUserButton);
    }

    public void clickOnYesDeleteButton() {
        clickOnElement(yesDeleteButton);
        Reporter.log("click " + yesDeleteButton);
        CustomListeners.test.log(Status.PASS, "click " + yesDeleteButton);
    }

    public String getSuccessDeleteToasterMsg() {
        Reporter.log("click " + toasterSuccessDelete);
        CustomListeners.test.log(Status.PASS, "click " + toasterSuccessDelete);
        return getTextFromElement(toasterSuccessDelete);
    }

    public String getRecordFoundText() {
        Reporter.log("get " + recordFoundText);
        CustomListeners.test.log(Status.PASS, "get " + recordFoundText);
        return getTextFromElement(recordFoundText);
    }

    public String getUsernameText() {
        Reporter.log("get " + usernameText);
        CustomListeners.test.log(Status.PASS, "get " + usernameText);
        return getTextFromElement(usernameText);
    }

    public void enterEmpName(String val) {
        sendTextToElement(empNameField, val);
        Reporter.log("enter " + empNameField);
        CustomListeners.test.log(Status.PASS, "enter " + empNameField);
    }


}
