package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_3Page {
    WebDriver driver;

    By descuentoField = By.id("descuento");
    By resumenSection = By.id("resumen");

    public tc_3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSabana() {
        driver.get("https://example.com/sabana");
    }

    public boolean isDescuentoFieldPresent() {
        return driver.findElement(descuentoField).isDisplayed();
    }

    public void enterDescuentoValue(String value) {
        WebElement field = driver.findElement(descuentoField);
        field.clear();
        field.sendKeys(value);
    }

    public boolean isDescuentoValueInsertedCorrectly() {
        WebElement field = driver.findElement(descuentoField);
        return field.getAttribute("value").equals("15%");
    }

    public boolean isDescuentoIncludedInSummary() {
        WebElement resumen = driver.findElement(resumenSection);
        return resumen.getText().contains("Descuento");
    }
}