package clase_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Actividad_1 {

    public static void main(String[] args) {

        Producto prod[] = new Producto[10];
        ItemCarrito car[] = new ItemCarrito[1000];
        Carrito lista[] = new Carrito[1000];
        float PrecioTotal = 0;

        String ArchEntrada = "C:\\Users\\pablo\\OneDrive\\Documentos\\JAVA\\Clase 5\\clase_5\\Entrada.txt";

////////////LECTURA DE LISTA DE PRODUCTOS + ARMADO DEL LISTADO DE PRODUCTOS/////////////////////////////////////////////////////////        
        try {
            int x = 0;
            for (String lectura : Files.readAllLines(Paths.get(ArchEntrada))) {
                String Listado[] = lectura.split(";");
                prod[x] = new Producto(Integer.parseInt(Listado[0]), Listado[1], Listado[2], Float.parseFloat(Listado[3]));
                x++;
            }
        } catch (IOException ex) {
            System.out.println("\nNo se pieron leer los productos.");
        }

////////////////////Mostrar productos/////////////////////////////////////////////        
//        for (x = 0; x < 3; x++) {
//            System.out.println("Codigo: " + prod[x].getCodigoProd() + " Nombre: " 
//                    + prod[x].getNombre() + " Descripcion: " + prod[x].getDescripcion()
//                    + " Precio: " + prod[x].getPrecio());
//        }
//////////////////ARMO EL CARRITO DE COMPRAS CON LOS CODIGOS Y CANTIDAD//////////
        Scanner entrada = new Scanner(System.in);
        int e, c, x = 0, t, y;
        t = 0;

        while (x < 1000) {

            System.out.println("Ingrese codigo de nuevo item (ingrese 0 para salir):");
            e = entrada.nextInt();

            if (e == 0) {
                t = x;
                break;
            }

            System.out.println("Ingrese cantidad del item anterior:");
            c = entrada.nextInt();

            car[x] = new ItemCarrito(e, c);
            x++;
        }
////////////////////Mostrar ItemCarrito///////////////////////////////////////////////        
//        for (x = 0; x < t; x++) {
//            System.out.println("Item: " + car[x].getItem() + 
//                    " Cantidad: " + car[x].getCantidad());
//        }    

///////////Creo la lista de compras - CARRITO/////////////////////////////////
        for (x = 0; x < t; x++) {
            for (y = 0; y <= 9; y++) {
                if (car[x].getItem() == prod[y].getCodigoProd()) {
                    lista[x] = new Carrito(x + 1, prod[y].getCodigoProd(),
                            prod[y].getNombre(), prod[y].getDescripcion(),
                            car[x].getCantidad(), prod[y].getPrecio());
                    y = 11;
                }
                if (y == 9) {
                    lista[x] = new Carrito(x + 1, 00, "Producto no encontrad", "-", 00, 00);
                }
            }
        }

        ////////////////////////////Mostrar Carrito/////////////////////////////  
        System.out.println("\nCarrito de compras:");
        for (x = 0; x < t; x++) {
            System.out.println("Item: " + lista[x].getOrden() + " - Codigo: "
                    + lista[x].getID() + " - Nombre: \"" + lista[x].getNombre()
                    + "\" - Descr.: " + lista[x].getDescripcion()
                    + " - Cantidad: " + lista[x].getCantidad() + " - Precio: $"
                    + lista[x].getPrecio() + " - Fecha de carga: "
                    + lista[x].getFechaOperacion());
            PrecioTotal = PrecioTotal + lista[x].getPrecio();
        }
        System.out.println("\nPrecio total sin descuento: $" + PrecioTotal);
        
        int itemTotal = t;
        float descFijo = 10;
        Descuento desc1 = new DescuentoFijo();
        desc1.setDesc(itemTotal * descFijo );
        System.out.println("Precio con descuento fijo: $" + desc1.valorFinal(PrecioTotal));
        
        float descPor = 10;
        Descuento desc2 = new DescuentoPorcentaje();
        desc2.setDesc(descPor);
        System.out.println("Precio con descuento de " + descPor + "%:" + desc2.valorFinal(PrecioTotal));
        
        
    }
    

}
