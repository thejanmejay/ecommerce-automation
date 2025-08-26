package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Search {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By searchBox = By.id("search_query_top");

    // Constructor
    public Search(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }//

    // Page Actions
    public void enterSearchText(String text) {
        WebElement box = wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        box.clear();
        box.sendKeys(text);
    }

    public void submitSearch() {
        WebElement box = driver.findElement(searchBox);
        box.sendKeys(Keys.ENTER);
        // click on search button if needed
        // driver.findElement(By.xpath("//button[@name='submit_search']").click();
    }

    // Combined action
    public void searchForItem(String text) {
        enterSearchText(text);
        submitSearch();
    }
}
