package com.vicmor.project.lesson08;

public class Scooter extends Bicycle {
    protected boolean isElectric;

public Scooter (String number, int maxSpeed, boolean isElectric){
    super(number, maxSpeed);
    this.isElectric= isElectric;
}

    @Override
    public void repair() {
        if (isElectric == true) {
            if (levelOfWare >= 2) levelOfWare -= 2;
        } else if (levelOfWare >= 3) {
            levelOfWare -= 3;
        }
    }
}
