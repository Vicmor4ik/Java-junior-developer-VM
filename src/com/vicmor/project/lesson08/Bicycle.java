package com.vicmor.project.lesson08;

// ����� Bicycle ����������� �� ������ Vehicle
// ����� Bicycle - �������� �����, ��������, ������
// ����� Vehicle - ������������ �����, ����������, ��������
// ������������� ������������ ������� ���������
public class Bicycle extends Vehicle{
    private int numberOfWheels = 2;
    private String type = "���������";

    // ���� � ������������ ������ ��� ������������ ��� ����������,
    // �� �� ���� ������������� ��������� ������ ������ ���������� ����������� �������� � �����������,
    // ����� ������, �� ����� ��������
    // ����� ������������ �������� ������ ���� ������
    public Bicycle(String number, int maxSpeed, int numberOfWheels) {
        super(number, maxSpeed); // ����� ������������ ��������
        this.numberOfWheels = numberOfWheels;
    }

    public Bicycle(String number, int maxSpeed) {
        super(number, maxSpeed); // ����� ������������ ��������
    }

    public Bicycle(int maxSpeed, int numberOfWheels, String type) {
        super("1", maxSpeed); // ����� ������������ ��������
        this.numberOfWheels = numberOfWheels;
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getType() {
        return type;
    }
}