package Tests;

import Steps.HomepageSteps;
import Steps.ProductPageSteps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

    public abstract class BaseTest {
    private WebDriver driver;
    protected HomepageSteps homepageSteps;
    protected ProductPageSteps productPageSteps;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        initializeSteps();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    private void initializeSteps(){
        homepageSteps = new HomepageSteps(driver);
        productPageSteps = new ProductPageSteps(driver);
    }
}