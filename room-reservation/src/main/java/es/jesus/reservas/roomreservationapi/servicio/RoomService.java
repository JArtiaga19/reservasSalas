package es.jesus.reservas.roomreservationapi.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import es.jesus.reservas.roomreservationapi.dominios.Salas;
import es.jesus.reservas.roomreservationapi.repositorio.RoomRepository;

public class RoomService {

    private final RoomRepository roomRepository; // Repositorio que se encarga de acceder a la base de datos de Reservas

    public RoomService(RoomRepository roomRepository) { // Constructor: recibe el repositorio y lo inyecta en el servicio
        this.roomRepository = roomRepository;
    }

    public List<Salas> findAll() { // Devuelve una lista con todas las reservas almacenadas
        return roomRepository.findAll();
    }

    public Salas save(Salas room) { // Guarda una reserva nueva o actualiza uno existente en la base de datos
        return roomRepository.save(room);
    }
}

/*
    El Service es el “cerebro” del programa.
    Aquí es donde el sistema piensa.
    Aquí decides qué se puede hacer y qué no.
    Aquí pones reglas, validaciones, comprobaciones.

    Ejemplos reales:
    “No dejar crear una sala con capacidad negativa.”
    “No dejar reservar una sala que ya está ocupada.”
    “Comprobar que el usuario existe antes de reservar.”
    Todo eso no va en el controlador y no va en la base de datos.
    Va en el Service, porque es la capa que toma decisiones.
*/

/*
    El Repository es el “mensajero” que habla con la base de datos.
    No piensa.
    No decide nada.
    Solo guarda, busca, borra o actualiza datos.

    Ejemplos:
    findAll() → trae todos los registros
    save() → guarda un registro
    deleteById() → borra un registro

    El Repository es como un cajero automático:
    solo te da o guarda dinero, pero no decide nada por ti.
*/
