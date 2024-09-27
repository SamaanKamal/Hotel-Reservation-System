package org.example.Entities;

import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String name;
    private String email;
    private List<Booking> reservationHistory;

    public Guest() {
    }

    public Guest(String name, String email) {
        this.name = name;
        this.email = email;
        this.reservationHistory = new ArrayList<>();
    }

    public void addReservation(Booking booking) {
        reservationHistory.add(booking);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Booking> getReservationHistory() {
        return reservationHistory;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", reservationHistory=" + reservationHistory +
                '}';
    }
}
