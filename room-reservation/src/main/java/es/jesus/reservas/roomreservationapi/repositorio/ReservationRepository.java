package es.jesus.reservas.roomreservationapi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jesus.reservas.roomreservationapi.dominios.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

