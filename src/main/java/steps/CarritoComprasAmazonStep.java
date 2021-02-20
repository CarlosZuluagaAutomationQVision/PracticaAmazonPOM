package steps;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import pages.interacciones.AmazonCarritoComprasInteracciones;
import pages.interacciones.AmazonPaginaGeneralInteracciones;

import static utils.VariablesSesionEnum.NOMBRE_PRODUCTO;

public class CarritoComprasAmazonStep {

    @Page
    AmazonPaginaGeneralInteracciones amazonPaginaGeneralInteracciones;

    @Page
    AmazonCarritoComprasInteracciones amazonCarritoComprasInteracciones;

    @Step
    public void accederCarritoCompras() {
        amazonPaginaGeneralInteracciones.btnCarritoCompras.waitUntilClickable().click();
    }

    @Step
    public void verificarNombreProductoCarritoCompras() {
        MatcherAssert.assertThat("El nombre del producto buscado no coincide con el seleccionado para comprar",
                amazonCarritoComprasInteracciones.retornarNombreProductoCarrito()
                        .contains(Serenity.sessionVariableCalled(NOMBRE_PRODUCTO.getValor())));
    }
}
