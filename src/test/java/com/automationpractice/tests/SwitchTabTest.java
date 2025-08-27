package com.automationpractice.tests;

import org.testng.annotations.Test;
import com.automationpractice.base.BaseTest;
import com.automationpractice.pages.TabSwitch;

public class SwitchTabTest extends BaseTest {

    @Test(groups = {"TabSwitch"})
    public void switchTabsTest() {
        TabSwitch tabSwitch = new TabSwitch(driver);

        // Using convenience methods
        tabSwitch.switchToTab1();
        tabSwitch.switchToTab2();
        tabSwitch.switchToTab3();

        // Or using dynamic title
        // tabSwitch.switchToTabByTitle("Dresses");
        // tabSwitch.switchToTabByTitle("T-shirts");
        // tabSwitch.switchToTabByTitle("Blog");

        System.out.println("Tab switching actions performed successfully.");
    }
}
