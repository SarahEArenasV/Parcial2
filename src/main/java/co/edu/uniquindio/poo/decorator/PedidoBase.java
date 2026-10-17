package co.edu.uniquindio.poo.decorator;

import co.edu.uniquindio.poo.composite.ComponenteProducto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PedidoBase implements Pedido {

    private ComponenteProducto producto;

    @Override
    public String getDescripcion() {
        return producto.getNombre();
    }

    @Override
    public double getCosto() {
        return producto.getPrecio();
    }
}
