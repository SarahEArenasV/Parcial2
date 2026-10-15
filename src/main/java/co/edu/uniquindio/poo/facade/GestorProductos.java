package co.edu.uniquindio.poo.facade;

import co.edu.uniquindio.poo.composite.ComponenteProducto;

public class GestorProductos {

    public void mostrarArbol(String usuario, ComponenteProducto productos) {
        System.out.println("Cliente: " + usuario);
        System.out.println("Productos del pedido:");
        productos.mostrar("   ");
    }
}
