package co.edu.uniquindio.poo.facade;

import co.edu.uniquindio.poo.composite.ComponenteProducto;
import co.edu.uniquindio.poo.decorator.Pedido;
import co.edu.uniquindio.poo.decorator.TipoExtra;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CheckoutFacade {

    private final GestorProductos gestorProductos = new GestorProductos();
    private final GestorExtras gestorExtras = new GestorExtras();
    private final GestorPagos gestorPagos = new GestorPagos();

    public boolean ejecutarCompraRapida(String usuario, ComponenteProducto productos, TipoExtra... extras) {
        gestorProductos.mostrarArbol(usuario, productos);

        Pedido pedido = gestorExtras.armarPedido(productos, extras);
        double total = gestorExtras.calcularTotal(productos, pedido);

        boolean resultado = gestorPagos.pagar(usuario, total);
        if (resultado) {
            System.out.println("La compra se realizó con éxito.");
        } else {
            System.out.println("La compra fue rechazada.");
        }
        return resultado;
    }
}
