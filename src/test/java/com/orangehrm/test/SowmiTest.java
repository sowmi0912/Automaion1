package com.orangehrm.test;

import com.orangehrm.DashboardPage;
import com.orangehrm.LoginPage;
import com.orangehrm.SowmiLogin;
import controllers.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SowmiTest extends TestBase {
    @Test
    public void VerifyAddTest() {
        softAssert = new SoftAssert();
        /*click View  Admin */
        SowmiLogin.dashboardClickEvents();

        SowmiLogin.clickAddUser();

        SowmiLogin.setEmpName("Ananya Dash");
        SowmiLogin.setUserNamee("Sowmi");
        SowmiLogin.setPasswordd("Sowmi123");
        SowmiLogin.setConfirmPassword("Sowmi123");


        SowmiLogin.clickbtnSave();
        softAssert.assertTrue(DashboardPage.isDashboardPageDisplay(), "Dashboard page is not Display");
        softAssert.assertAll();
    }

    @BeforeMethod
    public void login()
    {
       LoginTest.VerifyloginTest();
    }


}