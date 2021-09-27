package tech.credify.navigation;

import tech.credify.dataobjects.PersonalInformation;
import tech.credify.pageobjects.PersonalInformationPage;

import java.time.format.DateTimeFormatter;

public class PersonalInformationFlow {
    private static final DateTimeFormatter DEFAULT_FORMAT = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    private PersonalInformationPage personalInformationPage;

    public PersonalInformationFlow(PersonalInformationPage personalInformationPage) {
        this.personalInformationPage = personalInformationPage;
    }

    public void fillInPersonalInformationAndContinue(PersonalInformation personalInformation) {
        personalInformationPage.getContactForm().setFirstName(personalInformation.getFirstName());
        personalInformationPage.getContactForm().setLastName(personalInformation.getLastName());
        personalInformationPage.getContactForm().setAddress(personalInformation.getAddress());
        personalInformationPage.getContactForm().setCity(personalInformation.getCity());
        personalInformationPage.getContactForm().setState(personalInformation.getState());
        personalInformationPage.getContactForm().setZipCode(personalInformation.getZipCode());
        personalInformationPage.getContactForm().setDateOfBirth(personalInformation.getDateOfBirth().format(DEFAULT_FORMAT));
        personalInformationPage.clickOnContinueButton();
    }

    public void fillInIncomeInformationAndContinue(PersonalInformation personalInformation) {
        personalInformationPage.getIncomeForm().setIncome(personalInformation.getIncome());
        personalInformationPage.getIncomeForm().setAdditionalIncome(personalInformation.getAdditionalIncome());
        personalInformationPage.clickOnContinueButton();
        personalInformationPage.clickOnContinueButton();
    }

    public OfferFlow fillInEmailInformationAndCheckLoanRate(PersonalInformation personalInformation) {
        personalInformationPage.getLoginForm().setEmail(personalInformation.getEmail());
        personalInformationPage.getLoginForm().setPassword(personalInformation.getPassword());
        personalInformationPage.clickOnTermsOfUse();
        return new OfferFlow(personalInformationPage.clickOnCheckYourRateButton());
    }
}
