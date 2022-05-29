package com.orangehrm.test;

import com.orangehrm.DashboardPage;
import com.orangehrm.LoginPage;
import controllers.MethodBase;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest  {

    public static void VerifyloginTest() {


        LoginPage.setUserName("Admin");

        LoginPage.setPassword("admin123");

        LoginPage.clickLogin();

    }


}