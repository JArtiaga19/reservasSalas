package es.jesus.reservas.roomreservationapi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jesus.reservas.roomreservationapi.dominios.Salas;

public interface RoomRepository extends JpaRepository<Salas, Long> {
    
}
