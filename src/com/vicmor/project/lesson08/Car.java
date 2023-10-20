package com.vicmor.project.lesson08;

public class Car extends Vehicle {
    protected String color = "Белый";
    protected int maxSpeed =240;
    public Car(String number) {
        super(number);
    }

    public Car(String number, int maxSpeed) {
        super(number,maxSpeed);
    }

    public void setColor(String color) {
        if (color!=null) this.color = color;
    }

}
