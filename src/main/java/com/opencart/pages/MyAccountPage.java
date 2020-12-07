package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = ".//*[contains(@href,'edit') and text()='Edit Account']")
    private WebElement editButton;

    @FindBy(xpath = ".//*[contains(@href,'password') and text()='Password']")
    private WebElement passwordButton;



    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getPasswordButton() {
        return passwordButton;
    }



}
