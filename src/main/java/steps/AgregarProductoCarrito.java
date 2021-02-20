package steps;

import exceptions.ProductoNoDisponibleParaAgregarCarrito;
import org.fluentlenium.core.annotation.Page;
import pages.interacciones.AmazonPaginaGeneralInteracciones;

public class AgregarProductoCarrito {

    @Page
    AmazonPaginaGeneralInteracciones amazonPaginaGeneralInteracciones;

    public void agregarProductoCarrito() {
        if (amazonPaginaGeneralInteracciones.btnAgregarProductoCarrito.isVisible()) {
            amazonPaginaGeneralInteracciones.btnAgregarProductoCarrito.click();
            if (amazonPaginaGeneralInteracciones.btnCerrarAlertaCompra.isVisible())
                amazonPaginaGeneralInteracciones.btnCerrarAlertaCompra.click();
        } else throw new ProductoNoDisponibleParaAgregarCarrito();
    }
}