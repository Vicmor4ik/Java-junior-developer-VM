package com.vicmor.project.lesson08;

public class RepairShop {
    // � ������ ����� �������� ��� Vehicle � ��� ��� �������
    private Vehicle[] vehicles;
    private String[] colors = {"�������", "�����", "���������", "������"};

    public RepairShop(int countOfVehicles) {
        vehicles = new Vehicle[countOfVehicles];
    }

    public void addToVehicles(Vehicle vehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicle != null) {
                vehicles[i] = vehicle;
            }
        }
    }

    public void repairAll() {
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].repair();
            if (vehicles[i] instanceof Car) {
                int random = (int) (Math.random() * colors.length);
                ((Car) vehicles[i]).setColor(colors[random]);
            }
            if (vehicles[i] instanceof Train) {
                ((Train) vehicles[i]).changeClimateControl();
            }
            vehicles[i] = null;
        }

    }
}