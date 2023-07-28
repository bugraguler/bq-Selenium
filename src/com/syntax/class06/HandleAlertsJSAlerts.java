package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsJSAlerts {
    public static String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement simpleAlertButton = driver.findElement(By.cssSelector("button[onclick = 'myAlertFunction()']"));
        simpleAlertButton.click();
        Thread.sleep(1000);

        Alert simpleAlert =  driver.switchTo().alert();  //switch the focus to alert
        simpleAlert.accept();

        WebElement confirmAlertButton= driver.findElement(By.cssSelector("button[onclick = 'myConfirmFunction()']"));
        confirmAlertButton.click();
        Thread.sleep(1000);

        Alert confirmAlert = driver.switchTo().alert();    //switch the focus to alert
        String alertText =confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();

        WebElement promptAlertButton= driver.findElement(By.cssSelector("button[onclick = 'myPromptFunction()']"));
        promptAlertButton.click();
        Thread.sleep(1000);

        Alert promptAlert = driver.switchTo().alert();    //switch the focus to alert
        String promptAlertText = promptAlert.getText();
        System.out.println(promptAlertText);
        promptAlert.sendKeys("deneme bir ki");
        promptAlert.accept();
    }
}