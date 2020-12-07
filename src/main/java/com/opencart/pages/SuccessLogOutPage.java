package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessLogOutPage extends BasePage{

    @FindBy(xpath = ".//*[@id='content']/h1")
    private WebElement successTitle;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement continueButton;

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getSuccessTitle() {
        return successTitle;
    }

}
