package javaclase7;

public class DescuentoPorCantidad extends javaclase7.Descuento {
    private int cantidadMinima;

    public DescuentoPorCantidad(int numeroCarrito, double porcentaje, int cantidadMinima) {
        super(numeroCarrito, porcentaje);
        this.cantidadMinima = cantidadMinima;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }
}