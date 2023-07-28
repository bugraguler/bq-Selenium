package com.syntax.pom.test;

import com.syntax.pom.pages.LoginPage;
import com.syntax.pom.testbase.BaseClass;

public class LoginPageTest {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("https://community.smartbear.com/t5/user/userloginpage");
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("bgrglr2222@gmail.com");
        loginPage.password.sendKeys("Test8891");
        loginPage.allowAllCookies.click();
        loginPage.loginButton.click();
        BaseClass.tearDown();

    }
}
