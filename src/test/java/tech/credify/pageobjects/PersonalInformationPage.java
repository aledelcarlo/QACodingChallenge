package tech.credify.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tech.credify.pageobjects.components.ContactForm;
import tech.credify.pageobjects.components.IncomeForm;
import tech.credify.pageobjects.components.LoginForm;

import static tech.credify.TestBundle.getProperty;

public class PersonalInformationPage extends BasePage {
    private static final String PAGE_URI = getProperty("personalInformationPage.uri");

    private ContactForm contactForm;
    private IncomeForm incomeForm;
    private LoginForm loginForm;

    @FindBy(xpath = "//input[@name='agreements']/parent::*")
    private WebElement termsOfUseCheckBox;
    @FindBy(css = "button[data-auto=continuePersonalInfo]")
    private WebElement continueButton;
    @FindBy(css = "button[data-auto=submitPersonalInfo]")
    private WebElement checkYourRateButton;

    public PersonalInformationPage(WebDriver driver) {
        super(driver);
        contactForm = new ContactForm(driver);
        incomeForm = new IncomeForm(driver);
        loginForm = new LoginForm(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    protected String getResourcePageUri() {
        return PAGE_URI;
    }

    public ContactForm getContactForm() {
        return contactForm;
    }

    public IncomeForm getIncomeForm() {
        return incomeForm;
    }

    public LoginForm getLoginForm() {
        return loginForm;
    }

    public void clickOnTermsOfUse() {
        termsOfUseCheckBox.click();
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }

    public OfferPage clickOnCheckYourRateButton() {
        checkYourRateButton.click();
        return new OfferPage(driver);
    }
}
