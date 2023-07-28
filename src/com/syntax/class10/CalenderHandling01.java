package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

//navigating the delta and choosing flight dates
//gidiş ve dönüşfarklı aylarda ise

public class CalenderHandling01 {
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
                break; //çok önemli break kullanmazsan stale hatası verir
            }
        }

        WebElement arrMonth = driver.findElement(By.className("dl-datepicker-month-1"));
        String arrMonthText = arrMonth.getText();
        while(!arrMonthText.equals("January")){
            nextButton.click();
            arrMonthText=arrMonth.getText();
        }

        List<WebElement> ArrDaysOfMonth = driver.findElements(By.xpath("//tbody[@class ='dl-datepicker-tbody-1']/tr/td"));
        for (WebElement arrDay : ArrDaysOfMonth
        ) {
            String arrDayText = arrDay.getText();
            if (arrDayText.equals("26")) {
                arrDay.click();
                break; //çok önemli break kullanmazsan stale hatası verir
            }
        }
        WebElement doneButton = driver.findElement(By.xpath("//button[text() = 'done']"));
        doneButton.click();
    }
}




/*

 */