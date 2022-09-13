package quanTests.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import static quanTests.pages.RestaurantPage.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Class RestaurantPageTest contains tests for the https://www.quandoo.de/en/place/cavallino-rosso
 */
public class RestaurantPageTest extends BaseTest {

    /**
     * this method opens the page of the restaurant, sets the required screen scale and clicks on the cookie
     */
    @Before
    public void setUp() {
        driver.get(RESTAURANT_URL);
        driver.manage().window().setSize(new Dimension(1200, 997));
        restaurantPage.clickAcceptCookiesButton();
    }

    /**
     * this test makes a click on the photo button locator and checks text using a constant
     */
    @Test
    public void checkTextUnderThePhoto() throws InterruptedException {
        restaurantPage.clickOnPhotosBtn();
        assertThat(restaurantPage.getTextAbovePhoto(), containsString(TEXT_PHOTOS_OF));
    }

    /**
     * this test makes a click on the menu button locator and checks text using a constant
     */
    @Test
    public void checkTextUnderTheMenu() throws InterruptedException {
        restaurantPage.clickOnMenuBtn();
        assertThat(restaurantPage.getTextAboveMenu(), containsString(TEXT_MENU_FROM));
    }

    /**
     * this test makes a click on the reserveNow button locator and checks text using a constant
     */
    @Test
    public void checkReserveNowButton() throws InterruptedException {
        restaurantPage.clickOnReserveNowBtn();
        assertThat(restaurantPage.getReserveNowText(), containsString(TEXT_COMPLETE_YOUR_RESERVATION));
    }

    /**
     * this test makes a click on the reviews button locator and checks text using a constant
     */
    @Test
    public void checkTextUnderTheReviews() throws InterruptedException {
        restaurantPage.clickOnReviewsBtn();
        assertThat(restaurantPage.getTextAboveReviews(), containsString(TEXT_REVIEWS_OF));
    }

}






