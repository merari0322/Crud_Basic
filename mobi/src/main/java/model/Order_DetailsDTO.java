package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="OrderDetails")
public class Order_DetailsDTO {
     @Id 
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="order_details_id",length = 10)
     private int Id_orden_detalle;
     private int Id_producto;
     private int cantidad;
     private String direccion;
     private int numero_celular;
     private String ciudad;
     private String barrio;
     private int numero_auxiliar;
     private double precio_total_pedido;
     
    public int getId_orden_detalle() {
        return Id_orden_detalle;
    }
    public void setId_orden_detalle(int id_orden_detalle) {
        Id_orden_detalle = id_orden_detalle;
    }
    public int getId_producto() {
        return Id_producto;
    }
    public void setId_producto(int id_producto) {
        Id_producto = id_producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getNumero_celular() {
        return numero_celular;
    }
    public void setNumero_celular(int numero_celular) {
        this.numero_celular = numero_celular;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getBarrio() {
        return barrio;
    }
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    public int getNumero_auxiliar() {
        return numero_auxiliar;
    }
    public void setNumero_auxiliar(int numero_auxiliar) {
        this.numero_auxiliar = numero_auxiliar;
    }
    public double getPrecio_total_pedido() {
        return precio_total_pedido;
    }
    public void setPrecio_total_pedido(double precio_total_pedido) {
        this.precio_total_pedido = precio_total_pedido;
    }
    
     

}
