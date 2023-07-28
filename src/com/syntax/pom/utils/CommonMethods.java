package com.syntax.pom.utils;

import com.syntax.pom.testbase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CommonMethods extends BaseClass {
    //this method will send text to a given element
    public void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }

    public void switchFrame(int index){
        try {
            driver.switchTo().frame(index);
        }catch (NoSuchFrameException e){
            e.printStackTrace();
        }
    }

    public void switchFrame(WebElement frameElement){
        try {
            driver.switchTo().frame(frameElement);
        }catch (NoSuchFrameException e){
            e.printStackTrace();
        }
    }

    public void switchFrame(String nameOrId){
        try {
            driver.switchTo().frame(nameOrId);
        }catch (NoSuchFrameException e){
            e.printStackTrace();
        }
    }



//YUKARIDAKİLER COMMON METHOD ÖRNEKLERİDİR^
//***AŞAĞIDAKİLER COMMON METHOD DEĞİL DENEME YAPTIM SADECE KENDİ KENDİME!!!!
    /*

     */
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss");
    Date date = new Date();
    String dayDate = dateFormat.format(date);

    public void takeScreenShot() {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE); //the screenShot is taken on this step
        try {
            String path="screenShots/pomTest/" + dayDate + ".png";
            FileUtils.copyFile(srcFile, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//bu aşağıdaki aslında common bir method değil bu yüzden bunu başka bir sınıfa yazabiliriz!!!
    public void inventoryList(){
        List<WebElement>inventoryItems =driver.findElements(By.xpath("//div[@class= 'inventory_list']"));
        for (WebElement items:inventoryItems
             ) {
            String itemText = items.getText();
            System.out.println(itemText);
        }


    }


}
