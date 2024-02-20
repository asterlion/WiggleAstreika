package com.core.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPanelPage extends FactoryPage {
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div/div[1]/a")
    private WebElement addDoctorButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/a")
    private WebElement addDepartButton;

    @FindBy(xpath = "//*[@id=\"responsive-navbar-nav\"]/div[2]/button[1]")
    private WebElement adminFrame;

    public boolean isDoctorButtonDisplayed() {
        return addDoctorButton.isDisplayed();
    }

    public boolean isDepartButtonDisplayed() {
        return addDepartButton.isDisplayed();
    }

    public void clickOnAddDoctorButton() {
        addDoctorButton.click();
    }

    public void clickOnAddDepartButton() {
        addDepartButton.click();
    }

    public boolean isAdminPagePresent() {
        return adminFrame.isDisplayed();
    }

}
