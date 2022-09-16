package quanTests.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import static quanTests.pages.RestaurantPage.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Class RestaurantPageTest contains tests for Quandoo restaurant page
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

    // this test clicks on the photos button and makes sure there is text below the photos
    @Test
    public void checkTextUnderThePhoto() throws InterruptedException {
        restaurantPage.clickOnPhotosBtn();
        assertThat(restaurantPage.getTextAbovePhoto(), containsString(TEXT_PHOTOS_OF));
    }

    // this test clicks on the menu button and makes sure there is text below the menu
    @Test
    public void checkTextUnderTheMenu() throws InterruptedException {
        restaurantPage.clickOnMenuBtn();
        assertThat(restaurantPage.getTextAboveMenu(), containsString(TEXT_MENU_FROM));
    }

    // this test clicks on the reserveNow button and checks that the correct page has opened
    @Test
    public void checkReserveNowButton() throws InterruptedException {
        restaurantPage.clickOnReserveNowBtn();
        assertThat(restaurantPage.getReserveNowText(), containsString(TEXT_COMPLETE_YOUR_RESERVATION));
    }

    // this test clicks on the reviews button and makes sure there is text below the reviews
    @Test
    public void checkTextUnderTheReviews() throws InterruptedException {
        restaurantPage.clickOnReviewsBtn();
        assertThat(restaurantPage.getTextAboveReviews(), containsString(TEXT_REVIEWS_OF));
    }

}






