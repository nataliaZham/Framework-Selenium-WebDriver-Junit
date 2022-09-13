package quanTests.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import static org.hamcrest.CoreMatchers.containsString;
import static quanTests.pages.Page.BASE_URL;
import static quanTests.pages.HomePage.TEXT_RESTAURANT_IN_BERLIN;
import static quanTests.pages.HomePage.TEXT_RESTAURANT_IN_COLOGNE;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Class HomePageTest contains tests for the https://www.quandoo.de/en/
 */
public class HomePageTest extends BaseTest {

    /**
     * this method opens homepage, sets the required screen scale and clicks on the cookie
     */
    @Before
    public void setUp() {
        driver.get(BASE_URL);
        driver.manage().window().setSize(new Dimension(1200, 997));
        homePage.clickAcceptCookiesButton();
    }

    /**
     * this test makes a click on the berlin button locator and checks text using a constant
     */
    @Test
    public void checkTextBerlinBtn() throws InterruptedException {
        Thread.sleep(4000);
        homePage.clickOnTheBerlinBtn();
        assertThat(homePage.getTextBerlinBtn(), containsString(TEXT_RESTAURANT_IN_BERLIN));
    }

    /**
     * this test makes a click on the coln button locator and checks text using a constant
     */
    @Test
    public void checkTextColnBtn() throws InterruptedException {
        Thread.sleep(4000);
        homePage.clickOnTheColnBtn();
        assertThat(homePage.getTextBerlinBtn(), containsString(TEXT_RESTAURANT_IN_COLOGNE));
    }

}
