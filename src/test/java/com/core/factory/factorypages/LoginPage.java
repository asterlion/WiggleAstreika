package com.core.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.core.framework.core.drivers.Driver.driver;

public class LoginPage extends FactoryPage {
    @FindBy(xpath = "/html/body/div[3]/div/div")
    private WebElement loginContainer;

    @FindBy(xpath = "//*[@id=\"fromBasicText\"]")
    private WebElement username;

    public WebElement getUsername() {
        return username;
    }

    @FindBy(xpath = "//*[@id=\"fromBasicPassword\"]")
    private WebElement password;

    public WebElement getPassword() {
        return password;
    }

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"responsive-navbar-nav\"]/div[2]/a")
    private WebElement adminButton;

    @FindBy(xpath = "//*[contains(text(), 'Закрыть')]")
    private WebElement loginValidationMessage;

    public boolean isLoginContainerDisplayed() {
        return loginContainer.isDisplayed();
    }

    public void inputText(WebElement el, String text) {
        el.sendKeys(text);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void clickOnAdminButton() {
        adminButton.click();
    }

    public boolean isMyAccountButtonPresent() {
        return adminButton.isDisplayed();
    }
}
