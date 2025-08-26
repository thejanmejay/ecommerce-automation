package com.automationpractice.tests;

import org.testng.annotations.Test;

import com.automationpractice.base.BaseTest;
import com.automationpractice.pages.Search;

public class SearchTest extends BaseTest{

	@Test(groups = {"HomePage"})
	public void searchBarTest() {
		Search search = new Search(driver);
		search.searchForItem("dress");
		System.out.println("Search action performed");
	}
	
}
