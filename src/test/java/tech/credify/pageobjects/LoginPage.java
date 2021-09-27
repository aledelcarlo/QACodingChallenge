package tech.credify.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tech.credify.pageobjects.components.LoginForm;

import static tech.credify.TestBundle.getProperty;

public class LoginPage extends BasePage {
    private static final String PAGE_URI = getProperty("loginPage.uri");

    private LoginForm loginForm;

    @FindBy(css = "button[data-auto=login]")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        loginForm = new LoginForm(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    protected String getResourcePageUri() {
        return PAGE_URI;
    }

    public LoginForm getLoginForm() {
        return loginForm;
    }

    public OfferPage clickOnSignInButton() {
        signInButton.click();
        return new OfferPage(driver);
    }
}
