package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalenderHandling {
    public static String url = "http://practice.syntaxtechs.net/bootstrap-date-picker-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement datePicker = driver.findElement(By.xpath("//i[@class = 'glyphicon glyphicon-th']"));
        datePicker.click();
        List<WebElement>dateOfMonth = driver.findElements(By.xpath("//table[@id = 'table-day']/tbody/tr/td"));
        for (WebElement dayOfdate:dateOfMonth
             ) {
            String dayOfDateText= dayOfdate.getText();
            if(dayOfDateText.equals("4")){
                dayOfdate.click();
                break;
            }
        }
    }
}
