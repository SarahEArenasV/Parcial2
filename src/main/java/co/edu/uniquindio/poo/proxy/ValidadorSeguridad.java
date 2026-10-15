package co.edu.uniquindio.poo.proxy;

public class ValidadorSeguridad {

    private static final double TOPE = 5000000;
    private static final String USUARIO_BLOQUEADO = "BLOQUEADO";

    public boolean esValida(String usuario, double montoCOP) {
        if (usuario.equals(USUARIO_BLOQUEADO)) {
            System.out.println("   Alerta: el usuario está reportado como BLOQUEADO, así que no se permite el cobro.");
            return false;
        }

        if (montoCOP > TOPE) {
            System.out.println("   Alerta: el total de $" + String.format("%,.0f", montoCOP)
                    + " supera el límite permitido de $5.000.000, así que no se permite el cobro.");
            return false;
        }

        return true;
    }
}
