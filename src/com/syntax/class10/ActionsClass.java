package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    public static String url = "https://www.amazon.com/";

    //navigate to amazon and move to cursor over account

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement accountAndLists = driver.findElement(By.id("nav-link-accountList"));

        Actions action = new Actions(driver);
        action.moveToElement(accountAndLists).perform();


    }
}
