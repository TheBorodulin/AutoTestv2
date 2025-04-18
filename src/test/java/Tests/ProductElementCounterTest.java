package Tests;

import org.junit.Test;

public class ProductElementCounterTest extends BaseTest {

    @Test
    public void testProductCount() {
        final int expectedProductCount = 34;
        homepageSteps.openHomepage();
        homepageSteps.verifyProductCount(expectedProductCount);
    }
}