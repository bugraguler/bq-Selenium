package com.syntax.class10;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsDragAndDrop {
    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action=new Actions(driver);
        // action.dragAndDrop(draggable,droppable).perform();    first way to drag and drop
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        //whenever you do more than one actions you need the use build() method first than you can perform it
        driver.navigate().refresh();//to refresh page :))



    }
}
