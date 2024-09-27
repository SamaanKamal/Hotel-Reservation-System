package org.example.Entities;

import java.time.LocalDate;

public class Booking {
    private Room room;
    private Guest guest;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Booking() {
    }

    public Booking(Room room, Guest guest, LocalDate checkInDate, LocalDate checkOutDate) {
        this.room = room;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        guest.addReservation(this);  // Add this booking to the guest's reservation history
        room.setAvailable(false);  // Set the room as unavailable when booked
    }
    public void modifyBooking(LocalDate newCheckInDate, LocalDate newCheckOutDate) {
        this.checkInDate = newCheckInDate;
        this.checkOutDate = newCheckOutDate;
    }

    public void cancelBooking() {
        room.setAvailable(true);  // Make the room available again
        System.out.println("Booking for " + guest.getName() + " in Room #" + room.getRoomNumber() + " has been canceled.");
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
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
