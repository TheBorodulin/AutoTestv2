package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    protected WebElement getClickableElement(By element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement getVisibleElement(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    protected List<WebElement> getVisibleElements(By elements) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elements));
    }
}