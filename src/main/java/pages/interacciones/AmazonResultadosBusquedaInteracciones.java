package pages.interacciones;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AmazonResultadosBusquedaInteracciones extends PageObject {

    public WebElementFacade retornarProductoAgregarCarrito(String nombreProducto) {
        return $("//span[@class='a-size-base-plus a-color-base a-text-normal' and contains(text(), '" + nombreProducto + "')]");
    }

}
