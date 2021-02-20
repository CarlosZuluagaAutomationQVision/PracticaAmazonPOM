package pages.interacciones;

import net.thucydides.core.annotations.DefaultUrl;
import pages.mapeos.AmazonPaginaGeneralMapeos;

@DefaultUrl("https://www.amazon.com/")
public class AmazonPaginaGeneralInteracciones extends AmazonPaginaGeneralMapeos {

    public void escribirProductoBuscarAmazon(String nombreProducto) {
        txtBarraBusqueda.click();
        txtBarraBusqueda.sendKeys(nombreProducto);
    }

}
