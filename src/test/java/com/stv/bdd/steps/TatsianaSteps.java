package com.stv.bdd.steps;

import com.stv.design.designpages.MainPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

import static com.stv.factory.factorytests.BasicFactoryTest.getDriver;
import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class TatsianaSteps {
    MainPage mainPage = new MainPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @When("Home page is open")
    public void homePageIsOpened() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div[2]/button[2]")).click();
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
