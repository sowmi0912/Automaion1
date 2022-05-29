package com.orangehrm;

import controllers.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;


import org.apache.log4j.Logger;

public class LoginPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By hdrLogin = By.id("logInPanelHeading");
    private static By txtUserName = By.id("txtUsername");
    private static By txtPassword = By.id("txtPassword");
    private static By btnLogin = By.id("btnLogin");
    private static By alert = By.id("spanMessage");

    public static boolean isLoginPageDisplay() {

        return getDriver().findElement(hdrLogin).isDisplayed();
    }
    public static boolean isUserNameDisplay() {

        return getDriver().findElement(txtUserName).isDisplayed();
    }
    public static boolean isPasswordDisplay() {

        return getDriver().findElement(txtPassword).isDisplayed();
    }
    public static boolean isLoginbuttonDisplay() {

        return getDriver().findElement(btnLogin).isDisplayed();
    }

    public static void setUserName(String userName) {

        getDriver().findElement(txtUserName).sendKeys(userName);
    }

    public static void setPassword(String password) {
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickLogin() {
        getDriver().findElement(btnLogin).click();
    }

    public static boolean isLoginAlertDisplay() {
        return getDriver().findElement(alert).isDisplayed();
    }

    public static String getLoginAlert() {
        return  getDriver().findElement(alert).getText();
    }
}
