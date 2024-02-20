package com.core.bdd.steps;

import com.core.factory.factorypages.ErrorMessage;
import com.core.factory.factorypages.SignInPage;
import com.core.factory.factorytests.BasicFactoryTest;
import static com.core.framework.core.lib.ClinicPageURLs.START_URL;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SignInStep extends BasicFactoryTest {

    SignInPage mySignInPage = new SignInPage();
    ErrorMessage errorMessage = new ErrorMessage();

    @Given("^Sign in form$")
    public void setup() throws Throwable{
        getDriver().get(START_URL);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        getDriver().findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div[2]/button[2]")).click();
        getDriver().findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[2]/div/div/div[1]/button/span/span")).click();
    }

    @When("^The User enters invalid email address$")
    public void emailInput()  {
        mySignInPage.signInEmailInput();
    }

    @And("^The User goes to the password field$")
    public void goToPassword()  {
        mySignInPage.goToPasswordField();
    }

    @Then("^Warning message appears$")
    public void errorMessage() {
        getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        errorMessage.isErrorMessageDisplayed();
    }
}
