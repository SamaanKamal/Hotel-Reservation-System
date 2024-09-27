package org.example.Entities;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String hotelName;
    private List<Room> rooms;
    private List<Booking> bookings;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }
    public void cancelReservation(Booking booking) {
        booking.cancelBooking();
        bookings.remove(booking);
    }
}
