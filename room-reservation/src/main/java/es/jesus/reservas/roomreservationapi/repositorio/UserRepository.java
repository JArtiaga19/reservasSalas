package es.jesus.reservas.roomreservationapi.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import es.jesus.reservas.roomreservationapi.dominios.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

