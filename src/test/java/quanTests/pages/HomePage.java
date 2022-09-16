package quanTests.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Class HomePage contains home page locators and methods
 */
public class HomePage extends Page {

    /**
     * test constants
     */
    public static String TEXT_RESTAURANT_IN_BERLIN = "Restaurants in Berlin";
    public static String TEXT_RESTAURANT_IN_COLOGNE = "Restaurants in Cologne";

    /**
     * Constructor injecting the WebDriver interface
     *
     * @param driver
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //locators
    @FindBy(xpath = "//div[3]/div/div/div/a/h4")
    static WebElement berlinBtn;

    @FindBy(xpath = "//div[3]/div/div/div/a[2]/h4")
    static WebElement colnBtn;

    @FindBy(xpath = "//h1")
    static WebElement textBerlinBtn;

    @FindBy(xpath = "//h1")
    static WebElement textColnBtn;

    //methods
    public void clickOnTheBerlinBtn() throws InterruptedException {
        berlinBtn.click();
        Thread.sleep(5000);
    }

    public void clickOnTheColnBtn() throws InterruptedException {
        colnBtn.click();
        Thread.sleep(5000);
    }

    public String getTextBerlinBtn() throws InterruptedException {
        Thread.sleep(4000);
        return textBerlinBtn.getText();
    }

    public String getTextColnBtn() throws InterruptedException {
        Thread.sleep(4000);
        return textColnBtn.getText();
    }
}
