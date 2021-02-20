package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import steps.AgregarProductoCarrito;
import steps.BusquedaProductoAmazonStep;
import steps.CarritoComprasAmazonStep;

import static utils.VariablesSesionEnum.NOMBRE_PRODUCTO;

public class AgregarProductoCarritoAmazonDefinition {

    @Steps
    BusquedaProductoAmazonStep busquedaProductoAmazonStep;

    @Steps
    AgregarProductoCarrito agregarProductoCarrito;

    @Steps
    CarritoComprasAmazonStep carritoComprasAmazonStep;

    @Dado("que deseo comprar el producto {string} desde Amazon")
    public void buscarProductoAmazon(String nombreProducto) {
        busquedaProductoAmazonStep.abrirPaginaAmazon();
        busquedaProductoAmazonStep.buscarProductoAmazon(nombreProducto);
        Serenity.setSessionVariable(NOMBRE_PRODUCTO.getValor()).to(nombreProducto);
    }

    @Cuando("seleccione el producto apropiado en los resultados de la búsqueda")
    public void encontrarProductoResultadosBusqueda() {
        busquedaProductoAmazonStep.seleccionarProductoComprar(Serenity.sessionVariableCalled(NOMBRE_PRODUCTO.getValor()));
    }

    @Cuando("lo agregue al carrito de compras")
    public void agregarProductoCarrito() {
        agregarProductoCarrito.agregarProductoCarrito();
    }

    @Entonces("observo que el producto en el carrito de compras corresponde al producto seleccionado")
    public void verificarProductoCarrito() {
        carritoComprasAmazonStep.accederCarritoCompras();
        carritoComprasAmazonStep.verificarNombreProductoCarritoCompras();
    }
}
