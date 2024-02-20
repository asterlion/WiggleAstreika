package com.core.bdd.steps;

import com.core.design.designpages.MainPage;
import com.core.factory.factorypages.MainFactoryPage;
import com.core.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import static com.core.framework.core.lib.ClinicPageURLs.START_URL;

public class MainSteps extends BasicFactoryTest {
    MainPage mainPage = new MainPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @When("Home page is opened")
    public void homePageIsOpened() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div[2]/button[2]")).click();
        mainFactoryPage.clickOnLogOutButton();
    }

    @Then("Wiggle Logo is displayed")
    public void wiggleLogoIsDisplayed() {
        mainPage.isMainLogoDisplayed();
    }

    @And("Account Link is displayed")
    public void accountLinkIsDisplayed() {
        mainFactoryPage.isAccountLinkDisplayed();
    }
}


