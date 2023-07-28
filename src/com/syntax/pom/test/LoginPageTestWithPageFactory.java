package com.syntax.pom.test;

import com.syntax.pom.pages.DashboardPageWithPageFactory;
import com.syntax.pom.pages.LoginPageWithPageFactory;
import com.syntax.pom.testbase.BaseClass;
import com.syntax.pom.utils.CommonMethods;

public class LoginPageTestWithPageFactory {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("https://www.saucedemo.com/");
        LoginPageWithPageFactory loginPageWithPageFactory = new LoginPageWithPageFactory();
        DashboardPageWithPageFactory dashboardPageWithPageFactory=new DashboardPageWithPageFactory();
        CommonMethods commonMethods = new CommonMethods();
        loginPageWithPageFactory.username.sendKeys("standard_user");
        loginPageWithPageFactory.password.sendKeys("secret_sauce");
        loginPageWithPageFactory.loginButton.click();
        String logoText =dashboardPageWithPageFactory.appLogoText.getText();
        System.out.println(logoText);
        commonMethods .inventoryList();
        commonMethods.takeScreenShot();
        BaseClass.tearDown();
    }
}
