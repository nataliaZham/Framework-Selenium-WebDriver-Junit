package quanTests.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Abstract class Page contains common locators, data and methods shared within the Quandoo pages.
 */
public abstract class Page {

    //classes
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

    //locators
    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    static WebElement acceptCookies;

    //methods
    public void clickAcceptCookiesButton() {
        try {
            if (acceptCookies.isDisplayed()) {
                acceptCookies.click();
            }
        } catch (NoSuchElementException e) {
            //
        }

    }
}
