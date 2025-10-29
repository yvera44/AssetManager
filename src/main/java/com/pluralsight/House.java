package com.pluralsight;

public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotsize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotsize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotsize = lotsize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotsize() {
        return lotsize;
    }

    public void setLotsize(int lotsize) {
        this.lotsize = lotsize;
    }
}
