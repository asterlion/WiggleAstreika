package com.core.factory.factorytests;

import com.core.factory.factorypages.AddDoctorPage;
import com.core.factory.factorypages.AdminPanelPage;
import com.core.factory.factorypages.LoginPage;
import com.core.factory.factorypages.MainFactoryPage;
import com.core.framework.core.utils.Waiters;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.core.framework.core.lib.ClinicPageURLs.*;

public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();
    AdminPanelPage adminPanelPage = new AdminPanelPage();
    AddDoctorPage addDoctorPage = new AddDoctorPage();

    @Test(description = "Assert the main page is loaded and account icon is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage.isAccountLinkDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
    }

    @Test(description = "Assert the login page is loaded", dependsOnMethods = "assertAccountIconIsDisplayed")
    public void assertLoginPageOpened() {
        mainFactoryPage.clickOnLogOutButton();
        mainFactoryPage.clickOnAccountLink();
        Assert.assertEquals(loginPage.isLoginContainerDisplayed(),
                true,
                "Login page isn't loaded properly");
    }

    @Test(description = "Login with valid value", dependsOnMethods = "assertLoginPageOpened")
    public void assertUserLoggedIn() {
        Waiters.waitForTime(3); // Задержка в 3 секунды
        //loginPage.getUsername().clear();
        loginPage.inputText(loginPage.getUsername(), USERNAME);
        //loginPage.getPassword().clear();
        loginPage.inputText(loginPage.getPassword(), PASSWORD);
        // Добавляем задержку на 2 секунды перед нажатием кнопки продолжения
        Waiters.waitForTime(3); // Задержка в 3 секунды
        loginPage.clickContinueButton();
        Waiters.waitForTime(3); // Задержка в 3 секунды
        Assert.assertEquals(new LoginPage().isMyAccountButtonPresent(), true, "Login failed");
    }

    @Test(description = "Click on admin panel", dependsOnMethods = "assertUserLoggedIn")
    public void assertMyAccountIsVisible() {
        loginPage.clickOnAdminButton();
        Waiters.waitForTime(3); // Задержка в 3 секунды
        Assert.assertEquals(new AdminPanelPage().isAdminPagePresent(), true, "Admin panel failed");
    }
    @Test(description = "Click on add doctor", dependsOnMethods = "assertMyAccountIsVisible")
    public void assertAddDoctorPageIsVisible() {
        adminPanelPage.clickOnAddDoctorButton();
        Waiters.waitForTime(3); // Задержка в 3 секунды
        Assert.assertEquals(new AddDoctorPage().isAddDoctorPageVisible(), true, "Doctor add failed");
    }
}
