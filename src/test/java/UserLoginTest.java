import com.opencart.navigation.Navigation;
import com.opencart.pages.PageAfterLogin;
import com.opencart.steps.LoginPageBL;
import com.opencart.steps.MainPageBL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import static com.opencart.enums.URLs.BASE_URL;

public class UserLoginTest extends BaseTest {

    @Test
    public static void loginUserWithValidParameters() {

        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginNewPerson();

//        WebDriverWait wait = new WebDriverWait( webDriver, 10);
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID")));
//       new  Navigation().navigateToUrl(BASE_URL.getValue());

        new PageAfterLogin().getMyAccountButton().click();
        new PageAfterLogin().getLogOut().click();
//       loginPageBL.verifyUserLogin();

    }
}