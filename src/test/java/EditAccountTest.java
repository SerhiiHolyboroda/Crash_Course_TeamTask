import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static com.opencart.enums.URLs.BASE_URL;

public class EditAccountTest extends BaseTest{


    @BeforeClass
    public void registerUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();
        registerPageBL.clickOnLogoutButton();
        SuccessLogOutPageBL successLogOutPageBL = mainPageBL.getSuccessLogOutPageBL();
        successLogOutPageBL.verifyUserLogOut();
        successLogOutPageBL.clickOnContinueButton();


//                .clickOnContinueButton();
//        successLogOutPageBL.clickOnContinueButton();


//        new Navigation().navigateToUrl(BASE_URL.getValue());
        mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = null;
        try {
            loginPageBL = mainPageBL.getHeaderPageBL()
                    .clickOnMyAccountButton()
                    .clickOnLoginButton()
                    .loginNewPerson();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPageBL.verifyUserLogin();
        }

    @Test
    public void editAccountUser() throws InterruptedException {
        MainPageBL mainPageBL = new MainPageBL();
        EditAccountPageBL editAccountPageBL =  mainPageBL.getMyAccountPageBL()
                .clickOnEditButton()
                .editAccount();
        editAccountPageBL.verifyEditAccount();
    }
}
