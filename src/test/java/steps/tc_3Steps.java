package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_3Page;

public class tc_3Steps {
    WebDriver driver = new ChromeDriver();
    tc_3Page sabanaPage = new tc_3Page(driver);

    @Given("El usuario está en la sabana de facturación")
    public void el_usuario_esta_en_la_sabana_de_facturacion() {
        sabanaPage.navigateToSabana();
    }

    @When("Verifica la existencia del campo 'Descuento'")
    public void verifica_la_existencia_del_campo_descuento() {
        Assert.assertTrue(sabanaPage.isDescuentoFieldPresent());
    }

    @Then("El campo 'Descuento' está presente en la sabana")
    public void el_campo_descuento_esta_presente_en_la_sabana() {
        // Assertion included in the previous step.
    }

    @When("Inserta valores en el campo 'Descuento'")
    public void inserta_valores_en_el_campo_descuento() {
        sabanaPage.enterDescuentoValue("15%");
    }

    @Then("Los valores del 'Descuento' se insertan correctamente")
    public void los_valores_del_descuento_se_insertan_correctamente() {
        Assert.assertTrue(sabanaPage.isDescuentoValueInsertedCorrectly());
    }

    @When("El usuario revisa el resumen de facturación")
    public void el_usuario_revisa_el_resumen_de_facturacion() {
        // Action already performed in the enterDescuentoValue method.
    }

    @Then("El resumen incluye el 'Descuento' aplicado")
    public void el_resumen_incluye_el_descuento_aplicado() {
        Assert.assertTrue(sabanaPage.isDescuentoIncludedInSummary());
    }
}