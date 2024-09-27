package org.example.Entities;

public class Booking {
    private Room room;
    private Guest guest;
    private String checkInDate;
    private String checkOutDate;

    public Booking() {
    }

    public Booking(Room room, Guest guest, String checkInDate, String checkOutDate) {
        this.room = room;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        guest.addReservation(this);  // Add this booking to the guest's reservation history
        room.setAvailable(false);  // Set the room as unavailable when booked
    }
    public void modifyBooking(String newCheckInDate, String newCheckOutDate) {
        this.checkInDate = newCheckInDate;
        this.checkOutDate = newCheckOutDate;
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "room=" + room +
                ", guest=" + guest +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                '}';
    }
}
