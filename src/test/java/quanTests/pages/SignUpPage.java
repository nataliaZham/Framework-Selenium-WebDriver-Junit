package quanTests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class contains signUp page locators and methods
 */
public class SignUpPage extends Page {

    /**
     * @param driver
     */
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    //locators
    @FindBy(xpath = "//*[@data-qa ='first-name-input']")
    static WebElement firstNameInput;

    @FindBy(xpath = "//*[@data-qa = 'last-name-input']")
    static WebElement lastNameInput;

    @FindBy(xpath = "//*[@data-qa = 'email-input']")
    static WebElement emailInput;

    @FindBy(xpath = "//*[@data-qa = 'password-input']")
    static WebElement passwordInput;

    @FindBy(xpath = "//*[@data-qa = 'password-confirm-input']")
    static WebElement ConfirmPasswordInput;

    @FindBy (xpath = "//*[@id='root']/div/div/form/section/div[10]/div/label/i/svg)")
    static WebElement IAgreeBtn;













}
