package co.edu.uniquindio.poo.proxy;

import co.edu.uniquindio.poo.adapter.ProcesadorPago;
import co.edu.uniquindio.poo.adapter.StripeAdapter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProxySeguridad implements ProcesadorPago {

    private ProcesadorPago procesadorReal;
    private final ValidadorSeguridad validador = new ValidadorSeguridad();
    private final RegistroAuditoria auditoria = new RegistroAuditoria();

    @Override
    public boolean cobrarEnPesos(String usuario, double montoCOP) {
        System.out.println("   Verificando la transacción de " + usuario + "...");

        if (!validador.esValida(usuario, montoCOP)) {
            return false;
        }

        if (procesadorReal == null) {
            procesadorReal = new StripeAdapter();
        }
        boolean aprobado = procesadorReal.cobrarEnPesos(usuario, montoCOP);

        if (aprobado) {
            auditoria.registrarAprobacion(usuario, montoCOP);
        }
        return aprobado;
    }
}
