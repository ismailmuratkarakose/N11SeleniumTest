package N11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by Ismail Murat on 11/14/2016.
 */
public class Element {

    private WebDriver driver;

    public Element(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement findElementById(String id) {
        return driver.findElement(By.id(id));
    }

    public WebElement findElementByClassName(String className) {
        return driver.findElement(By.className(className));
    }

    public WebElement findElementByCssSelector(String selector) {
        return driver.findElement(By.cssSelector(selector));
    }

    public WebElement findElementByXpath(String xPath) {
        return driver.findElement(By.xpath(xPath));
    }

    public WebElement findElementByLinkText(String text) {
        return driver.findElement(By.linkText(text));
    }

    public WebElement findElementByName(String name) {
        return driver.findElement(By.name(name));
    }

    public List<WebElement> findElementsByXpath(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }
}