package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebtablesWithPagination {
    public static String url = "http://practice.syntaxtechs.net/table-pagination-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@class = 'table table-hover']/tbody/tr"));
        WebElement nextButton = driver.findElement(By.xpath("//a[@class = 'next_link']"));
        for (WebElement row:rowData
             ) {
            String rowText = row.getText();
            if(!rowText.isEmpty()){
            System.out.println(rowText);
            }else{
                nextButton.click();
            }
        }
    }
}
