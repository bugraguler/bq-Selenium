package com.syntax.pom.pages;

import com.syntax.pom.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {
    public WebElement username =driver.findElement(By.id("profilecustom_email"));
    public WebElement password = driver.findElement(By.id("lia-password"));
    public WebElement loginButton = driver.findElement(By.id("submitContext"));
    public WebElement allowAllCookies = driver.findElement(By.xpath("//button[text() = 'Allow all cookies' ]"));
}
