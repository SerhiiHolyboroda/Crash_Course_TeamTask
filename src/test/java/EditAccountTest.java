import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static com.opencart.enums.URLs.BASE_URL;

public class EditAccountTest extends BaseTest{


    @BeforeClass
    public void registerUserWithValidParameters() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();

//        new Navigation().navigateToUrl(BASE_URL.getValue());
//        mainPageBL = new MainPageBL();
//        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
//                .clickOnMyAccountButton()
//                .clickOnLoginButton()
//                .loginNewPerson();
//        loginPageBL.verifyUserLogin();
    }

    @Test
    public void editAccountUserWithValidParameters() throws InterruptedException {
        //new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
//        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
//                .clickOnMyAccountButton()
//                .clickOnLoginButton()
//                .loginNewPerson();
//        loginPageBL.verifyUserLogin();

       // MyAccountPageBL myAccountPageBL = ;

       // EditAccountPageBL editAccountPageBL = new EditAccountPageBL();
        EditAccountPageBL editAccountPageBL =  mainPageBL.getMyAccountPageBL()
                .clickOnEditButton()
                .editAccount();

    }
}
