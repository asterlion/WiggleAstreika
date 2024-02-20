package com.core.factory.factorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.core.framework.core.drivers.Driver.driver;

public class AddDoctorPage extends FactoryPage {
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[3]/form/button")
    private WebElement addDoctorButton;

    public boolean isAddDoctorPageVisible(){
        return addDoctorButton.isDisplayed();
    }

}
