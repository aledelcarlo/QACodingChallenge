package tech.credify.pageobjects.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactForm {
    @FindBy(name = "borrowerFirstName")
    private WebElement firstNameTextBox;
    @FindBy(name = "borrowerLastName")
    private WebElement lastNameTextBox;
    @FindBy(name = "borrowerStreet")
    private WebElement addressTextBox;
    @FindBy(name = "borrowerCity")
    private WebElement cityTextBox;
    @FindBy(name = "borrowerState")
    private WebElement stateTextBox;
    @FindBy(name = "borrowerZipCode")
    private WebElement zipCodeTextBox;
    @FindBy(name = "borrowerDateOfBirth")
    private WebElement dateOfBirthTextBox;

    public ContactForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String firstName) {
        firstNameTextBox.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastNameTextBox.sendKeys(lastName);
    }

    public void setAddress(String address) {
        addressTextBox.sendKeys(address + Keys.ENTER);
    }

    public void setCity(String city) {
        cityTextBox.sendKeys(city);
    }

    public void setState(String state) {
        stateTextBox.sendKeys(state);
    }

    public void setZipCode(String zipCode) {
        zipCodeTextBox.sendKeys(zipCode);
    }

    public void setDateOfBirth(String dateOfBirth) {
        dateOfBirthTextBox.sendKeys(dateOfBirth);
    }
}
