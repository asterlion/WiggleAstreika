package com.core.framework.core.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
    public static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            setChromeDriver();
//            setFireFox();
        }
        return driver;
    }

    private static void setChromeDriver() {
        String exePath = "D:\\List_of_Jar\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setJavascriptEnabled(true);
        driver = new ChromeDriver(capabilities);
    }

    /**
     * The method can be used to run tests in Fire fox
     */

    private static void setFireFox() {

        String exePath = "C:\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", exePath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
//        capabilities.setJavascriptEnabled(true);
    }
}
