package Tests;

import org.junit.Test;

public class AddProductToCartTest extends BaseTest {

    @Test
    public void testAddingFeaturedProductToCart() {
        final String productNumber = "1";
        homepageSteps.openHomepage();
        homepageSteps.addProductToCart(productNumber);
        homepageSteps.verifyModalTitle();
    }
}
