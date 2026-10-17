package co.edu.uniquindio.poo.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ServicioExtra implements Pedido {

    protected Pedido pedido;

    @Override
    public String getDescripcion() {
        return pedido.getDescripcion();
    }

    @Override
    public double getCosto() {
        return pedido.getCosto();
    }
}
