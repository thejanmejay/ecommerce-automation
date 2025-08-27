package com.automationpractice.tests;

import com.automationpractice.base.BaseTest;
import com.automationpractice.pages.HomeBanners;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeBannersTest extends BaseTest {

    @Test
    public void testBannersDisplayed() {
        HomeBanners banners = new HomeBanners(driver);

        // Check if banners container is displayed
        Assert.assertTrue(banners.isBannersDisplayed(), "Home banners are not visible!");
    }

    @Test
    public void testBannerCount() {
        HomeBanners banners = new HomeBanners(driver);

        // Wait for banners to be visible
        int count = banners.getBannerCount();
        System.out.println("Total banners: " + count);

        Assert.assertTrue(count > 0, "No banners found on homepage!");
    }


    @Test
    public void testBannerDetails() {
        HomeBanners banners = new HomeBanners(driver);

        int count = banners.getBannerCount();
        for (int i = 0; i < count; i++) {
            String link = banners.getBannerLink(i);
            String image = banners.getBannerImageSrc(i);
            System.out.println("Banner " + (i + 1) + " Link: " + link);
            System.out.println("Banner " + (i + 1) + " Image: " + image);

            Assert.assertNotNull(link, "Banner link should not be null");
            Assert.assertNotNull(image, "Banner image src should not be null");
        }
    }

    @Test
    public void testClickBanner() {
        HomeBanners banners = new HomeBanners(driver);

        // Click the first banner as example
        banners.getBanner(0).click();

        // Optionally: validate navigation
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Navigated URL: " + currentUrl);
        Assert.assertTrue(currentUrl.contains("prestashop.com"), "Banner did not navigate to expected URL");
    }
}
