package tech.credify.pageobjects.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginForm {
    @FindBy(name = "username")
    private WebElement emailTextBox;
    @FindBy(name = "password")
    private WebElement passwordTextBox;

    public LoginForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setEmail(String email) {
        emailTextBox.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordTextBox.sendKeys(password);
    }

}
