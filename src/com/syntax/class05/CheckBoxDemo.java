package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {

    public static String url = "https://the-internet.herokuapp.com/checkboxes";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //driver.navigate().to(url);
        System.out.println(driver.getTitle());

        //locatibg checkboxes and storing them in the list
        List<WebElement> optionCheckBoxes = driver.findElements(By.cssSelector("input[type = 'checkbox']"));
        System.out.println(optionCheckBoxes.size());

        for (WebElement option : optionCheckBoxes
        ) {
        if(!option.isSelected()){
            option.click();//bazen zaten basılı gelebilir !
        }
        }
    }
}

