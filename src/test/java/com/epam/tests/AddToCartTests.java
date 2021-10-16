package com.epam.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AddToCartTests extends BaseTest {

    @Test
    public void checkAddXiaomiPhoneToCart() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().implicitWait(30);
        getHomePage().moveToPhonesAndAccessorizesButton();
        getHomePage().implicitWait(30);
        getHomePage().moveToSmartphonesButton();
        getHomePage().implicitWait(30);
        getHomePage().clickOnXiaomiPhonesButton();
        getXiaomiPage().waitForPageLoadComplete(30);
        getXiaomiPage().clickOnAddToCartButton();
        getXiaomiPage().waitVisibilityOfElement(30, getXiaomiPage().getAddToCartPopup());
        assertTrue(getXiaomiPage().getXiaomiPhoneInCart().isDisplayed());
    }

}
