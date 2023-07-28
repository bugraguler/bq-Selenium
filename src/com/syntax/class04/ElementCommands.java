package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        WebElement agreeButton = driver.findElement(By.xpath("//button[text()='AGREE']"));
        agreeButton.click();
        WebElement maleRadioButton = driver.findElement(By.cssSelector("input#male"));
        boolean isMaleRadioButtonDisplayed = maleRadioButton.isDisplayed();
        System.out.println(isMaleRadioButtonDisplayed);
        if (maleRadioButton.isEnabled()) {
            maleRadioButton.click();
        } else {
            System.out.println("Not enabled");
        }
        if (maleRadioButton.isSelected()) {
            System.out.println("you cannot select radio button twice");
        } else {
            maleRadioButton.click();
        }

        driver.quit();
    }
}
