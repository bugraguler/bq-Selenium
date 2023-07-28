package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownHandling3 {
    public static String url = "https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement searchCategories = driver.findElement(By.id("searchDropdownBox"));
        Select select= new Select(searchCategories);
        List<WebElement>eachCategorie =select.getOptions();
        for (WebElement options:eachCategorie
             ) {
            String optionText=options.getText();
            System.out.println(optionText);
        }
        select.selectByValue("search-alias=software-intl-ship");

    }
}