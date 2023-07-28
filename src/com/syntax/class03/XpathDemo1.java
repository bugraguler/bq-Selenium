package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://fb.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(@data-cookiebanner, 'accept_button')]")).click();
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("adsasasaf");
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Şifre')]")).sendKeys("6546546545");
        driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
        driver.quit();



    }
}
