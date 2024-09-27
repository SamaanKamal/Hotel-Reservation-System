package org.example.Entities;

public class Room {
    private int roomNumber;
    private String type;
    private boolean isAvailable;
    private double pricePerNight;

    public Room() {
    }

    public Room(int roomNumber, String type, boolean isAvailable, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isAvailable = true;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", type='" + type + '\'' +
                ", isAvailable=" + isAvailable +
                ", pricePerNight=" + pricePerNight +
                '}';
    }
}
