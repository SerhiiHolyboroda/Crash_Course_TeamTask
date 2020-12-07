package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessRegisterPage extends BasePage {

    @FindBy(xpath = ".//*[@id='content']/h1")
    private WebElement successTitle;


    @FindBy(xpath = "//a[@class='list-group-item' and contains(@href, 'logout')]")
    private WebElement logoutButton;

    public WebElement getSuccessTitle() {
        return successTitle;
    }

    public WebElement getLogoutButton() { return logoutButton; }

}
