package hometask10.animals;

import java.util.Arrays;

public class Wolf extends WildAnimal{
    private final String[] likeToEat;

    public String[] getLikeToEat() {
        return likeToEat;
    }

    public String getColor() {
        return color;
    }

    private final String color;

    public Wolf(String[] likeToEat, String color) {
        this.likeToEat = likeToEat;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wolf)) return false;

        Wolf wolf = (Wolf) o;

        return color.equals(wolf.getColor())&& Arrays.equals(likeToEat, wolf.likeToEat);
    }
}