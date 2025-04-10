package model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrdersDTO {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_orden;
    private LocalDateTime dia_pedido;
    private String cliente;
    
    public int getId_orden() {
        return Id_orden;
    }
    public void setId_orden(int id_orden) {
        Id_orden = id_orden;
    }
    public LocalDateTime getDia_pedido() {
        return dia_pedido;
    }
    public void setDia_pedido(LocalDateTime dia_pedido) {
        this.dia_pedido = dia_pedido;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


}
