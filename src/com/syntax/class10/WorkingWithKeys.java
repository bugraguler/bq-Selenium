package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//launch the browser
        WebDriver driver = new ChromeDriver();
        driver.get("http://fb.com");
        WebElement username=driver.findElement(By.className("_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy"));   //web element döndürür
        username.sendKeys("Tester", Keys.TAB);
        WebElement passWord=driver.findElement(By.className("_42ft _4jy0 _al65 _4jy3 _4j64 selected _51sy"));
        passWord.sendKeys("Test", Keys.ENTER);

        //click yerine Keys.TAB veya Keys.ENTER ile key direk kullanıldı !!



    }
}
