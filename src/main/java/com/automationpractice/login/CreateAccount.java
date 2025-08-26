package com.automationpractice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By signInLink = By.xpath("//a[normalize-space()='Sign in']");
    private By email = By.id("email_create");
    private By submitBtn = By.id("SubmitCreate");

    // Constructor
    public CreateAccount(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
    }

    // Page Actions
    // Navigate to Sign In page
    public void goToSignInPage() {
        driver.findElement(signInLink).click();
    }
    
    public void enterEmail(String userEmail) {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(email));
        emailField.clear();
        emailField.sendKeys(userEmail);
        System.out.println("Entered email for account creation: " + userEmail);
    }

    public void clickCreateAccount() {
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
        submitButton.click();
        System.out.println("Clicked on Create Account button");
    }

    // Combined action
    public void createNewAccount(String userEmail) {
    	goToSignInPage();
        enterEmail(userEmail);
        clickCreateAccount();
    }
}
