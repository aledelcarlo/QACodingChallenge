package tech.credify.navigation;

import org.openqa.selenium.WebDriver;
import tech.credify.dataobjects.PersonalInformation;
import tech.credify.pageobjects.LoginPage;

public class LoginFlow {
    private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    public OfferFlow signInWithCredentials(PersonalInformation personalInformation) {
        loginPage.go();
        loginPage.getLoginForm().setEmail(personalInformation.getEmail());
        loginPage.getLoginForm().setPassword(personalInformation.getPassword());
        return new OfferFlow(loginPage.clickOnSignInButton());
    }
}
