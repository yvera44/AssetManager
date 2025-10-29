package com.pluralsight;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        House house = new House ("Monster House", "05-21-2006", 0.00, "6767 S Oak Street", 2, 2850, 700);
        Vehicle vehicle = new Vehicle("BMW M3 Competition", "09-22-2022", 100500, "BMW M3 Competition", 2022, 6767);

        assets.add(house);
        assets.add(vehicle);

        for (Asset asset: assets){
            System.out.println(asset);
        }

    }
}
