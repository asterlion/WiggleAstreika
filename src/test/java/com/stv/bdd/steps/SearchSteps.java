package com.stv.bdd.steps;

import com.stv.design.designpages.MainPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.stv.factory.factorytests.BasicFactoryTest.getDriver;
import static com.stv.framework.core.drivers.Driver.driver;
import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class SearchSteps {
    MainPage mainPage = new MainPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Given("Homepage is loaded")
    public void homePageIsLoaded() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainFactoryPage.clickOnTrustButton();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("Search bar is visible")
    public void SearchBarIsVisible() {
        mainPage.isSearchBarIsVisible();
    }

    @When("^The User enters \"([^\"]*)\" in the search bar$")
    public void enterSearchRequest(String string) {
        WebElement myElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[2]/div/div/div[2]/div/div/form/input"));
        myElement.sendKeys(string);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    @Then("Dropdown menu appears")
    public void searchPanelIsDisplayed() {mainFactoryPage.isSearchPanelDisplayed();}

    @When("The User clears search bar")
    public void clearSearchBar() {
        mainFactoryPage.deleteRequest();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Then("Dropdown menu is hidden")
    public void dropdownDisappears() {
        Assert.assertEquals(mainFactoryPage.isDropdownHidden(), false);
    }


    @And("Search bar is empty")
    public void searchBarIsEmpty() {
        Assert.assertEquals(mainPage.isInputEmpty(), true);
    }


}
