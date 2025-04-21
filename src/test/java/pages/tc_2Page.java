package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_2Page {

    WebDriver driver;

    public tc_2Page(WebDriver driver) {
        this.driver = driver;
    }

    private By columnSelector = By.id("column-selector");
    private By formulaInput = By.id("formula-input");
    private By saveButton = By.id("save-button");
    private By successMessage = By.id("success-message");

    public void openSpreadsheet() {
        driver.get("http://spreadsheet-url.com");
    }

    public void selectColumn() {
        WebElement column = driver.findElement(columnSelector);
        column.click();
    }

    public void verifyColumnSelected() {
        // Verify column is highlighted or has been focused.
    }

    public void modifyFormula() {
        WebElement formulaField = driver.findElement(formulaInput);
        formulaField.clear();
        formulaField.sendKeys("=NEWFORMULA()");
    }

    public void verifyFormulaUpdated() {
        // Verify that the totals are updated with new formula.
    }

    public void saveSpreadsheet() {
        WebElement save = driver.findElement(saveButton);
        save.click();
    }

    public void verifySaveWithoutErrors() {
        WebElement success = driver.findElement(successMessage);
        if (!success.isDisplayed()) {
            throw new AssertionError("Save operation failed");
        }
    }
}