package com.automationpractice.tests;

import org.testng.annotations.Test;

import com.automationpractice.base.BaseTest;
import com.automationpractice.pages.TabSwitch;

public class SwitchTabTest extends BaseTest{
	@Test(groups= {"TabSwitch"})
	public void switchTabsTest() {
			    TabSwitch tabSwitch = new TabSwitch(driver);
			    tabSwitch.switchToTab("tab1");
			    tabSwitch.switchToTab("tab2");
			    tabSwitch.switchToTab("tab3");
			    System.out.println("Tab switching actions performed. ");
	}
}
