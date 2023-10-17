package com.vicmor.project.lesson08;

import java.util.Random;

public class RepairShop {
    // � ������ ����� �������� ��� Vehicle � ��� ��� �������
    private Vehicle[] vehicles;
    private String[] colors = {"�������", "�����", "���������", "������"};

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
    // �� ������� ��� �������� ������. � ����� ������ ����� ������� ��� � �������� �������