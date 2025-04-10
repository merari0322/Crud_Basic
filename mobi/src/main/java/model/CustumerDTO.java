package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustumerDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_cliente;
    private String nombre;
    private String apellido;
    private String celular;
    
    public int getId_cliente() {
        return Id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        Id_cliente = id_cliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    

}
 

 