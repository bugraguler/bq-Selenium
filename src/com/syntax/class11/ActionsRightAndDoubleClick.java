package com.syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ActionsRightAndDoubleClick {
    public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //explicit wait

        driver.switchTo().frame("gdpr-consent-notice");
        WebElement cookieAccept = driver.findElement(By.xpath("//span[text() = 'Tümünü Kabul Et']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() = 'Tümünü Kabul Et']")));
        cookieAccept.click();

        WebElement rightClickButton = driver.findElement(By.xpath("//span[text() ='right click me']"));
        Actions action =new Actions(driver);
        action.contextClick(rightClickButton).perform();

        WebElement deleteButton = driver.findElement(By.xpath("//span[text() ='Delete']"));
        deleteButton.click();

        Alert confirmAlert = driver.switchTo().alert(); //aynı tip alert ile uğraşacağımız için bi kere alert objesi yeterli
        System.out.println(confirmAlert.getText());
        confirmAlert.accept();

        WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text() ,'Double')]"));
        action.doubleClick(doubleClickButton).perform();

        System.out.println(confirmAlert.getText());
        confirmAlert.accept();
    }
}