package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//launch the browser
        WebDriver driver = new ChromeDriver();
        driver.get("http://fb.com");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        String expectedTitle="Facebook - Giriş Yap veya Kaydol";
        if(title.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else{
            System.out.println("Check the title again it is wrong");
        }
        driver.quit();
    }

}
