package quanTests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Abstract class Page contains common locators, data and methods shared within the Quandoo pages.
 */
public abstract class Page {

    private static WebDriver driver;

    /**
     * constant url
     */
    public static String BASE_URL = "https://www.quandoo.de";


    /**
     * @param driver
     */
    public Page(WebDriver driver) {
        Page.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locator valid for all tests
    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    static WebElement acceptCookies;

    /**
     * this method makes a click on cookies
     */
    public void clickAcceptCookiesButton() {
        acceptCookies.click();
    }

}
