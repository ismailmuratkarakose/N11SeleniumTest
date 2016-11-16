package N11;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;
/**
 * Unit test for simple LoginPage.
 */
public class LoginPageTest
{
   @Test
public void testLogin() throws Exception {
    LoginPage loginPage= new LoginPage();
    loginPage.goToLoginPage();
    loginPage.enterUserInformations();
    loginPage.logInViaFacebook();
    assertEquals("Ismail Karaköse", loginPage.getWebElement().findElementByClassName("username").getText());
}
}
