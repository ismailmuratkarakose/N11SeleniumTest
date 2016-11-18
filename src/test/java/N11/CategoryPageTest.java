package N11;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ismail Murat on 11/16/2016.
 */
public class CategoryPageTest {

    @Test
    public void testCategory() {
        CategoryPage categoryPage = new CategoryPage();
        categoryPage.goToBookCategory();
        assertEquals("Kitap", categoryPage.getWebElement().findElementByCssSelector("h1").getText());
    }


}
