package com.syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class UploadDocuments {
    public static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\Selenium File Upload\\SampleForSelenium.xlsx");
        //if it is not working we have to use robot class (to handle with windows base applications)

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

        TakesScreenshot ts=(TakesScreenshot)driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE); //the screenShot is taken on this step
        try {
            FileUtils.copyFile(srcFile,new File("screenShots/practiceSyntax/fileupload .png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
