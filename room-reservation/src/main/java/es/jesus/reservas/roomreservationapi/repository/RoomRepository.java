package es.jesus.reservas.roomreservationapi.repository;

import es.jesus.reservas.roomreservationapi.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
    
}
