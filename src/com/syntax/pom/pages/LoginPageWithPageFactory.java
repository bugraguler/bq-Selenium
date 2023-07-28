package com.syntax.pom.pages;

import com.syntax.pom.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id = "user-name")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder = 'Password']")
    public WebElement password;

    @FindBy(css = "input#login-button")
    public WebElement loginButton;

    public LoginPageWithPageFactory(){     //dikkat bu bir constructor
        PageFactory.initElements(driver,this);

    }



}
