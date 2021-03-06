package com.opencart.steps;

import com.opencart.datamodel.LoginModel;
import com.opencart.pages.LoginPage;
//import com.opencart.pages.SuccessRegisterPage;!!!
import com.opencart.pages.PageAfterLogin;
import com.opencart.pages.SuccessLoginPage;
//import com.opencart.pages.SuccessRegisterPage;
import com.opencart.repository.LoginModelRepository;
import org.testng.Assert;

public class LoginPageBL {
    private LoginPage loginPage;
    private SuccessLoginPage successLoginPage;
public LoginPageBL() {
    loginPage = new LoginPage();
}

    public LoginPageBL loginNewPerson() {
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(loginModel.getEmail());
         inputPassword(loginModel.getPassword());


            clickOnContinueButton();

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





    private void clickOnContinueButton() {
        loginPage.getContinueButton().click();
    }


    public  void verifyUserLogin() {
        String expectedMessage = "nosferatugamevampire@gmail.com";
        Assert.assertEquals(successLoginPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");

    }


}
