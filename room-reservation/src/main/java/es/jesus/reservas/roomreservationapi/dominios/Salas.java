package es.jesus.reservas.roomreservationapi.dominios;

import jakarta.persistence.Entity;  //indica que esta clase es una entidad de la base de datos
import jakarta.persistence.GeneratedValue; //indica que el valor del campo se genera automáticamente
import jakarta.persistence.GenerationType; //indica la estrategia para generar el valor del campo
import jakarta.persistence.Id;      //indica el campo que es la clave primaria de la entidad

@Entity // Indica que esta clase es una entidad JPA y se guardará como tabla en la base de datos
public class Salas {

    @Id // Marca este campo como la clave primaria (primary key) de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Hace que la base de datos genere automáticamente el valor del ID (1, 2, 3...)
    private Long id; 
    private String name; 
    private Integer capacity;
    
    public Salas() {
    }

    public Salas(Long id, String name, Integer capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
