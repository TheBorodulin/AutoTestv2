package Tests;

import Steps.HomepageSteps;
import org.junit.Test;

public class AddProductToCartTest extends BaseTest {

    @Test
    public void testAddingFeaturedProductToCart() {
        final String productNumber = "1";
        HomepageSteps homePageSteps = new HomepageSteps(driver);
        homePageSteps.openHomepage();
        homePageSteps.addProductToCart(productNumber);
        homePageSteps.verifyModalTitle();
    }
}
