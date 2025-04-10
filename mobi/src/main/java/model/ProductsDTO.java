package model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_producto;
    private String nombreProducto;
    private double precio;
    
    public int getId_producto() {
        return Id_producto;
    }
    public void setId_producto(int id_producto) {
        Id_producto = id_producto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

}
