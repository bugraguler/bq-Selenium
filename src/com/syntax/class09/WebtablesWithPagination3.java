package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
//WebtablesWithPagination2 ile aynı örnek burada while loop ile en efficient kod yazıldı
public class WebtablesWithPagination3 {
    public static String url = "http://practice.syntaxtechs.net/table-pagination-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@class = 'table table-hover']/tbody/tr"));
        WebElement nextButton = driver.findElement(By.xpath("//a[@class = 'next_link']"));
        boolean flag = true;

        while (flag){
            for(WebElement row:rowData){
                String rowText = row.getText();
                if(rowText.contains("Archy J")){
                    flag = false;
                    System.out.println(rowText);
                    break;
                }
            }
            if (flag){
                nextButton.click();
            }
        }
    }
}