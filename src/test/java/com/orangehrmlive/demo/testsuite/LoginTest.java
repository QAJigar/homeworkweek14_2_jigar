package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class LoginTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    DashboardPage dashboardPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        dashboardPage = new DashboardPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    //login in the Page
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.loginToApp("Admin", "admin123");
    }

    @Test(groups = {"smoke", "regression"})
    //login in the App and verify logo is displayed
    public void verifyThatTheLogoDisplayOnHomePage() {
        loginPage.loginToApp("Admin", "admin123");
        Assert.assertEquals(homePage.isLogoDisplayed(), true);
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully() {
        loginPage.loginToApp("Admin", "admin123");
        dashboardPage.clickOnUserProfileLogo();
        dashboardPage.clickOnLogoutButton();
    }

    @Test(groups = {"regression"}, dataProvider = "loginData", dataProviderClass = TestData.class)
    //login in the App
    public void verifyErrorMessageWithInvalidCredentials(String username, String pwd, String errorMsg) {
        loginPage.loginToApp(username,pwd);
        Assert.assertEquals(loginPage.getLoginErrorMsg(), errorMsg);
    }
}
