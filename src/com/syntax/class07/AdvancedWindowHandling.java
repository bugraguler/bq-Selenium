package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {

    //click on buttons open new windows (tabs) and switchTo windows and perform different actions
    public static String url = "http://practice.syntaxtechs.net/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String mainPageHandle = driver.getWindowHandle();
        WebElement igButton = driver.findElement(By.linkText("Follow On Instagram")); //linktext baş ve sondaki boşlukları sildik
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook")); //linktext baş ve sondaki boşlukları sildik
        WebElement igAndFbFollowButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
        igButton.click();
        fbButton.click();
        igAndFbFollowButton.click();
        Set<String> allwindowHandles = driver.getWindowHandles(); //automatically return us a LinkedHashSet
        System.out.println(allwindowHandles.size());
        Iterator<String> iterator = allwindowHandles.iterator();
        while (iterator.hasNext()) {
            String handle = iterator.next();
            if (!mainPageHandle.equals(handle)) {
                driver.switchTo().window(handle); // switch windowhandle
                String title = driver.getTitle();
                System.out.println(title);
                driver.close();
            }
        }
        driver.switchTo().window(mainPageHandle); //switching to the parent handle again !!!!!!
        igButton.click();
    }
}


