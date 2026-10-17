package co.edu.uniquindio.poo.composite;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Combo implements ComponenteProducto {

    private final String nombre;
    private final List<ComponenteProducto> hijos = new ArrayList<>();

    public void agregar(ComponenteProducto componente) {
        hijos.add(componente);
    }

    public void eliminar(ComponenteProducto componente) {
        hijos.remove(componente);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (ComponenteProducto hijo : hijos) {
            total += hijo.getPrecio();
        }
        return total;
    }

    @Override
    public void mostrar(String espacio) {
        System.out.println(espacio + nombre + ", que contiene (subtotal $" + String.format("%,.0f", getPrecio()) + "):");
        for (ComponenteProducto hijo : hijos) {
            hijo.mostrar(espacio + "    ");
        }
    }
}
