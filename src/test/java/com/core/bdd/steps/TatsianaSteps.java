package com.core.bdd.steps;

import com.core.design.designpages.MainPage;
import com.core.factory.factorypages.MainFactoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

import static com.core.factory.factorytests.BasicFactoryTest.getDriver;
import static com.core.framework.core.lib.ClinicPageURLs.START_URL;

public class TatsianaSteps {
    MainPage mainPage = new MainPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @When("Home page is open")
    public void homePageIsOpened() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainFactoryPage.clickOnLogOutButton();
    }

    @Then("Click on basket")
    public void basketButtonClickOn() {mainPage.clickOnBasketButton();}

    @And ("Basket page is opened")
    public void basketPageIsOpened() {mainPage.isBasketPageIsOpened();}

    @Then ("Click on shop online")
    public void shopNowClickOn() {mainPage.clickOnShopNow();}

    @And ("Shop page is find")
    public void shopPageIsOpened() {mainPage.isShopPageIsOpened();}

    @Then ("Click on sale page")
    public void salePageClickOn() {mainPage.clickOnSalePage();}

    @And ("Sale page is displayed")
    public void salePageIsOpened() {mainPage.isSalePageIsOpened();}

}
