package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }
    public float getPrice() {
        int weekendFactor = 1;
        if (weekend == true){
            weekendFactor += 0.1;
        }
        if (roomType.equals("double")) {
            return 124f * weekendFactor;
        }else if (roomType.equals("king")){
            return 139f * weekendFactor;
        }
        return 0;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    public float getReservationTotal(){
        return getPrice() * numberOfNights;
    }
}
