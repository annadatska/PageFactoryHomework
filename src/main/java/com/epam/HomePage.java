package com.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@class='sidebar-item'][contains(@href,'telefonyi-i-aksessuaryi')]")
    private WebElement phonesAndAccessorizesButton;

    @FindBy(xpath = "//a[@class='sidebar-item'][contains(@href,'smartfonyi')]")
    private WebElement smartphonesButton;

    @FindBy(xpath = "//a[@class='single-hover__link'][contains(@href,'smartfonyi/proizvoditel--xiaomi')]")
    private WebElement xiaomiPhonesButton;

    @FindBy(xpath = "//input[@class='js-changeAmount count']")
    private WebElement amountOfProductsInCart;

    @FindBy(id = "modalAlert")
    private WebElement emptyCartAlert;

    private final Actions action = new Actions(driver);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.click();
    }

    public void clickOnProductCatalogButton() {
        productCatalogButton.click();
    }

    public void moveToPhonesAndAccessorizesButton() {
        action.moveToElement(phonesAndAccessorizesButton).build().perform();
    }

    public void moveToSmartphonesButton() {
        action.moveToElement(smartphonesButton).build().perform();
    }

    public void clickOnXiaomiPhonesButton() {
        xiaomiPhonesButton.click();
    }

    public WebElement getEmptyCartAlert() {
        return emptyCartAlert;
    }
}
