package clase_5;

public class ItemCarrito {

    private int cantidad;
    private int item;

    public ItemCarrito(int item, int cantidad) {
        this.item = item;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public void MostrarCarrito() {
        System.out.println( "Codigo de producto: " + getItem() + " - Cantidad: : " + getCantidad());
    }
}