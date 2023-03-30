package clase_5;

import java.time.LocalDate;

public class Carrito {
    
    private int orden;
    private int ID;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private float precio;
    private LocalDate FechaOperacion;
    
    public Carrito (int orden, int ID, String nombre , String descripcion , int cantidad , float precio ){
    this.orden = orden;
    this.ID = ID;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.cantidad = cantidad;
    this.precio = precio * cantidad;
    FechaOperacion = LocalDate.now();
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getFechaOperacion() {
        return FechaOperacion;
    }

    public void setFechaOperacion(LocalDate FechaOperacion) {
        this.FechaOperacion = FechaOperacion;
    }
    
    
    
  
    
}
