package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(css = "[aria-label='Sign in']")
    private WebElement accountLink;

    @FindBy(xpath = "//button[contains(text(),'Accept all')]")
    private WebElement trustButton;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/header/div[2]/div/div/div[2]/div/div/form/input")
    private WebElement searchBar;

    public boolean isAccountLinkDisplayed(){
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink(){
        accountLink.click();
    }

    public void clickOnTrustButton(){
        trustButton.click();
    }
    public void clickOnSearchBar(){
        searchBar.click();
    }
}
