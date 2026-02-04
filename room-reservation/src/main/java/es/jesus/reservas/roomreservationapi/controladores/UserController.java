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

import es.jesus.reservas.roomreservationapi.dominios.Usuarios;
import es.jesus.reservas.roomreservationapi.servicio.UserService;

@RestController // Indica que esta clase es un **controlador** en la arquitectura de la aplicación
@RequestMapping("/usuarios") // Define la ruta base para todas las solicitudes manejadas por este controlador
public class UserController { // Controlador que maneja las solicitudes HTTP relacionadas con los usuarios

    private final UserService userService; // Servicio que maneja la lógica de negocio relacionada con los usuarios

    public UserController(UserService userService) { // Constructor: recibe el servicio y lo inyecta en el controlador
        this.userService = userService;
    }

    @GetMapping // Devuelve una lista con todos los usuarios
    public List<Usuarios> getAll() {   // Devuelve una lista con todos los usuarios almacenados
        return userService.findAll();
    }

    @GetMapping("/{id}") // Devuelve un usuario específico por su ID
    public ResponseEntity<Usuarios> getById(@PathVariable Long id) { // Busca un usuario por su ID
        return userService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping // Crea un nuevo usuario
    public Usuarios create(@RequestBody Usuarios user) { // Guarda un usuario nuevo o actualiza uno existente en la base de datos
        return userService.save(user);
    }

    @DeleteMapping("/{id}") // Elimina un usuario por su ID
    public ResponseEntity<Void> delete(@PathVariable Long id) { // Elimina un usuario de la base de datos por su ID
        userService.delete(id);
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
