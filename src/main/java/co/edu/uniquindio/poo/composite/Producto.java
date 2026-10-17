package co.edu.uniquindio.poo.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Producto implements ComponenteProducto {

    private String nombre;
    private double precio;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void mostrar(String espacio) {
        System.out.println(espacio + nombre + ": $" + String.format("%,.0f", precio));
    }
}
