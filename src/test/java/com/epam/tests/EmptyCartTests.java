package com.epam.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EmptyCartTests extends BaseTest {

    private static final String SEARCH_KEYWORD = "iphone 12";

    @Test
    public void checkThatPopupEmptyCartAppearsWhenDeleteAddedProduct() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getHomePage().waitForPageLoadComplete(30);
        getIphonePage().clickOnAddToCartButton();
        getIphonePage().waitVisibilityOfElement(30, getIphonePage().getAddToCartPopup());
        getIphonePage().clickOnCheckoutButton();
        getIphonePage().implicitWait(30);
        getCheckoutPage().clickDeleteProductFromCartButton();
        getCheckoutPage().implicitWait(30);
        assertTrue(getHomePage().getEmptyCartAlert().isDisplayed());
    }
}
