package javaclase7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarritoNuevo {

    public static void main(String[] args) throws IOException {
        File archivo = new File("C:\\Users\\Manuel\\Documents\\NetBeansProjects\\JavaClase7\\src\\javaclase7\\carrito.txt");
        
        
          List<ItemCarrito> items = new ArrayList<>();
            int numeroCarrito = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(" ");
                int cantidad = Integer.parseInt(datos[0]);
                int precioUnitario = Integer.parseInt(datos[1]);
                String nombreProducto = datos[2];
                Producto producto = new Producto(nombreProducto, precioUnitario);
                ItemCarrito item = new ItemCarrito(producto, cantidad);
                items.add(item);
            }
        } catch (IOException e) {
            System.out.println("error");
        }

        Carrito carrito = new Carrito(numeroCarrito, items, 0.5); // elegir la cantidad de descuento
                                                                         // del 0 al 1 (0.1, 0.2) para elegir DESCUENTO PORCENTAJE (10%, 20%, etc)
                                                                         // o ingresar monto fijo para DESCUENTO FIJO (a partir de $2)
        double precioTotal = carrito.getDescuento();
        System.out.println("El precio total del carrito " + carrito.getNumeroCarrito() + " es: " + precioTotal);
    }
}
