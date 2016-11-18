package N11;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Ismail Murat on 11/17/2016.
 */
public class AuthorPageTest {
    AuthorPage authorPage;

    @Test
    public void testNumberOfAuthorsAndHeaders() {
        String alphabet = "ABCÇDEFGHIİJKLMNOÖPQRSŞTUÜVWXYZ";
        WebElement tempElement=null;
        WebElement tempNextPageElement= null;
        authorPage = new AuthorPage();
        authorPage.getWebElement().getDriver().get("http://www.n11.com/yazarlar/");
        for (int i = 0; i < alphabet.length(); i++) {
            char temp = alphabet.charAt(i);
            authorPage.getWebElement().getDriver().get("http://www.n11.com/yazarlar/" + temp);
            List<WebElement> listOfAuthorNames=authorPage.listOfAuthorNames();
            assertEquals(true, listOfAuthorNames.size() <= 80);
            assertEquals(temp, listOfAuthorNames.get(0).getText().charAt(0));
            if(authorPage.isTherePaging()){
                tempElement=listOfAuthorNames.get(79);
                authorPage.goToNextPage();
                tempNextPageElement=authorPage.listOfAuthorNamesForPagigator().get(0);
               }
            assertNotEquals(tempNextPageElement,tempElement);
            }
    }

    @Test
    public void testAuthorsPageHeader() {
        authorPage = new AuthorPage();
        authorPage.goToAuthorsPage();
        assertEquals("Yazarlar", authorPage.getWebElement().findElementByLinkText("Yazarlar").getText());

    }
}
