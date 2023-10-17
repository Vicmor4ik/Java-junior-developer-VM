package com.vicmor.project.lesson08;

import java.util.Random;

public class RepairShop {
    // в массив можно добавить тип Vehicle и все его подтипы
    private Vehicle[] vehicles;
    private String[] colors = {"красный", "жёлтый", "оранжевый", "чёрный"};

    public void addToVehicles(Vehicle vehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicle != null) {
                vehicles[i] = vehicle;
            }
        }
    }

    public void repairAll() {
        for (Vehicle vehicle : vehicles) {

            vehicle.repair();
            if (vehicle instanceof Car car) {
                int random = (int) (Math.random() * colors.length);
                car.setColor(colors[random]);
            }
                if (vehicle instanceof Train train) {
                    train.changeClimateControl();
                }
               vehicle=null;
            }
        }
    }
    // Не понимаю как обнулить объект. В такой записи среда говорит что я глупость написал