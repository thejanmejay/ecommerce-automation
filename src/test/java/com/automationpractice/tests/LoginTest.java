package com.automationpractice.tests;

import org.testng.annotations.Test;
import com.automationpractice.base.BaseTest;
import com.automationpractice.login.LoginPage;

public class LoginTest extends BaseTest {

    @Test(groups = {"AccoutActions"})
    public void loginTest() {
        
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser123@example.com", "Test@123");

        System.out.println("Login action performed.");
        // Add assertion to verify successful login
    }
}
