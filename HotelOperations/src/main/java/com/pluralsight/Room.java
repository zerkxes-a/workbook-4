package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private float price;
    private boolean occupied;
    private boolean dirty;

    Room(int numberOfBeds, float price) {
            this.numberOfBeds = numberOfBeds;
            this.price = price;
        }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public float getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        if(occupied && dirty) {
            return false;
        } else if (!occupied && !dirty) {
            return true;
        }else {
            return false;
            }
    }
    //if room is available make room dirty and occupied
    public void checkIn(){
        occupied = true;
        dirty = true ;
    }
    //change room status to not occupied
    public void checkout(){
        occupied = false;
    }
    //changes room status to !dirty
    public void cleanRoom(){
        dirty = false;
    }
}
