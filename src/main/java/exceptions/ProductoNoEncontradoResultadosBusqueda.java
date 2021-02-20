package exceptions;

public class ProductoNoEncontradoResultadosBusqueda extends RuntimeException{

    public ProductoNoEncontradoResultadosBusqueda(){
        super("El producto buscado no aparece en la lista de resultados, intente ser mas específico en la busqueda");
    }

}
