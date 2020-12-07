package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessEditAccountPage extends BasePage{
    private static final String SUCCESS_MESSAGE = "Success: Your account has been successfully updated";

   // @FindBy(className = "alert alert-success alert-dismissible")
            // ".//*[@id=\"account-account\"]/div[1]")
    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
//    @FindBy(xpath = "//*[.='"+ SUCCESS_MESSAGE + "']")
    private WebElement successMessage;

    public WebElement getSuccessMessage() {
        return successMessage;
    }
}
