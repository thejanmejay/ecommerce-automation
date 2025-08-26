package com.automationpractice.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.base.BaseTest;
import com.automationpractice.pages.HomesPage;

public class HomepageTest extends BaseTest {

    @Test(groups = {"HomePage"})
    public void testHomePageTitle() {
        HomesPage homePage = new HomesPage(driver);

        // Print title via page method
        homePage.printTitle();

        // Assertion
        Assert.assertEquals(homePage.getTitleName(), "My Shop", "Home page title does not match!");
    }
}
