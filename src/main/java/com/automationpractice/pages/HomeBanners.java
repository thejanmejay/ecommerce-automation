package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomeBanners {

    private WebDriver driver;

    // Locator for the banners UL
    private By bannersList = By.cssSelector("ul.htmlcontent-home");
    private By bannerItems = By.cssSelector("ul.htmlcontent-home li");

    // Constructor
    public HomeBanners(WebDriver driver) {
        this.driver = driver;
    }

    // Page Actions

    // Check if banners container is displayed
    public boolean isBannersDisplayed() {
        return driver.findElement(bannersList).isDisplayed();
    }

    // Get total number of banner items
    public int getBannerCount() {
        List<WebElement> items = driver.findElements(bannerItems);
        return items.size();
    }

    // Get banner element at given index (0-based)
    public WebElement getBanner(int index) {
        List<WebElement> items = driver.findElements(bannerItems);
        return items.get(index);
    }

    // Get banner link URL at given index
    public String getBannerLink(int index) {
        return getBanner(index).findElement(By.tagName("a")).getAttribute("href");
    }

    // Get banner image URL at given index
    public String getBannerImageSrc(int index) {
        return getBanner(index).findElement(By.tagName("img")).getAttribute("src");
    }
}
