package es.jesus.reservas.roomreservationapi.dominios;

import jakarta.persistence.Entity;  //indica que esta clase es una entidad de la base de datos
import jakarta.persistence.GeneratedValue; //indica que el valor del campo se genera automáticamente
import jakarta.persistence.GenerationType; //indica la estrategia para generar el valor del campo
import jakarta.persistence.Id;      //indica el campo que es la clave primaria de la entidad

@Entity // Indica que esta clase es una entidad JPA y se guardará como tabla en la base de datos
public class Reservas {

    @Id // Marca este campo como la clave primaria (primary key) de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Hace que la base de datos genere automáticamente el valor del ID (1, 2, 3...)
    private Long id; 
    private Long roomId; 
    private Long userId; 
    private String date;
    
    public Reservas() {
    }

    public Reservas(Long id, Long roomId, Long userId, String date) {
        this.id = id;
        this.roomId = roomId;
        this.userId = userId;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    } 
}
