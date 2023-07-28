package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinksTextsFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links is " + allLinks.size());
        int i = 0;
        for (WebElement link : allLinks
        ) {
            if (!link.getText().isEmpty()) {
                i++;
                System.out.println(link.getText());
            }

        }
        System.out.println("Number of unempty links is "+ i);
    }

}

