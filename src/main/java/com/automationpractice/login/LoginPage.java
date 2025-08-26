package com.automationpractice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators for login
    private By signInLink = By.xpath("//a[normalize-space()='Sign in']");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("passwd");
    private By signInBtn = By.id("SubmitLogin");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Actions
    public void clickSignIn() {
        driver.findElement(signInLink).click();
    }
    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickSignbtn() {
        driver.findElement(signInBtn).click();
    }

    // Combined action
    public void login(String email, String password) {
    	clickSignIn();
        enterEmail(email);
        enterPassword(password);
        clickSignbtn();
    }
}
