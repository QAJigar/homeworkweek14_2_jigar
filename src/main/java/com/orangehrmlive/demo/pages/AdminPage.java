package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AdminPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUsersText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;


    public String getSystemUsersText() {
        Reporter.log("get " + systemUsersText);
        CustomListeners.test.log(Status.PASS, "get " + systemUsersText);
        return getTextFromElement(systemUsersText);
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
        Reporter.log("click " + addButton);
        CustomListeners.test.log(Status.PASS, "click " + addButton);
    }




}
