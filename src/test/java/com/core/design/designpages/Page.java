package com.core.design.designpages;

import com.core.framework.core.drivers.Driver;
import org.openqa.selenium.WebDriver;

public abstract class Page {

    protected static WebDriver getDriver() {
        return Driver.getDriver();
    }
}
