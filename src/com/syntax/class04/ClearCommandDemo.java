package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommandDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@id = 'user-name']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
        password.sendKeys("secret_sauce");
        //WebElement loginButton =driver.findElement(By.xpath("//input[@id= 'login-button']"));
        //loginButton.click();

        Thread.sleep(1000);
        username.clear();
        password.clear();

    }
}

