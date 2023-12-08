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

import java.util.concurrent.TimeUnit;

import static com.stv.factory.factorytests.BasicFactoryTest.getDriver;
import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class SearchSteps {
    MainPage mainPage = new MainPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Given("Home page is loaded")
    public void homePageIsLoaded() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        getDriver().findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div[2]/button[2]")).click();
    }

    @And("Search bar is visible")
    public void SearchBarIsVisible() {
        mainPage.isSearchBarIsVisible();
    }

    @When("The User enters <req> in the search bar")
    public void enterSearchRequest(String string)  {
        mainPage.searchRequestInput(string);
    }

}
