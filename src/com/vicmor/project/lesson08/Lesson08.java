package com.vicmor.project.lesson08;

public class Lesson08 {
    public static void main(String[] args) {
        Bicycle bicycle01 = new Bicycle("1v", 60);
        bicycle01.incLevelOfWare(3);
        bicycle01.repair();

        Train train01 = new Train("123P", 130, 13, true);
        train01.incLevelOfWare(3);
        train01.repair();

        Vehicle vehicle = new Bicycle("1vh", 30);

        Bicycle bVehicle02 = (Bicycle) vehicle;

        Scooter scooter = new Scooter("1111", 40, true);


    }
}