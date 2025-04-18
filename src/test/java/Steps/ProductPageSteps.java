package Steps;

import Pages.ProductPage;
import constants.URLs;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static constants.SuccessfulMessages.EXPECTED_SUCCESSFUL_PRODUCT_REVIEW_MESSAGE;

public class ProductPageSteps extends BaseSteps {
    private ProductPage productPage;

    public ProductPageSteps(WebDriver driver) {
        super(driver);
        productPage = new ProductPage(driver);
    }

    public void openProductPageByNumber(String productNumber) {
        openPageByURL(URLs.productDetailsUrl.concat(productNumber));
    }

    public void writeReview(String name, String email, String review) {
        productPage.getWriteReviewButton().click();
        productPage.getNameField().sendKeys(name);
        productPage.getEmailField().sendKeys(email);
        productPage.getReviewField().sendKeys(review);
        productPage.getSubmitButton().click();
    }

    public void assertSuccessMessageIsDisplayed() {
        WebElement successMessageElement = productPage.getSuccessMessageElement();
        String actualSuccessText = successMessageElement.getText();
        Assert.assertEquals(EXPECTED_SUCCESSFUL_PRODUCT_REVIEW_MESSAGE, actualSuccessText);
    }
}