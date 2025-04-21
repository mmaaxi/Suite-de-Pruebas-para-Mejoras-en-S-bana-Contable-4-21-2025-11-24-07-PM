package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_1Page;

public class tc_1Steps {
    tc_1Page page = new tc_1Page();

    @Given("el usuario abre la sabana contable y selecciona la hoja de mejoras")
    public void abrirSabanaContableYSeleccionarHojaDeMejoras() {
        page.abrirHojaDeMejoras();
        Assert.assertTrue(page.isHojaDeMejorasVisible());
    }

    @When("el usuario inserta una columna nueva para el campo 'Total'")
    public void insertarColumnaNuevaParaCampoTotal() {
        page.insertarColumnaParaCampoTotal();
        Assert.assertTrue(page.isColumnaTotalVisible());
    }

    @Then("la columna es insertada con el nombre 'Total'")
    public void verificarColumnaInsertadaConNombreTotal() {
        Assert.assertTrue(page.isColumnaNombradaCorrectamente());
    }

    @When("el usuario aplica la fórmula adecuada")
    public void aplicarFormulaAdecuada() {
        page.aplicarFormula();
        Assert.assertTrue(page.isFormulaAplicadaCorrectamente());
    }

    @Then("la fórmula es aplicada correctamente")
    public void verificarFormulaAplicadaCorrectamente() {
        Assert.assertTrue(page.isFormulaAplicadaCorrectamente());
    }
}