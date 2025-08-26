package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabSwitch {
	WebDriver driver;
	private WebDriverWait wait;

	// Corrected Locators
	private By tab1 = By.xpath("//ul[@class='sf-menu']//a[@title='Dresses']");
	private By tab2 = By.xpath("//ul[@class='sf-menu']//a[@title='T-shirts']");
	private By tab3 = By.xpath("//ul[@class='sf-menu']//a[@title='Blog']");


	// Constructor
	public TabSwitch(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
	}

	// Page Actions
	public void switchToTab1() {
        WebElement tabElement1 = wait.until(ExpectedConditions.elementToBeClickable(tab1));
        tabElement1.click();
        System.out.println("Switched to Tab 1 (Dresses)");
    }

	public void switchToTab2() {
		WebElement tabElement2 = wait.until(ExpectedConditions.elementToBeClickable(tab2));
		tabElement2.click();
		System.out.println("Switched to Tab 2 (T-shirts)");
	}

	public void switchToTab3() {
		WebElement tabElement3 = wait.until(ExpectedConditions.elementToBeClickable(tab3));
		tabElement3.click();
		System.out.println("Switched to Tab 3 (Blog)");
	}

	// Combined action
	public void switchToTab(String tabName) {
		switch (tabName.toLowerCase()) {
		case "tab1":
			switchToTab1();
			break;
		case "tab2":
			switchToTab2();
			break;
		case "tab3":
			switchToTab3();
			break;
		default:
			System.out.println("Invalid tab name: " + tabName);
		}
	}

}
