package es.jesus.reservas.roomreservationapi.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import es.jesus.reservas.roomreservationapi.dominios.Usuarios;

public interface UserRepository extends JpaRepository<Usuarios, Long> {
}

