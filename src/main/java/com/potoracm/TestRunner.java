package com.potoracm;

import com.potoracm.managers.DriverManager;
import org.openqa.selenium.WebDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TestRunner {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverManager.getInstance().getDriver();
        driver.get("https://automationexercise.com/");

        Thread.sleep(5000);
        DriverManager.getInstance().getDriver().quit();
    }
}