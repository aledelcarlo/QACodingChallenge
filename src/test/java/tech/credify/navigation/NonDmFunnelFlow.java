package tech.credify.navigation;

import org.openqa.selenium.WebDriver;
import tech.credify.dataobjects.LoanPurpose;
import tech.credify.pageobjects.NonDmFunnelPage;

public class NonDmFunnelFlow {
    private NonDmFunnelPage nonDmFunnelPage;

    public NonDmFunnelFlow(WebDriver driver) {
        nonDmFunnelPage = new NonDmFunnelPage(driver);
    }

    public PersonalInformationFlow checkLoanRateWithAmountAndPurpose(String amount, LoanPurpose purpose) {
        nonDmFunnelPage.go();
        nonDmFunnelPage.setDesiredLoanAmount(amount);
        nonDmFunnelPage.selectLoanPurpose(purpose);
        nonDmFunnelPage.clickOnCheckYourRateButton();
        return new PersonalInformationFlow(nonDmFunnelPage.clickOnContinueUpgradeLink());
    }
}
