package tech.credify.navigation;

import tech.credify.dataobjects.LoanOffer;
import tech.credify.pageobjects.OfferPage;

import static org.testng.Assert.assertEquals;

public class OfferFlow {
    private OfferPage offerPage;

    public OfferFlow(OfferPage offerPage) {
        this.offerPage = offerPage;
    }

    public LoanOffer getLoanOffer() {
        return new LoanOffer(offerPage.getLoanAmount(), offerPage.getMonthlyPayment(),
                offerPage.getTerm(), offerPage.getInterestRate(), offerPage.getApr());
    }

    public void signOut() {
        offerPage.clickOnMenu();
        offerPage.clickOnSignOut();
    }

    public void verifyCurrentPage(String currentUrl) {
        assertEquals(offerPage.getFullUrl(), currentUrl, "The current page is not offer-page");
    }
}
