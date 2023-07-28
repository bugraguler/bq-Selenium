package com.syntax.pom.pages;

import com.syntax.pom.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageWithPageFactory extends CommonMethods {

    @FindBy(css = "div.app_logo")
    public WebElement appLogoText;

    public DashboardPageWithPageFactory() {
        PageFactory.initElements(driver, this);
    }
}
