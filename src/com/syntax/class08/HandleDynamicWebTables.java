package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleDynamicWebTables {
    public static String url = "https://cosmocode.io/automation-practice-webtable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id = 'countries']/tbody/tr"));
        for(int i=1 ; i<rowData.size();i++){
            String rowText = rowData.get(i).getText();
            System.out.println(rowText);
            if(rowText.contains("Belgium")) {
                List<WebElement> checkBoxes = driver.findElements(By.xpath("//table[@id = 'countries']/tbody/tr/td[1]"));
                checkBoxes.get(i-1).click();
            }
        }
    }
}