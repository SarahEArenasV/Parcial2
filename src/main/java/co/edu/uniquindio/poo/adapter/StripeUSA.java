package co.edu.uniquindio.poo.adapter;

public class StripeUSA {

    public boolean chargeInDollars(double amountUSD, String customerEmail, String merchantKey) {
        System.out.println("StripeUSA cobró US$" + String.format("%,.2f", amountUSD)
                + " a la cuenta " + customerEmail + " usando la clave de comercio " + merchantKey + ".");
        return true;
    }
}
