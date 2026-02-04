package es.jesus.reservas.roomreservationapi.repository;


import es.jesus.reservas.roomreservationapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

