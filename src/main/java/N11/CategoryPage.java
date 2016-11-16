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
     4. Açılan sayfada solda “Yazarlar” linkine tıklayacak ve sayfanın geldiği kontrol edilecek.
     5. Kullanıcının, açılan yazarlar sayfasında her harfe tıklayarak geldiği sayfalarda, en fazla
     80 yazar olduğu ve isimlerinin baş harflerinin doğru olduğu kontrol edilecek.
     (bir harfte 80’den fazla sayıda yazar varsa paging yapılıyor, burada 1. sayfanın kontrolü yeterlidir).
     6. Birden fazla sayfaya bölünen harflerde paging yapıldığında, bir önceki sayfanın son isminin
     bir sonraki sayfada listelenmediği kontrol edilecek (sadece 2. sayfanın kontrolü yeterlidir).*/

    public CategoryPage() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Desktop\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webElement= new Element(webDriver);
        webElement.getDriver().get("http://www.n11.com/");
    }

    public void
}
