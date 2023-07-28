package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables {
    public static String url = "http://practice.syntaxtechs.net/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));//storing element inside List
        System.out.println(rowData.size());
        Iterator<WebElement>iterator = rowData.iterator();//creating iterator
        while(iterator.hasNext()){
            WebElement row = iterator.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }
        System.out.println("------------------------------------------------------------------");

        List<WebElement> columnData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        System.out.println(columnData.size());
        for(WebElement coldata:columnData){
            System.out.println(coldata.getText());
        }


    }
}
