package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.composite.Combo;
import co.edu.uniquindio.poo.composite.Producto;
import co.edu.uniquindio.poo.decorator.TipoExtra;
import co.edu.uniquindio.poo.facade.CheckoutFacade;

public class Main {

    public static void main(String[] args) {
        CheckoutFacade checkout = new CheckoutFacade();

        System.out.println("Caso de prueba 1: compra exitosa completa");
        Combo kitLimpieza = new Combo("Kit de Limpieza");
        kitLimpieza.agregar(new Producto("Limpiador de pantalla", 25000));
        kitLimpieza.agregar(new Producto("Paño de microfibra", 15000));

        Combo comboGamer = new Combo("Combo Setup Gamer");
        comboGamer.agregar(new Producto("Monitor", 800000));
        comboGamer.agregar(new Producto("Teclado", 200000));
        comboGamer.agregar(kitLimpieza);

        checkout.ejecutarCompraRapida("cliente_vip", comboGamer, TipoExtra.GARANTIA_EXTENDIDA, TipoExtra.EMPAQUE_REGALO);

        System.out.println();
        System.out.println("Caso de prueba 2: rechazo por tope de dinero");
        Producto servidor = new Producto("Servidor Empresarial", 6000000);
        checkout.ejecutarCompraRapida("cliente_normal", servidor, TipoExtra.MANEJO_FRAGIL);

        System.out.println();
        System.out.println("Caso de prueba 3: rechazo por usuario reportado");
        Producto mouse = new Producto("Mouse", 150000);
        checkout.ejecutarCompraRapida("BLOQUEADO", mouse);
    }
}
