package Tests;

import Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class CountTests extends BaseTest {
    private static final int EXPECTED_PRODUCT_COUNT = 34;

    @Test
    public void testProductCount() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomepage();
        int actualProductCount = homePage.getProductCount();
        Assert.assertEquals(EXPECTED_PRODUCT_COUNT, actualProductCount);
    }
}