package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle(); //get window handle for main page
        System.out.println(mainPageHandle);
        WebElement helpLink = driver.findElement(By.linkText("Yardım"));
        helpLink.click();

        Set<String> allWindowHandles = driver.getWindowHandles();//store all the handles in a set
        System.out.println(allWindowHandles.size());

        Iterator<String> iterator = allWindowHandles.iterator(); // have an iterator in order to iterate through the handles
        mainPageHandle = iterator.next(); // take the first step and assign the main handle
        String childHandle = iterator.next(); // take the second step and have a child handle
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(childHandle);//çok önemli bu hamle ile seleniumun focusunu belirliyoruz !!!
        //driver.close();//closes first page !!! not the second focus nerde ona bak
        driver.switchTo().window(mainPageHandle);//tekrar seleniumun focusunu ana sayfaya getirdik ki selenium işlem yapabilsin
        helpLink.click();

        driver.quit();//terminate terminate terminate

    }
}