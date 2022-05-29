package com.orangehrm;

import controllers.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class SowmiLogin extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By viewAdminModule = By.id("menu_admin_viewAdminModule");
    private static By userManagement = By.id("menu_admin_UserManagement");
    private static By viewSystemUsers = By.id("menu_admin_viewSystemUsers");
    private static By addUser = By.id("btnAdd");
    private static By txtempName = By.id("systemUser_employeeName_empName");
    private static By txtuserName = By.id("systemUser_userName");
    private static By txtpassword = By.id("systemUser_password");
    private static By txtconfirmPassword = By.id("systemUser_confirmPassword");
    private static By btnSave = By.xpath("//input[@value='Save']");


    public static boolean isViewAdminModuleDisplay() {

        return getDriver().findElement(viewAdminModule).isDisplayed();
    }
    public static boolean isUserManagementDisplay() {

        return getDriver().findElement(userManagement).isDisplayed();
    }
    public static boolean isviewSystemUsersDisplay() {

        return getDriver().findElement(viewSystemUsers).isDisplayed();
    }
    public static boolean isaddUser() {

        return getDriver().findElement(addUser).isDisplayed();
    }
    public static boolean isEmpNameDisplay() {

        return getDriver().findElement(txtempName).isDisplayed();
    }
    public static boolean isUserNameDisplay() {

        return getDriver().findElement(txtuserName).isDisplayed();
    }

    public static boolean isPasswordDisplay() {

        return getDriver().findElement(txtpassword).isDisplayed();
    }

    public static boolean isConfirmPasswordDisplay() {

        return getDriver().findElement(txtconfirmPassword).isDisplayed();
    }

    public static boolean isbtnSaveDisplay() {

        return getDriver().findElement(btnSave).isDisplayed();
    }




    public static void clickViewAdminModule() {
        getDriver().findElement(viewAdminModule).click();
    }

    public static void clickUserManagement() {
        getDriver().findElement(userManagement).click();
    }

    public static void clickViewSystemUsers() {
        getDriver().findElement(viewSystemUsers).click();
    }

    public static void clickAddUser() {
        getDriver().findElement(addUser).click();
    }

    public static void setEmpName(String employeeName) {

        getDriver().findElement(txtempName).sendKeys(employeeName);
    }

    public static void setUserNamee(String userName) {
        getDriver().findElement(txtuserName).sendKeys(userName);
    }

    public static void setPasswordd(String password) {

        getDriver().findElement(txtpassword).sendKeys(password);
    }

    public static void setConfirmPassword(String confirmPassword) {

        getDriver().findElement(txtconfirmPassword).sendKeys(confirmPassword);
    }

    public static void clickbtnSave() {
        getDriver().findElement(btnSave).click();
    }
    /*dashboards events*/
    public static void dashboardClickEvents(){
        SowmiLogin.clickViewAdminModule();
        SowmiLogin.clickUserManagement();
        SowmiLogin.clickViewSystemUsers();
    }

}

