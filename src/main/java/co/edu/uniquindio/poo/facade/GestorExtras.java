package co.edu.uniquindio.poo.facade;

import co.edu.uniquindio.poo.composite.ComponenteProducto;
import co.edu.uniquindio.poo.decorator.EmpaqueRegalo;
import co.edu.uniquindio.poo.decorator.GarantiaExtendida;
import co.edu.uniquindio.poo.decorator.ManejoFragil;
import co.edu.uniquindio.poo.decorator.Pedido;
import co.edu.uniquindio.poo.decorator.PedidoBase;
import co.edu.uniquindio.poo.decorator.TipoExtra;

public class GestorExtras {

    public Pedido armarPedido(ComponenteProducto productos, TipoExtra... extras) {
        Pedido pedido = new PedidoBase(productos);
        for (TipoExtra extra : extras) {
            switch (extra) {
                case GARANTIA_EXTENDIDA:
                    pedido = new GarantiaExtendida(pedido);
                    break;
                case EMPAQUE_REGALO:
                    pedido = new EmpaqueRegalo(pedido);
                    break;
                case MANEJO_FRAGIL:
                    pedido = new ManejoFragil(pedido);
                    break;
            }
        }
        return pedido;
    }

    public double calcularTotal(ComponenteProducto productos, Pedido pedido) {
        System.out.println("Cálculo del total:");
        System.out.println("   El valor de los productos es $" + String.format("%,.0f", productos.getPrecio()));
        double total = pedido.getCosto();
        System.out.println("   Pedido: " + pedido.getDescripcion());
        System.out.println("   Total a pagar: $" + String.format("%,.0f", total));
        return total;
    }
}
