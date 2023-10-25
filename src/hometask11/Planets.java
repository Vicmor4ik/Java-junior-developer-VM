package hometask11;

public enum Planets {
    MERCURY("Меркурий", 0.0553, 2440),
    VENUS("Венера", 0.815, 6052),
    EARTH("Земля", 1, 6371),
    MARS("Марс", 0.1075, 3390),
    JUPITER("Юпитер", 317.8, 69911),
    SATURN("Сатурн", 95.2, 58232),
    URANUS("Уран", 14.6, 25362),
    NEPTUNE("Нептун", 17.2, 24622);


    Planets(String name, double mass, long radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    private String name;
    private double mass;
    private long radius;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }


}
