package Steps;

import Pages.Homepage;
import constants.URLs;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.SuccessfulMessages.EXPECTED_SUCCESSFUL_ADD_TO_CART_MODAL_MESSAGE;

public class HomepageSteps extends BaseSteps {
     Homepage homepage;

    public HomepageSteps(WebDriver driver) {
        super(driver);
        homepage = new Homepage(driver);
    }

    public void openHomepage() {
        openPageByURL(URLs.homepageUrl);
    }

    public void addProductToCart(String productNumber) {
        WebElement addButton = homepage.getAddProductToCartButton(productNumber);
        scrollToElement(addButton);
        addButton.click();
    }

    public void verifyModalTitle() {
        Assert.assertEquals(EXPECTED_SUCCESSFUL_ADD_TO_CART_MODAL_MESSAGE, homepage.getModalTitle().getText().trim());
    }

    public void clickOnProductViewButton(String productNumber) {
        WebElement viewButton = homepage.getProductViewButton(productNumber);
        scrollToElement(viewButton);
        viewButton.click();
    }

    public void verifyProductCount(int expectedCount) {
        int actualCount = homepage.getProductCount();
        Assert.assertEquals(expectedCount, actualCount);
    }
}