package co.edu.uniquindio.poo.decorator;

public class ManejoFragil extends ServicioExtra {

    public ManejoFragil(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Manejo Frágil";
    }

    @Override
    public double getCosto() {
        double anterior = super.getCosto();
        double nuevo = anterior + 25000;
        System.out.println("   Con el Manejo Prioritario Frágil ($25.000 más) el valor sube a $" + String.format("%,.0f", nuevo));
        return nuevo;
    }
}
