package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    @FindBy(xpath = ".//*[contains(@href,'edit') and text()='Edit Account']")
    private WebElement editButton;

    public WebElement getEditButton() {
        return editButton;
    }
}
