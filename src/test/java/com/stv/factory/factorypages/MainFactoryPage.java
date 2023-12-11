package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(css = "[aria-label='Sign in']")
    private WebElement accountLink;

    @FindBy(xpath = "//button[contains(text(),'Accept all')]")
    private WebElement trustButton;
    @FindBy(xpath = "//*[@id=\"autocomplete-1-input\"]")
    private WebElement searchBar;

   // @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/header/div[2]/div/div/div[2]/div[2]/div")
    @FindBy(className = "Autocomplete_panel__Ze8gZ")
    private WebElement searchPanel;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/header/div[2]/div/div/div[2]/div[1]/div/form/button[2]/svg")
    private WebElement input;

    @FindBy(className = "Autocomplete_panel__Ze8gZ")
    private WebElement dropdown;

    public boolean isAccountLinkDisplayed(){
        return accountLink.isDisplayed();
    }
    public boolean isSearchPanelDisplayed(){
        return searchPanel.isDisplayed();
    }

    public void deleteRequest() {
        input.click();
    }

    public boolean isDropdownHidden() {
        if (searchPanel.isDisplayed()) {
            return true;
        } else {
            return false;
        }
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
