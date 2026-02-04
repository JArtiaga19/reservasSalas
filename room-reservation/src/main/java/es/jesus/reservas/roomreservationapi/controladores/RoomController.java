package es.jesus.reservas.roomreservationapi.controladores;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.jesus.reservas.roomreservationapi.dominios.Salas;
import es.jesus.reservas.roomreservationapi.servicio.RoomService;

@RestController // Indica que esta clase es un **controlador** en la arquitectura de la aplicación
@RequestMapping("/salas") // Define la ruta base para todas las solicitudes manejadas por este controlador
public class RoomController {

    private final RoomService roomService; // Servicio que maneja la lógica de negocio relacionada con los usuarios

    public RoomController(RoomService roomService) { // Constructor: recibe el servicio y lo inyecta en el controlador
        this.roomService = roomService;
    }

    @GetMapping // Devuelve una lista con todas las salas
    public List<Salas> getAll() {   // Devuelve una lista con todos las salas almacenados
        return roomService.findAll();
    }

    @GetMapping("/{id}") // Devuelve una sala específico por su ID
    public ResponseEntity<Salas> getById(@PathVariable Long id) { // Busca una sala por su ID
        return roomService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping // Crea una nueva sala
    public Salas create(@RequestBody Salas room) { // Guarda una sala nueva o actualiza uno existente en la base de datos
        return roomService.save(room);
    }

    @DeleteMapping("/{id}") // Elimina una sala por su ID
    public ResponseEntity<Void> delete(@PathVariable Long id) { // Elimina una sala de la base de datos por su ID
        roomService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

/*
UserController es la puerta de entrada a tu API, todo lo que venga de Postman, navegador o cualquier cliente HTTP pasa por aquí.
El controlador:
    Recibe peticiones HTTP (GET, POST, DELETE…)
    Llama al servicio (UserService)
    Devuelve respuestas al cliente
    Es decir:
        El controlador habla con el exterior  
        El servicio piensa  
        El repositorio guarda en la base de datos
*/
