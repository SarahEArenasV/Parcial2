package co.edu.uniquindio.poo.proxy;

public class RegistroAuditoria {

    public void registrarAprobacion(String usuario, double montoCOP) {
        System.out.println("   [AUDITORÍA: Transacción aprobada para " + usuario
                + " por $" + String.format("%,.0f", montoCOP) + " COP]");
    }
}
