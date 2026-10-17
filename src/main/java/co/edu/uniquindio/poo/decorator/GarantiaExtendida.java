package co.edu.uniquindio.poo.decorator;

public class GarantiaExtendida extends ServicioExtra {

    public GarantiaExtendida(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Garantía Extendida";
    }

    @Override
    public double getCosto() {
        double anterior = super.getCosto();
        double nuevo = anterior + anterior * 0.10;
        System.out.println("   Con la Garantía Extendida (10% más) el valor sube a $" + String.format("%,.0f", nuevo));
        return nuevo;
    }
}
