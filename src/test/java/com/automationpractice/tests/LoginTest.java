package com.automationpractice.tests;

import org.testng.annotations.Test;

import com.automationpractice.base.BaseTest;
import com.automationpractice.login.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.createNewAccount("testuser123@example.com");
        System.out.println("Account creation process initiated.");
        // Add assertion here if needed, e.g., check for account creation page
    }
}
