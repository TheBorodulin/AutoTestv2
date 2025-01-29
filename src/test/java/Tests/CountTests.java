package Tests;

import org.junit.Test;
import Steps.HomepageSteps;

public class CountTests extends BaseTest {

    @Test
    public void testProductCount() {
        final int expectedProductCount = 34;
        HomepageSteps homePageSteps = new HomepageSteps(driver);
        homePageSteps.openHomepage();
        homePageSteps.verifyProductCount(expectedProductCount);
    }
}