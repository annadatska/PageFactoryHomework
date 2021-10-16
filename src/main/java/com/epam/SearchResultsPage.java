package com.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'js_more_content')]")
    private List<WebElement> searchResultsProductsListText;

    @FindBy(xpath = "//img[contains(@title,'iPhone 12 64GB Purple')]")
    private WebElement iphone12MJNM3Button;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultsList() {
        return searchResultsProductsListText;
    }

    public void clickOnIphone12MJNM3Button() {
        iphone12MJNM3Button.click();
    }
}
