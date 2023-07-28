package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserAndNavigateDifferentUrls {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//launch the browser
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        driver.get("http://www.amazon.com");

        driver.get("http://www.ebay.com");

        driver.quit();

    }

}
