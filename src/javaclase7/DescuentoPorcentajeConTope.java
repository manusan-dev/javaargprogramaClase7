package javaclase7;


public class DescuentoPorcentajeConTope extends javaclase7.Descuento { 
    private final double tope;

    public DescuentoPorcentajeConTope(int numeroCarrito, double porcentaje, double tope) {
        super(numeroCarrito, porcentaje);
        this.tope = tope;
    }

    public double getTope() {
        return tope;
    }
}