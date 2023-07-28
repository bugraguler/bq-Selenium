package com.syntax.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class TakingScreenShot1 {
    public static String url = "http://practice.syntaxtechs.net/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));//storing element inside List
        System.out.println(rowData.size());
        Iterator<WebElement> iterator = rowData.iterator();//creating iterator
        while (iterator.hasNext()) {
            WebElement row = iterator.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }
        System.out.println("------------------------------------------------------------------");

        List<WebElement> columnData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        System.out.println(columnData.size());
        for (WebElement coldata : columnData) {
            System.out.println(coldata.getText());
        }

        TakesScreenshot ts=(TakesScreenshot)driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE); //the screenShot is taken on this step
        try {
            FileUtils.copyFile(srcFile,new File("screenShots/practiceSyntax/table.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
