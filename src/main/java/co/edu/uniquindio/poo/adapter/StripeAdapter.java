package co.edu.uniquindio.poo.adapter;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StripeAdapter implements ProcesadorPago {

    private static final double TASA = 4000;
    private static final String CLAVE_COMERCIO = "SHOPMASTER-KEY-2026";

    private final StripeUSA stripe = new StripeUSA();

    @Override
    public boolean cobrarEnPesos(String usuario, double montoCOP) {
        System.out.println("Conectando con la pasarela de pagos de Estados Unidos");
        double montoUSD = montoCOP / TASA;
        String email = usuario + "@shopmaster.com";
        System.out.println("   Los $" + String.format("%,.0f", montoCOP) + " COP equivalen a US$"
                + String.format("%,.2f", montoUSD) + " (1 USD = 4.000 COP).");
        return stripe.chargeInDollars(montoUSD, email, CLAVE_COMERCIO);
    }
}
