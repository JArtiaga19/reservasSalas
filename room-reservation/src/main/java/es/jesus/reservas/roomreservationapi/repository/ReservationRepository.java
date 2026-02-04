package es.jesus.reservas.roomreservationapi.repository;

import es.jesus.reservas.roomreservationapi.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

