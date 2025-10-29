package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue() {

        int vehicleAge = LocalDate.now().getYear() - year;

        double annualDepreciationRate = switch (vehicleAge) {

            case 0, 1, 2, 3 -> 0.03;
            case 4, 5, 6 -> 0.06;
            case 7, 8, 9 -> 0.08;
            default -> 0;

            // over 10 years old - $1000.00
            // MINUS reduce final value by 25% if over 100,000 miles
            // unless makeModel contains word Honda or Toyota
        };

        return annualDepreciationRate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("makeModel = '").append(makeModel).append('\'');
        sb.append(", year = ").append(year);
        sb.append(", odometer = ").append(odometer);
        sb.append('}');
        return sb.toString();
    }
}
