package tech.credify.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static tech.credify.TestBundle.getProperty;

public class OfferPage extends BasePage {
    private static final String PAGE_URI = getProperty("offerPage.uri");

    @FindBy(css = "div[data-fetching]")
    private WebElement dataFetchingDiv;
    @FindBy(css = "span[data-auto=userLoanAmount]")
    private WebElement loanAmountSpan;
    @FindBy(css = "li>div[data-auto=defaultMonthlyPayment]")
    private WebElement monthlyPaymentDiv;
    @FindBy(css = "li[data-auto=defaultLoanTerm]>div")
    private WebElement termDiv;
    @FindBy(css = "li[data-auto=defaultLoanInterestRate]>div")
    private WebElement interestRateDiv;
    @FindBy(css = "div[data-auto=defaultAPR]")
    private WebElement aprDiv;
    @FindBy(css = "label[aria-label='Open Site Menu']")
    private WebElement menuLabel;
    @FindBy(linkText = "Sign Out")
    private WebElement signOutLink;

    public OfferPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    protected String getResourcePageUri() {
        return PAGE_URI;
    }

    public String getLoanAmount() {
        waitUntilAttributeIs(dataFetchingDiv, "data-fetching", "false");
        return loanAmountSpan.getText();
    }

    public String getMonthlyPayment() {
        return monthlyPaymentDiv.getText();
    }

    public String getTerm() {
        return termDiv.getText();
    }

    public String getInterestRate() {
        return interestRateDiv.getText();
    }

    public String getApr() {
        return aprDiv.getText();
    }

    public void clickOnMenu() {
        waitUntilAttributeIs(dataFetchingDiv, "data-fetching", "false");
        menuLabel.click();
    }

    public void clickOnSignOut() {
        signOutLink.click();
    }
}
