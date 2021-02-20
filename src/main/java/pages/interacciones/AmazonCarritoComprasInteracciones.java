package pages.interacciones;

import pages.mapeos.AmazonCarritoComprasMapeos;

public class AmazonCarritoComprasInteracciones extends AmazonCarritoComprasMapeos {

    public String retornarNombreProductoCarrito() {
        return lblNombreProducto.waitUntilVisible().getText();
    }

}
