package es.jesus.reservas.roomreservationapi.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import es.jesus.reservas.roomreservationapi.dominios.Usuarios;
import es.jesus.reservas.roomreservationapi.repositorio.UserRepository;

@Service // Indica que esta clase es un **servicio** en la arquitectura de la aplicación
public class UserService {

    private final UserRepository userRepository; // Repositorio que se encarga de acceder a la base de datos de usuarios

    public UserService(UserRepository userRepository) { // Constructor: recibe el repositorio y lo inyecta en el servicio
        this.userRepository = userRepository;
    }

    public List<Usuarios> findAll() { // Devuelve una lista con todos los usuarios almacenados
        return userRepository.findAll();
    }

    public Optional<Usuarios> findById(Long id) { // Busca un usuario por su ID y lo devuelve envuelto en un Optional
        return userRepository.findById(id);
    }

    public Usuarios save(Usuarios user) { // Guarda un usuario nuevo o actualiza uno existente en la base de datos
        return userRepository.save(user);
    }

    public void delete(Long id) { // Elimina un usuario de la base de datos por su ID
        userRepository.deleteById(id);
    }
}

/*
 * El Service es el “cerebro” del programa.
 * Aquí es donde el sistema piensa.
 * Aquí decides qué se puede hacer y qué no.
 * Aquí pones reglas, validaciones, comprobaciones.
 * 
 * Ejemplos reales:
 * “No dejar crear una sala con capacidad negativa.”
 * “No dejar reservar una sala que ya está ocupada.”
 * “Comprobar que el usuario existe antes de reservar.”
 * Todo eso no va en el controlador y no va en la base de datos.
 * Va en el Service, porque es la capa que toma decisiones.
 */

/*
 * El Repository es el “mensajero” que habla con la base de datos.
 * No piensa.
 * No decide nada.
 * Solo guarda, busca, borra o actualiza datos.
 * 
 * Ejemplos:
 * findAll() → trae todos los registros
 * save() → guarda un registro
 * deleteById() → borra un registro
 * 
 * El Repository es como un cajero automático:
 * solo te da o guarda dinero, pero no decide nada por ti.
 */
