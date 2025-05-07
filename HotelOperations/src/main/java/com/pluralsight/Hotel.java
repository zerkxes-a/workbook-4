package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(int numberOfSuites, int numberOfRooms){
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }
    public Hotel(int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms){
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }
    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public int getAvailableRooms(){
        int availableRooms = numberOfRooms - bookedBasicRooms;
        return availableRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if (isSuite){
           if (numberOfRooms <= getAvailableSuites()){
             bookedSuites += 1;
           }
        }
        else if (numberOfRooms <= getAvailableRooms()){
            bookedBasicRooms += 1;

        }
        return false;
    }
}
