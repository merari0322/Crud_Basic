package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product_CategoryDTO {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_producto_categoria;
    private String accesorios;
    private String ceramicas;
    
    public int getId_producto_categoria() {
        return Id_producto_categoria;
    }
    public void setId_producto_categoria(int id_producto_categoria) {
        Id_producto_categoria = id_producto_categoria;
    }
    public String getAccesorios() {
        return accesorios;
    }
    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }
    public String getCeramicas() {
        return ceramicas;
    }
    public void setCeramicas(String ceramicas) {
        this.ceramicas = ceramicas;
    }
    

    
}
