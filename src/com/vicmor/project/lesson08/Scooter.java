package com.vicmor.project.lesson08;

public class Scooter extends Bicycle {
    protected boolean isElectric;
    protected int numberOfWheels = 2;
    protected String type = "Городской";

    public Scooter(String number, int maxSpeed, int numberOfWheels, boolean isElectric) {
        super(number, maxSpeed, 2);
        this.isElectric = isElectric;
    }

    public Scooter(String number, int maxSpeed, boolean isElectric) {
        super(number, maxSpeed);
        this.isElectric = isElectric;
    }

    public Scooter(int maxSpeed, int numberOfWheels, String type, boolean isElectric) {
        super(maxSpeed, 2, "Городской");
        this.isElectric = isElectric;
    }

    @Override
    public void repair() {
        if (isElectric = true) {
            if (levelOfWare >= 2) levelOfWare -= 2;
        } else if (levelOfWare >= 3) {
            levelOfWare -= 3;
        }
    }
}
//Проще какую-то константу завести для количества колес и типа Городской. От чего зависит какие конструкторы родителя мы должны обрабатывать? (тут не понял)
// Или НАДО обработать хотя бы один не пустой?