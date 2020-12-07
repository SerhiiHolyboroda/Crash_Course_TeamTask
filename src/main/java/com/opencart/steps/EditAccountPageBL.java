package com.opencart.steps;

import com.opencart.datamodel.EditAccountModel;
import com.opencart.pages.EditAccountPage;
import com.opencart.pages.SuccessEditAccountPage;
import com.opencart.repository.EditAccountModelRepository;
import org.testng.Assert;

public class EditAccountPageBL {

    private EditAccountPage editAccountPage;
    private SuccessEditAccountPage successEditAccountPage;

    public EditAccountPageBL(){
        editAccountPage = new EditAccountPage();
    }

    public EditAccountPageBL editAccount() throws InterruptedException{
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputFirstName(editAccountModel.getFirstName());
        inputLastName(editAccountModel.getLastName());
        inputEmail(editAccountModel.getEmail());
        inputTelephone(editAccountModel.getTelephone());
        clickOnContinueButton();

        successEditAccountPage = new SuccessEditAccountPage();
        return this;
    }

    private void inputFirstName(String firstName) {
        editAccountPage.getFirstNameInput().clear();
        editAccountPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        editAccountPage.getLastNameInput().clear();
        editAccountPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        editAccountPage.getEmailInput().clear();
        editAccountPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        editAccountPage.getTelephoneInput().clear();
        editAccountPage.getTelephoneInput().sendKeys(telephone);
    }

    private void clickOnContinueButton() throws InterruptedException {
        //Thread.sleep(6000);
        editAccountPage.getContinueButton().click();
        //Thread.sleep(6000);
    }

    public void verifyEditAccount() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(successEditAccountPage.getSuccessMessage().getText(), expectedMessage, "Incorrect page message");
    }

}
