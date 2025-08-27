package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabSwitch {

    private WebDriver driver;
    private WebDriverWait wait;

    public TabSwitch(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
    }

    /**
     * Switch to a tab by its visible title.
     * Automatically hovers parent menus if necessary.
     */
    public void switchToTabByTitle(String title) {
        // Find the tab element dynamically
        String xpath = "//ul[@class='sf-menu']//a[@title='" + title + "']" +
                "[not(ancestor::ul[contains(@style,'display: none')])]";

        WebElement tabElement = driver.findElement(By.xpath(xpath));

        // Hover over parent menus if the element is not immediately clickable
        try {
            wait.until(ExpectedConditions.elementToBeClickable(tabElement));
        } catch (Exception e) {
            // Find all parent menus
            WebElement parentMenu = tabElement.findElement(By.xpath("ancestor::ul[@class='sf-menu']/li/a"));
            if (parentMenu != null) {
                Actions actions = new Actions(driver);
                actions.moveToElement(parentMenu).perform();
                // Wait for submenu to appear
                tabElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            }
        }

        tabElement.click();
        System.out.println("Switched to tab: " + title);
    }

    // Convenience methods
    public void switchToTab1() { switchToTabByTitle("Dresses"); }
    public void switchToTab2() { switchToTabByTitle("T-shirts"); }
    public void switchToTab3() { switchToTabByTitle("Blog"); }
}
