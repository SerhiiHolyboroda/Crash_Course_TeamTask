package com.opencart.steps;

import com.opencart.datamodel.LoginModel;
import com.opencart.datamodel.RegisterModel;
import com.opencart.pages.LoginPage;
import com.opencart.pages.SuccessLoginPage;
import com.opencart.repository.LoginModelRepository;

import com.opencart.repository.RegisterModelRepository;
import com.opencart.repository.UserRepository;
import org.testng.Assert;
public class LoginPageBL {
    private LoginPage loginPage;
    private SuccessLoginPage successLoginPage;
public LoginPageBL() {
    loginPage = new LoginPage();
}

    public LoginPageBL loginNewPerson() throws InterruptedException {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();
       // LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(UserRepository.Email);
        inputPassword(UserRepository.Password);
            clickOnContinueButton();
//        inputEmail(loginModel.getEmail());
//        inputPassword(loginModel.getPassword());
//        clickOnContinueButton();

        successLoginPage = new SuccessLoginPage();
        return this;
    }

    private void inputEmail(String email) {
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String password) {
        loginPage.getPasswordInput().clear();
        loginPage.getPasswordInput().sendKeys(password);

    }

    private void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(6000);
        loginPage.getContinueButton().click();
        Thread.sleep(6000);
    }

    public void verifyUserLogin() {
        String expectedMessage = "My Account";
        Assert.assertEquals(successLoginPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }


}
