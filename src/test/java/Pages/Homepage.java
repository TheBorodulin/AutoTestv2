package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends BasePage {

    private final String addProductToCartButton = "//div[@class='product-image-wrapper']//a[contains(text(),'Add to cart')][%s]";
    private final String productViewButton = "(//a[contains(text(),'View Product')])[1]";
    private final By modalTitle = By.xpath("//h4[@class='modal-title w-100']");
    private final By productIcon = By.xpath("//div[@class='features_items']//div[@class='product-image-wrapper']");

    public Homepage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddProductToCartButton(String productNumber) {
        return getClickableElement(By.xpath(String.format(addProductToCartButton, productNumber)));
    }

    public WebElement getModalTitle() {
        return getVisibleElement(modalTitle);
    }

    public int getProductCount() {
        return getVisibleElements(productIcon).size();
    }

    public WebElement getProductViewButton(String productNumber) {
        return getClickableElement(By.xpath(String.format(productViewButton, productNumber)));
    }
}