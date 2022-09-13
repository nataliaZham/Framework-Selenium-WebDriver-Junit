package quanTests.tests;

import quanTests.pages.HomePage;
import quanTests.pages.RestaurantPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class BaseTest contains methods that initialize common settings
 */
public class BaseTest {

    protected WebDriver driver;
    protected RestaurantPage restaurantPage;
    protected HomePage homePage;

    /**
     * this method initializes common settings
     */
    @Before
    public void initialSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        restaurantPage = new RestaurantPage(driver);
        homePage = new HomePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
