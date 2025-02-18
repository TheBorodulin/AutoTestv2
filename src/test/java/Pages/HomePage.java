package Pages;

import constants.URLs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super.driver = driver;
    }

    private final By firstProductAddToCartButton = By.xpath("(//div[@class='product-image-wrapper']//a[contains(text(),'Add to cart')])[1]");
    private final By modalTitle = By.xpath("//h4[@class='modal-title w-100']");
    private final By productCount = By.xpath("//div[@class='features_items']//div[@class='product-image-wrapper']");
    private final By firstProductViewButton = By.xpath("(//a[contains(text(),'View Product')])[1]");

    public WebElement getFirstProductAddToCartButton() {
        return getClickableElement(firstProductAddToCartButton);
    }

    public WebElement getModalTitle() {
        return getVisibleElement(modalTitle);
    }

    public int getProductCount() {
        List<WebElement> productImages = driver.findElements(productCount);
        return productImages.size();
    }

    public void openHomepage() {
        driver.get(URLs.homepageUrl);
    }

    public void openFirstProduct() {
        getClickableElement(firstProductViewButton).click();
    }
}