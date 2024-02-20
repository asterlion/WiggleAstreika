package com.core.framework.core.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waiters {

    public static void waitForElementVisible(WebDriver driver, int timeout, WebElement webElement) {
        new WebDriverWait(driver, timeout).pollingEvery(4, TimeUnit.SECONDS)
                .until(ExpectedConditions.visibilityOf(webElement));
    }

    // Метод для ожидания заданного времени
    public static void waitForTime(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // Преобразуем секунды в миллисекунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
