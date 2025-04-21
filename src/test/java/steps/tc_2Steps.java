package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_2Page;

public class tc_2Steps {

    WebDriver driver;
    tc_2Page page;

    @Given("El usuario ha abierto una hoja de cálculo existente")
    public void elUsuarioHaAbiertoUnaHojaDeCalculoExistente() {
        page = new tc_2Page(driver);
        page.openSpreadsheet();
    }

    @When("El usuario selecciona una columna existente en la sabana")
    public void elUsuarioSeleccionaUnaColumnaExistenteEnLaSabana() {
        page.selectColumn();
    }

    @Then("La columna se selecciona")
    public void laColumnaSeSelecciona() {
        page.verifyColumnSelected();
    }

    @When("El usuario modifica la formula a la requerida por la mejora")
    public void elUsuarioModificaLaFormulaALaRequeridaPorLaMejora() {
        page.modifyFormula();
    }

    @Then("La formula se actualiza y se refleja en los totales")
    public void laFormulaSeActualizaYSeReflejaEnLosTotales() {
        page.verifyFormulaUpdated();
    }

    @When("El usuario guarda la hoja")
    public void elUsuarioGuardaLaHoja() {
        page.saveSpreadsheet();
    }

    @Then("La hoja se guarda sin errores")
    public void laHojaSeGuardaSinErrores() {
        page.verifySaveWithoutErrors();
    }
}