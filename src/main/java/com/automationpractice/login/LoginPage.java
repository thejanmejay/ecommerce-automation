package com.automationpractice.login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By signInLink = By.xpath("//a[normalize-space()='Sign in']");
    private By emailCreate = By.id("email_create");
    private By submitCreate = By.id("SubmitCreate");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Actions
    public void clickSignIn() {
        driver.findElement(signInLink).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailCreate).sendKeys(email);
    }

    public void clickCreateAccount() {
        driver.findElement(submitCreate).click();
    }

    // Combined action
    public void createNewAccount(String email) {
        clickSignIn();
        enterEmail(email);
        clickCreateAccount();
    }
}
