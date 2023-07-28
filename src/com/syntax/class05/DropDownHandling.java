package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
    public static String url = "https://the-internet.herokuapp.com/dropdown";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement dropDown= driver.findElement(By.id("dropdown"));
        Select select= new Select(dropDown);
        select.selectByIndex(0); //indexin starts from 0 ama genellikle orada bir disabled olur yani 1 gibi davranır
        //Please select an option 'ı seçer 0 ile

        //select.selectByVisibleText("Option 1");

        select.selectByValue("2");//make sure to look DOM take the value attribute

    }
}