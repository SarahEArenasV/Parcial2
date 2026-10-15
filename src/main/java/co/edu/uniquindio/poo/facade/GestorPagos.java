package co.edu.uniquindio.poo.facade;

import co.edu.uniquindio.poo.adapter.ProcesadorPago;
import lombok.NoArgsConstructor;
import co.edu.uniquindio.poo.proxy.ProxySeguridad;

@NoArgsConstructor
public class GestorPagos {

    private final ProcesadorPago procesador = new ProxySeguridad();

    public boolean pagar(String usuario, double total) {
        System.out.println("Pago:");
        return procesador.cobrarEnPesos(usuario, total);
    }
}
