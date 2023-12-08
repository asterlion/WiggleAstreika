package com.stv.design.designpages;

import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

    private final By REGISTER_LINK_LOCATOR = By.xpath("//img[contains(@alt,'Wiggle')]");
    private final By TRUST_BUTTON = By.xpath("//button[contains(text(),'Accept all')]");
    private final By BASKET_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/header/div[2]/div/div/div[1]/a");
    private final By SHOPNOW_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/a/span/span");
    private final By SALE_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div/a/span/span");
    private final By WINTER_SALE = By.linkText("https://www.wiggle.com/m/sale");


    @FindBy(id = "rs")
    private WebElement input;

    public boolean isMainLogoDisplayed(){
        WebElement registerLink = getDriver().findElement(REGISTER_LINK_LOCATOR);
        return registerLink.isDisplayed();
    }

    public void clickOnTrustButton(){
        WebElement trustButton = getDriver().findElement(TRUST_BUTTON);
        trustButton.click();
    }

    public boolean isSearchBarIsVisible(){
        WebElement registerLink = getDriver().findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[2]/div/div/div[2]/div/div/form/input"));
        return registerLink.isDisplayed();
    }

    public boolean isBasketPageIsOpened(){
        boolean textPresent = Driver.getDriver().getPageSource().contains("YOUR SHOPPING BASKET IS EMPTY");
        return textPresent;
    }
    public boolean isShopPageIsOpened(){
        boolean textPresent = Driver.getDriver().getPageSource().contains("EPIC WINTER SALE");
        return textPresent;
    }
    public boolean isSalePageIsOpened(){
        boolean textPresent = Driver.getDriver().getTitle().contains("WINTER_SALE");
        return textPresent;
    }
    public void searchRequestInput(String string) { input.sendKeys(string); }

    public void clickOnBasketButton(){
        WebElement basketButton = getDriver().findElement(BASKET_BUTTON);
        basketButton.click();
    }
    public void clickOnShopNow(){
        WebElement shopNowButton = getDriver().findElement(SHOPNOW_BUTTON);
        shopNowButton.click();
    }
    public void clickOnSalePage(){
        WebElement salePageButton = getDriver().findElement(SALE_BUTTON);
        salePageButton.click();
    }



}
