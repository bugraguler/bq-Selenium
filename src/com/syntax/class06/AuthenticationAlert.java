package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
    public static String url = "https:////admin:admin@the-internet.herokuapp.com/basic_auth";

    //username:password@
    //bazı sayfalar açılmadan username ve password isterler bunlarda username ve password direk url ye eklenir.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

    }
}