package es.jesus.reservas.roomreservationapi.repositorio;


// Importa la interfaz JpaRepository de Spring Data JPA
// //JpaRepository nos permite acceder a la base de datos de forma automática y proporciona métodos como save(), findAll(), findById(), delete(), etc.
import org.springframework.data.jpa.repository.JpaRepository;

// Importa la anotación @Repository de Spring
// Indica que esta clase o interfaz es un **repositorio**, es decir, que maneja la persistencia de datos (acceso a la base de datos)
// Además, Spring puede detectar esta clase automáticamente y gestionarla como un bean.
import org.springframework.stereotype.Repository;

// Importa la clase Usuarios desde nuestro paquete de dominios
// Esta clase representa la entidad de usuario en la base de datos y se usará como tipo genérico en el repositorio
import es.jesus.reservas.roomreservationapi.dominios.Usuarios;

public interface UserRepository extends JpaRepository<Usuarios, Long> {
}

