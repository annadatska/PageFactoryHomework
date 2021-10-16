package com.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IphonePage extends BasePage {

    @FindBy(xpath = "//a[@class='prod-cart__buy']")
    private List<WebElement> addToCartButton;

    @FindBy(id = "js_cart")
    private WebElement addToCartPopup;

    @FindBy(xpath = "//a[contains(@href,'checkout')]")
    private WebElement checkoutButton;

    @FindBy(xpath = "//a[@class='config__memory '][contains(@title,'128')]")
    private WebElement configMemoryButton;

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton() {
        addToCartButton.get(0).click();
    }

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

    public void clickOnCheckoutButton() {
        checkoutButton.click();
    }

    public void clickOnConfigMemoryButton() {
        configMemoryButton.click();
    }
}
