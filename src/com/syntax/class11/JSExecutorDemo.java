package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JSExecutorDemo {
    public static String url = "https://demo.guru99.com/insurance/v1/index.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("aliveli@gmail.com");
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("asd123asd");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //explicit wait

        driver.switchTo().frame("gdpr-consent-notice");
        WebElement cookieAccept = driver.findElement(By.xpath("//span[text() = 'Tümünü Kabul Et']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() = 'Tümünü Kabul Et']")));
        cookieAccept.click();

        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.backgroundColor = 'red'",email);
        js.executeScript("arguments[0].style.backgroundColor = 'green'",passWord);

        WebElement logInButton = driver.findElement(By.xpath("//input[@name = 'submit']"));
        js.executeScript("arguments[0].click()",logInButton);

    }
}
