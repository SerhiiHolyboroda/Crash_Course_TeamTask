package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(xpath = ".//*[@value='Continue']")
    private WebElement continueButton;

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
