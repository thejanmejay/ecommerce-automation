package com.automationpractice.tests;

import org.testng.annotations.Test;
import com.automationpractice.base.BaseTest;
import com.automationpractice.login.CreateAccount;

public class CreateAccountTest extends BaseTest {

    @Test(groups = {"AccoutActions"})
    public void createAccountTest() {
        CreateAccount accountCreate = new CreateAccount(driver);
        accountCreate.createNewAccount("Test@gmail.com");
        System.out.println("Account creation process performed.");
    }
}
