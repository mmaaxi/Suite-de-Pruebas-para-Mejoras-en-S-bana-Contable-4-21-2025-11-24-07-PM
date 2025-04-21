package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_1Page {
    WebDriver driver;

    By hojaDeMejorasSelector = By.id("hoja-de-mejoras-id");
    By columnaTotalSelector = By.name("Total");
    By formulaAplicadaIndicator = By.className("formula-applied-indicator");

    public tc_1Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void abrirHojaDeMejoras() {
        driver.findElement(hojaDeMejorasSelector).click();
    }

    public boolean isHojaDeMejorasVisible() {
        return driver.findElement(hojaDeMejorasSelector).isDisplayed();
    }

    public void insertarColumnaParaCampoTotal() {
        // Lógica para insertar la columna 'Total'
        WebElement nuevaColumna = driver.findElement(columnaTotalSelector);
        nuevaColumna.sendKeys("Total");
    }

    public boolean isColumnaTotalVisible() {
        return driver.findElement(columnaTotalSelector).isDisplayed();
    }

    public boolean isColumnaNombradaCorrectamente() {
        return driver.findElement(columnaTotalSelector).getText().equals("Total");
    }

    public void aplicarFormula() {
        // Lógica para aplicar la fórmula
    }

    public boolean isFormulaAplicadaCorrectamente() {
        return driver.findElement(formulaAplicadaIndicator).isDisplayed();
    }
}