package Tests;

import Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class AddProductToCartTest extends BaseTest {
    private static final String EXPECTED_MODAL_MESSAGE = "Added!";

    @Test
    public void testAddingFeaturedProductToCart() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomepage();
        homePage.getFirstProductAddToCartButton().click();
        Assert.assertEquals(EXPECTED_MODAL_MESSAGE, homePage.getModalTitle().getText().trim());
    }
}