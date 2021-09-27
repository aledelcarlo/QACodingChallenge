package tech.credify.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import tech.credify.WebDriverProvider;
import tech.credify.dataobjects.LoanOffer;
import tech.credify.dataobjects.LoanPurpose;
import tech.credify.dataobjects.PersonalInformation;
import tech.credify.navigation.LoginFlow;
import tech.credify.navigation.NonDmFunnelFlow;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class LoanOffersTest extends WebDriverProvider {
    private WebDriver driver;

    @Factory(dataProvider = "webDriver", dataProviderClass = WebDriverProvider.class)
    public LoanOffersTest(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeClass
    public void setup() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void shouldShowLoanOffersWhenRequiredFieldsAreFilledWithValidInputs() {
        var nonDmFunnelFlow = new NonDmFunnelFlow(driver);
        var personalInformationFlow = nonDmFunnelFlow.checkLoanRateWithAmountAndPurpose("2000", LoanPurpose.SMALL_BUSINESS);

        var personalInformation = PersonalInformation.builder().build();
        personalInformationFlow.fillInPersonalInformationAndContinue(personalInformation);
        personalInformationFlow.fillInIncomeInformationAndContinue(personalInformation);
        var offerFlow = personalInformationFlow.fillInEmailInformationAndCheckLoanRate(personalInformation);

        LoanOffer offer = offerFlow.getLoanOffer();
        offerFlow.signOut();

        var loginFlow = new LoginFlow(driver);
        offerFlow = loginFlow.signInWithCredentials(personalInformation);

        LoanOffer offerAgain = offerFlow.getLoanOffer();

        offerFlow.verifyCurrentPage(driver.getCurrentUrl());
        validateOffersMatch(offer, offerAgain);
    }

    private void validateOffersMatch(LoanOffer firstOffer, LoanOffer secondOffer) {
        assertEquals(firstOffer.getLoanAmount(), secondOffer.getLoanAmount(), "Amount should match with the data submitted previously.");
        assertEquals(firstOffer.getMonthlyPayment(), secondOffer.getMonthlyPayment(), "Monthly payment should match with the data submitted previously.");
        assertEquals(firstOffer.getTerm(), secondOffer.getTerm(), "Term should match with the data submitted previously.");
        assertEquals(firstOffer.getInterestRate(), secondOffer.getInterestRate(), "Interest Rate should match with the data submitted previously.");
        assertEquals(firstOffer.getApr(), secondOffer.getApr(), "APR should match with the data submitted previously.");
    }
}
