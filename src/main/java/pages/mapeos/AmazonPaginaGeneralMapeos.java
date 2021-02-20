package pages.mapeos;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class AmazonPaginaGeneralMapeos extends PageObject {

    @FindBy(id = "twotabsearchtextbox")
    public WebElementFacade txtBarraBusqueda;

    @FindBy(id = "nav-search-submit-button")
    public WebElementFacade btnBuscar;

    @FindBy(id = "add-to-cart-button")
    public WebElementFacade btnAgregarProductoCarrito;

    @FindBy(id = "nav-cart-count")
    public WebElementFacade btnCarritoCompras;

    @FindBy(id = "attach-close_sideSheet-link")
    public WebElementFacade btnCerrarAlertaCompra;

}
