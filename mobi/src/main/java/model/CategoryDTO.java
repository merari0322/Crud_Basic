package model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CategoryDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_categoria;
    private String nombre_categoria;
    
    public int getId_categoria() {
        return Id_categoria;
    }
    public void setId_categoria(int id_categoria) {
        Id_categoria = id_categoria;
    }
    public String getNombre_categoria() {
        return nombre_categoria;
    }
    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }


    
}
