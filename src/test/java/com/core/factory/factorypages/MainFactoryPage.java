package com.core.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(xpath = "/html/body/div/div[1]/nav/div/div[2]/button")
    private WebElement accountLogIn;

    @FindBy(xpath = "//*[@id=\"responsive-navbar-nav\"]/div[2]/button[2]")
    private WebElement logOutButton;
    //@FindBy(xpath = "//*[@id=\"autocomplete-1-input\"]")
   // private WebElement searchBar;

   // @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/header/div[2]/div/div/div[2]/div[2]/div")
    //@FindBy(className = "Autocomplete_panel__Ze8gZ")
   // private WebElement searchPanel;

   // @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/header/div[2]/div/div/div[2]/div[1]/div/form/button[2]/svg")
   // private WebElement input;

  //  @FindBy(className = "Autocomplete_panel__Ze8gZ")
   // private WebElement dropdown;

    public boolean isAccountLinkDisplayed(){
        return accountLogIn.isDisplayed();
    }
/*    public boolean isSearchPanelDisplayed(){
        return searchPanel.isDisplayed();
    }*/

/*    public void deleteRequest() {
        input.click();
    }*/

/*    public boolean isDropdownHidden() {
        if (searchPanel.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }*/

    public void clickOnAccountLink(){
        accountLogIn.click();
    }

    public void clickOnLogOutButton() {
        try {
            logOutButton.click();
        } catch (Exception e) {
        }
    }
/*    public void clickOnSearchBar(){
        searchBar.click();
    }*/
}
