package tech.credify.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import tech.credify.dataobjects.LoanPurpose;

import static tech.credify.TestBundle.getProperty;

public class NonDmFunnelPage extends BasePage {
    private static final String PAGE_URI = getProperty("nonDmFunnelPage.uri");

    @FindBy(name = "desiredAmount")
    private WebElement loanAmountTextBox;
    @FindBy(name = "loan-purpose")
    private WebElement loanPurposeSelect;
    @FindBy(css = "button[data-auto=CheckYourRate]")
    private WebElement checkYourRateButton;
    @FindBy(xpath = "//a[text()='No thanks, I would like to continue with Upgrade']")
    private WebElement continueUpgradeLink;

    public NonDmFunnelPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    protected String getResourcePageUri() {
        return PAGE_URI;
    }

    public void setDesiredLoanAmount(String amount) {
        loanAmountTextBox.sendKeys(amount);
    }

    public void selectLoanPurpose(LoanPurpose purpose) {
        var dropdown = new Select(loanPurposeSelect);
        dropdown.selectByValue(purpose.name());
    }

    public void clickOnCheckYourRateButton() {
        checkYourRateButton.click();
    }

    public PersonalInformationPage clickOnContinueUpgradeLink() {
        continueUpgradeLink.click();
        return new PersonalInformationPage(driver);
    }
}
