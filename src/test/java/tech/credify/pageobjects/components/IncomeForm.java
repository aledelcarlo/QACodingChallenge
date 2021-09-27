package tech.credify.pageobjects.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncomeForm {
    @FindBy(name = "borrowerIncome")
    private WebElement incomeTextBox;
    @FindBy(name = "borrowerAdditionalIncome")
    private WebElement additionalIncomeTextBox;

    public IncomeForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setIncome(String income) {
        incomeTextBox.sendKeys(income);
    }

    public void setAdditionalIncome(String additionalIncome) {
        additionalIncomeTextBox.sendKeys(additionalIncome);
    }
}
