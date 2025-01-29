package Tests;

import Steps.HomepageSteps;
import Steps.ProductPageSteps;
import org.junit.Test;

public class AddReviewTest extends BaseTest {
    @Test
    public void testAddingReviewOnProduct() {
        final String productNumber = "1";
        final String name = "Test";
        final String email = "test@example.com";
        final String reviewText = "Great product, highly recommend!";

        HomepageSteps homePageSteps = new HomepageSteps(driver);
        homePageSteps.openHomepage();
        homePageSteps.clickOnProductViewButton(productNumber);

        ProductPageSteps productPageSteps = new ProductPageSteps(driver);
        productPageSteps.writeReview(name, email, reviewText);
        productPageSteps.assertSuccessMessageIsDisplayed();
    }
}