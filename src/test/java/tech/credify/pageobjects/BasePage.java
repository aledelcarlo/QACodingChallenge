package tech.credify.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static tech.credify.TestBundle.getProperty;

public abstract class BasePage {
    private static final int DEFAULT_TIME_OUT = 30;
    private static final String SITE_URL = getProperty("site.url");

    protected final WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected abstract String getResourcePageUri();

    public String getFullUrl() {
        return SITE_URL + getResourcePageUri();
    }

    public void go() {
        driver.get(getFullUrl());
    }

    public void waitUntilAttributeIs(WebElement element, String attribute, String value) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIME_OUT);
        wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
    }
}
