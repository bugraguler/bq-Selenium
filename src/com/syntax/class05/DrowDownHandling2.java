package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.PrintStream;
import java.util.List;

public interface DrowDownHandling2 {
    // public static String url = "https://the-internet.herokuapp.com/dropdown";
    public static String url = "https://www.bluerentalcars.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        WebElement dropDown = driver.findElement(By.cssSelector("select[name ='car']"));
        Select select = new Select(dropDown);
        List<WebElement>allOptions=select.getOptions();

        int size= allOptions.size();
        System.out.println(size);

        for (int i = 0; i < allOptions.size(); i++) {
            String options=allOptions.get(i).getText(); //getting texts from each option
            System.out.println(options);
            select.selectByIndex(i); //selecting each options
            Thread.sleep(1000);

        }

    }
}