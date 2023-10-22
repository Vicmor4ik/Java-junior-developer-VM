package hometask10.animals;

import java.util.Arrays;

public class Wolf extends WildAnimal {
    private final String[] likeToEat;
    private final String color;

    public Wolf(String name, double age, int strength, String[] likeToEat, String color) {
        super(name, age, strength);
        this.likeToEat = likeToEat;
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wolf wolf)) return false;

        return color.equals(wolf.getColor()) && Arrays.equals(likeToEat, wolf.likeToEat) &&
                getStrength() == wolf.getStrength() && getAge() == wolf.getAge() && getName().equals(wolf.getName());
    }
}