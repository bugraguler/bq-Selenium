package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//launch the browser
        WebDriver driver = new ChromeDriver();
        driver.get("http://fb.com");
        driver.manage().window().maximize();
        driver.findElement(By.className("_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("daralilo@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("sanane");
        driver.findElement(By.name("login") ).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Şifreni mi Unuttun?")).click();
    }
}
