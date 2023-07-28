package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//launch the browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("http://www.amazon.com");//önemli
        driver.manage().window().minimize();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();//tab ları göremeyiz bu yüzden çok kullanılmaz!!!
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);//pause the execution for a while
        driver.navigate().forward();
        driver.close(); //closes only that tab
        driver.quit(); //closes the driver it terminates everything
    }
}
