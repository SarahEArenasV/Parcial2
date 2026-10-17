package co.edu.uniquindio.poo.decorator;

public class EmpaqueRegalo extends ServicioExtra {

    public EmpaqueRegalo(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Empaque de Regalo";
    }

    @Override
    public double getCosto() {
        double anterior = super.getCosto();
        double nuevo = anterior + 15000;
        System.out.println("   Con el Empaque de Regalo ($15.000 más) el valor sube a $" + String.format("%,.0f", nuevo));
        return nuevo;
    }
}
