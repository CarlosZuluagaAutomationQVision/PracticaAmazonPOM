package pages.mapeos;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class AmazonCarritoComprasMapeos extends PageObject {

    @FindBy(xpath = "//span[@class='a-size-medium sc-product-title a-text-bold']")
    public WebElementFacade lblNombreProducto;

}
