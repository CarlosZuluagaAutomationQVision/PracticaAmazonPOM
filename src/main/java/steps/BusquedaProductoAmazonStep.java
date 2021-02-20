package steps;

import exceptions.ProductoNoEncontradoResultadosBusqueda;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import pages.interacciones.AmazonPaginaGeneralInteracciones;
import pages.interacciones.AmazonResultadosBusquedaInteracciones;

public class BusquedaProductoAmazonStep {

    @Page
    AmazonPaginaGeneralInteracciones amazonPaginaGeneralInteracciones;

    @Page
    AmazonResultadosBusquedaInteracciones amazonResultadosBusquedaInteracciones;

    public void abrirPaginaAmazon() {
        amazonPaginaGeneralInteracciones.open();
    }

    @Step
    public void buscarProductoAmazon(String nombreProducto) {
        amazonPaginaGeneralInteracciones.escribirProductoBuscarAmazon(nombreProducto);
        amazonPaginaGeneralInteracciones.btnBuscar.click();
    }

    @Step
    public void seleccionarProductoComprar(String nombreProducto) {
        if (amazonResultadosBusquedaInteracciones.retornarProductoAgregarCarrito(nombreProducto).isVisible()) {
            amazonResultadosBusquedaInteracciones.retornarProductoAgregarCarrito(nombreProducto).click();
        } else throw new ProductoNoEncontradoResultadosBusqueda();
    }

}
