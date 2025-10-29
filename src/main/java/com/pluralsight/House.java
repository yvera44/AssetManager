package com.pluralsight;

public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
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

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotsize) {
        this.lotSize = lotsize;
    }
    @Override
    public double getValue() {
        double houseValue = switch (condition) {
            // A house's value is determined as

            case 1 -> 180; // $180.00 per square foot (excellent)
            case 2 -> 130; // $130.00 per square foot (good)
            case 3 -> 90; // $90.00 per square foot (fair)
            case 4 -> 80; // $80.00 per square foot (poor)
            default -> 0;

        };
        // PLUS 25 cents per square foot of lot size
        double lotValue = .25 * lotSize;

        return lotValue + houseValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House [");
        sb.append("address = '").append(address).append('\'');
        sb.append(", condition = ").append(condition);
        sb.append(", squareFoot = ").append(squareFoot);
        sb.append(", lotSize = ").append(lotSize);
        sb.append(']');
        return sb.toString();
    }
}
