package com.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class XiaomiPage extends BasePage {

    @FindBy(xpath = "//a[@class='prod-cart__buy']")
    private List<WebElement> addToCartButton;

    @FindBy(id = "js_cart")
    private WebElement addToCartPopup;

    @FindBy(xpath = "//input[@value='1'][contains(@class,'changeAmount')]")
    private WebElement xiaomiPhoneInCart;

    public XiaomiPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton() {
        addToCartButton.get(0).click();
    }

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

    public WebElement getXiaomiPhoneInCart() {
        return xiaomiPhoneInCart;
    }
}
