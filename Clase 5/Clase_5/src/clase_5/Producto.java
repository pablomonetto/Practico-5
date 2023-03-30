package clase_5;

public class Producto {

    private int codigoProd;
    private String Nombre;
    private String Descripcion;
    private float Precio;
    
    public Producto(int codigoProd, String Nombre, String Descripcion, float Precio) {
        this.codigoProd = codigoProd;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(int codigoProd) {
        this.codigoProd = codigoProd;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public void MostrarProducto() {
        System.out.println(getNombre() + "\n" + getCodigoProd() + "\n" + getDescripcion() + "\n$" + getPrecio());
    }

}
