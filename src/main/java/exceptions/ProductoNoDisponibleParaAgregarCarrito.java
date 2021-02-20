package exceptions;

public class ProductoNoDisponibleParaAgregarCarrito extends RuntimeException{

    public ProductoNoDisponibleParaAgregarCarrito(){
        super("El producto seleccionado no esta en stock, por lo tanto no se puede agregar al carrito");
    }

}
