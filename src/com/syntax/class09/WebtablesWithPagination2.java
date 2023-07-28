package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
//WebtablesWithPagination ile aynı örnek burada hepsini değil de sadece 8. sıradaki arkadaşı yazdırmaya çalıştık "Archy J"olan

public class WebtablesWithPagination2 {
    public static String url = "http://practice.syntaxtechs.net/table-pagination-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@class = 'table table-hover']/tbody/tr"));
        WebElement nextButton = driver.findElement(By.xpath("//a[@class = 'next_link']"));
        for (WebElement row : rowData
        ) {
            String rowText = row.getText();
            if (!rowText.isEmpty()) {
                if (rowText.contains("Archy J")) {
                    System.out.println(rowText);
                    break;
                }
            } else {
                nextButton.click();
            }
        }
    }
}

