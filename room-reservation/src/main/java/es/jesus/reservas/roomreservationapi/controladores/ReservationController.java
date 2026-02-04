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

import es.jesus.reservas.roomreservationapi.dominios.Reservas;
import es.jesus.reservas.roomreservationapi.servicio.ReservationService;

@RestController // Indica que esta clase es un **controlador** en la arquitectura de la aplicación
@RequestMapping("/reservas") // Define la ruta base para todas las solicitudes manejadas por este controlador
public class ReservationController {

    private final ReservationService reservationService; // Servicio que maneja la lógica de negocio relacionada con las reservas

    public ReservationController(ReservationService reservationService) { // Constructor: recibe el servicio y lo inyecta en el controlador
        this.reservationService = reservationService;
    }

    @GetMapping // Devuelve una reserva con todos los usuarios
    public List<Reservas> getAll() {   // Devuelve una lista con todas reservas almacenadas
        return reservationService.findAll();
    }

    @GetMapping("/{id}") // Devuelve una reserva específica por su ID
    public ResponseEntity<Reservas> getById(@PathVariable Long id) { // Busca una reserva por su ID
        return reservationService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping // Crea una nueva reserva
    public Reservas create(@RequestBody Reservas reserva) { // Guarda una reserva nueva o actualiza uno existente en la base de datos
        return reservationService.save(reserva);
    }

    @DeleteMapping("/{id}") // Elimina una reserva por su ID
    public ResponseEntity<Void> delete(@PathVariable Long id) { // Elimina una reserva de la base de datos por su ID
        reservationService.delete(id);
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