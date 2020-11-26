package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SuccessLoginPage {

    @FindBy(xpath = ".//*[@id=\"input-email\"]")
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        return successTitle;
    }
}
