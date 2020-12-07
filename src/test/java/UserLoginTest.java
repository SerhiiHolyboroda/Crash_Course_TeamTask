import com.opencart.navigation.Navigation;
import com.opencart.steps.LoginPageBL;
import com.opencart.steps.RegisterPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.SuccessLogOutPageBL;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserLoginTest extends BaseTest {

    @BeforeClass
    public void beforeClass() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();
//        registerPageBL.clickOnLogoutButton();
        registerPageBL.clickOnLogoutButton();
        SuccessLogOutPageBL successLogOutPageBL = mainPageBL.getSuccessLogOutPageBL();
        successLogOutPageBL.verifyUserLogOut();
        successLogOutPageBL.clickOnContinueButton();
    }

    @Test
    public void loginUserWithValidParameters() throws InterruptedException {
       // new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginNewPerson();
       loginPageBL.verifyUserLogin();
    }
}
