package hometask10.animals;

public class WildAnimal extends Animal{
    private int strength;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public WildAnimal(String name, double age,int strength) {
        super(name,age);
        this.strength = strength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WildAnimal wildAnimal)) return false;

        return strength== wildAnimal.getStrength();
    }
}
