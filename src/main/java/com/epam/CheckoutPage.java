package com.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//i[contains(@class,'icon-close')]")
    private WebElement deleteProductFromCartButton;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickDeleteProductFromCartButton() {
        deleteProductFromCartButton.click();
    }
}
