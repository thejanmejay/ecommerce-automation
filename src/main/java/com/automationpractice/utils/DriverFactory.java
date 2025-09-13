package com.automationpractice.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver initDriver(String browser) {
    if (browser.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
    } else if (browser.equalsIgnoreCase("firefox")) {
        WebDriverManager.firefoxdriver().setup();
        driver.set(new FirefoxDriver());
    } else if (browser.equalsIgnoreCase("edge")) {
    	//driver setup form local storage of edge
    	System.setProperty("webdriver.edge.driver",
    	        "C:\\Drivers\\msedgedriver.exe");
    	    driver.set(new EdgeDriver());
    } else {
        System.out.println("Browser not supported, launching Chrome by default.");
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
    }
    driver.get().manage().window().maximize();
    return driver.get();
}


    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove(); // clean thread local
        }
    }
}
