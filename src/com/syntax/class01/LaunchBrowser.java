package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//launch the browser
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(url + " " + title);
        driver.quit();

    }
}