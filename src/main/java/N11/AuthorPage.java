package N11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Ismail Murat on 11/17/2016.
 */

/*   4. Açılan sayfada solda “Yazarlar” linkine tıklayacak ve sayfanın geldiği kontrol edilecek.
     5. Kullanıcının, açılan yazarlar sayfasında her harfe tıklayarak geldiği sayfalarda, en fazla
     80 yazar olduğu ve isimlerinin baş harflerinin doğru olduğu kontrol edilecek.
     (bir harfte 80’den fazla sayıda yazar varsa paging yapılıyor, burada 1. sayfanın kontrolü yeterlidir).
     6. Birden fazla sayfaya bölünen harflerde paging yapıldığında, bir önceki sayfanın son isminin
     bir sonraki sayfada listelenmediği kontrol edilecek (sadece 2. sayfanın kontrolü yeterlidir).
* */
public class AuthorPage {
    private Element webElement;
    private WebDriver webDriver;

    public Element getWebElement() {
        return webElement;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public AuthorPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webElement = new Element(webDriver);
    }

    public void goToAuthorsPage() {
        webElement.getDriver().get("http://www.n11.com/kitap");
        webElement.findElementByLinkText("Yazarlar").click();
    }

    public List<WebElement> listOfAuthorNames() {
        return webElement.findElementsByXpath("//*[@id='authorsList']/*/*/*");
    }
    public List<WebElement> listOfAuthorNamesForPagigator() {
        return webElement.findElementsByXpath("//*[@id='authorsList']/*/*/*/*");
    }

    public boolean isTherePaging() {
        boolean result = webElement.findElementsByXpath("//*[@class='next navigation']").size() != 0;
        if (result)
            return true;
        else
            return false;
    }
    public void goToNextPage(){
        webElement.findElementByXpath("//*[@class='next navigation']").click();
    }

}
