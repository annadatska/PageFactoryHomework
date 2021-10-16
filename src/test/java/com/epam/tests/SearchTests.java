package com.epam.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private static final String SEARCH_KEYWORD_IPHONE = "iphone 12 mjnm3";
    private static final String EXPECTED_SEARCH_QUERY = "128gb";
    private static final String SEARCH_KEYWORD_XIAOMI = "Xiaomi";

    @Test(priority = 1)
    public void checkThatURLContainsNewConfigMemory() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD_IPHONE);
        getHomePage().waitForPageLoadComplete(30);
        getSearchResultsPage().clickOnIphone12MJNM3Button();
        getIphonePage().clickOnConfigMemoryButton();
        getIphonePage().implicitWait(30);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }

    @Test(priority = 2)
    public void checkThatSearchResultsContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD_XIAOMI);
        for (WebElement webElement : getSearchResultsPage().getSearchResultsList()) {
            assertTrue(webElement.getText().contains(SEARCH_KEYWORD_XIAOMI));
        }
    }
}
