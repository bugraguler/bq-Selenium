package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSExecutorDemo3 {
    public static String url = "https://www.google.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement acceptCookies = driver.findElement(By.xpath("//div[text() = 'Tümünü kabul et']"));
        acceptCookies.click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.amazon.com/');");

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("aramayapmalı");


    }
}
