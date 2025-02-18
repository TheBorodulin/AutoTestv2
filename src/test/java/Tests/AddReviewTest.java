package Tests;

import Pages.HomePage;
import Pages.ProductPage;
import org.junit.Assert;
import org.junit.Test;

public class AddReviewTest extends BaseTest {
    @Test
    public void testAddingReviewOnProduct() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        homePage.openHomepage();
        homePage.openFirstProduct();

        productPage.getWriteReviewButton().click();
        productPage.getNameField().sendKeys("test");
        productPage.getEmailField().sendKeys("test@example.com");
        productPage.getReviewField().sendKeys("Great product, highly recommend!");
        productPage.getSubmitButton().click();

        Assert.assertTrue(productPage.checkSuccessMessagePresence());
    }
}