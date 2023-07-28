package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url = "http://practice.syntaxtechs.net/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement searchBox= driver.findElement(By.id("search"));
        searchBox.sendKeys("sdet");
        driver.switchTo().defaultContent(); //çok önemli her seferinde manuel olarak ana sayfaya dönmeliyiz

        //ana sayfaya döndüğümüz için burada işlem yapabiliriz!!
        WebElement alerButton = driver.findElement(By.xpath("//a[text() ='Alerts & Modals']"));
        alerButton.click();
        WebElement jsAlert= driver.findElement(By.xpath("//a[text()= 'Javascript Alerts']"));
        jsAlert.click();

        WebElement simpleAlertButton = driver.findElement(By.cssSelector("button[onclick = 'myAlertFunction()']"));
        simpleAlertButton.click();
        Thread.sleep(1000);
        Alert simpleAlert =  driver.switchTo().alert();  //switch the focus to alert
        simpleAlert.accept();

        WebElement othersButton = driver.findElement(By.xpath("//a[text()= 'Others']"));
        othersButton.click();

        WebElement iframeButton= driver.findElement(By.xpath("//a[text()= 'Iframe']"));
        iframeButton.click();



       Thread.sleep(20000);
        driver.switchTo().frame("FrameOne");
        driver.switchTo().frame("_hjSafeContext_82212287");
        WebElement closeButton = driver.findElement(By.xpath("//button[@tabindex = '1']"));
        closeButton.click();







    }
}
