package N11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ismail Murat on 11/16/2016.
 */
public class CategoryPage {

    private Element webElement;
    private WebDriver webDriver;

    /*3. Kullanıcı "Tüm Kategoriler "altındaki "Kitap, Müzik, Film, Oyun” başlığı altındaki
     “Kitap” kategorisine tıklayacak ve istenilen sayfanın geldiği kontrol edilecek
     */

    public Element getWebElement() {
        return webElement;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public CategoryPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webElement = new Element(webDriver);
        webElement.getDriver().get("http://www.n11.com/");
    }

    public void goToBookCategory() {
        webElement.findElementByLinkText("Kitap, Müzik, Film, Oyun").click();
        webElement.findElementByLinkText("Kitap").click();
    }


}
