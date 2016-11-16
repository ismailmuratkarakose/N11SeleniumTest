package N11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private Element webElement;
    private WebDriver webDriver;
    String winHandleBefore="";
    /*1. Kullanıcı anasayfadan giriş yap butonuna tıklayarak geldiği geldiği
     login sayfasından,facebook ile login olacak. (Burada test facebook hesabı
     açabilirsiniz, facebook butonuna basıldığında facebook kullanıcı adı, şifre istemeli).*/

    public LoginPage() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Desktop\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webElement= new Element(webDriver);
        webElement.getDriver().get("http://www.n11.com/");
    }

    public void goToLoginPage(){
        winHandleBefore = webDriver.getWindowHandle();
        webElement.findElementByClassName("btnSignIn").click();
        webElement.findElementByClassName("btnLogin").click();

        for(String winHandle : webDriver.getWindowHandles()){
            webDriver.switchTo().window(winHandle);
        }
    }
    public void enterUserInformations(){
        webElement.findElementByName("email").sendKeys(UserDetails.PHONENUMBER);
        webElement.findElementByName("pass").sendKeys(UserDetails.PASSWORD);
    }

    public void logInViaFacebook(){
        webElement.findElementByName("login").click();
        webDriver.switchTo().window(winHandleBefore);

    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public Element getWebElement() {
        return webElement;
    }
}
