package es.jesus.reservas.roomreservationapi.domain;

public class Reservation {

    private Long id; 
    private Long roomId; 
    private Long userId; 
    private String date;
    
    public Reservation(Long id, Long roomId, Long userId, String date) {
        this.id = id;
        this.roomId = roomId;
        this.userId = userId;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    } 
}
