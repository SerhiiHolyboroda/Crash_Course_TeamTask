package com.opencart.steps;

import com.opencart.pages.SuccessLogOutPage;
import org.testng.Assert;

public class SuccessLogOutPageBL {

    private SuccessLogOutPage successLogOutPage;

    public SuccessLogOutPageBL(){
        successLogOutPage = new SuccessLogOutPage();
    }

    public SuccessLogOutPageBL clickOnContinueButton() {
        successLogOutPage.getContinueButton().click();
        return new SuccessLogOutPageBL();
    }

    public void verifyUserLogOut() {
        String expectedMessage = "Account Logout";
        Assert.assertEquals(successLogOutPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }
}
