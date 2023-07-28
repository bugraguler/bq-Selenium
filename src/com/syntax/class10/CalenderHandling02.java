package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

//aynı aydan gidiş geliş tarihi seçme

public class CalenderHandling02 {

    public static String url = "https://www.delta.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement selectLanguage = driver.findElement(By.xpath("//button[text() =' Belgium - English ']"));
        selectLanguage.click();
        WebElement calender = driver.findElement(By.id("input_departureDate_1"));
        calender.click();
        WebElement nextButton = driver.findElement(By.xpath("//span[text() = 'Next']"));
        WebElement dMonth = driver.findElement(By.className("dl-datepicker-month-0"));
        String dMonthText = dMonth.getText();
        while (!dMonthText.equals("October")) {
            nextButton.click();
            dMonthText = dMonth.getText();
        }

        List<WebElement> daysOfMonth = driver.findElements(By.xpath("//tbody[@class ='dl-datepicker-tbody-0']/tr/td"));
        for (WebElement departDay : daysOfMonth
        ) {
            String departDayText = departDay.getText();
            if (departDayText.equals("12")) {
                departDay.click();
            }
            if (departDayText.equals("19")) {
                departDay.click();
                break;
            }
        }

        /*WebElement doneButton = driver.findElement(By.xpath("//button[text() = 'done']"));
        doneButton.click();

         */
    }
}
