package hometask11;

public enum Planets {
    MERCURY("��������", 0.0553, 2440),
    VENUS("������", 0.815, 6052),
    EARTH("�����", 1, 6371),
    MARS("����", 0.1075, 3390),
    JUPITER("������", 317.8, 69911),
    SATURN("������", 95.2, 58232),
    URANUS("����", 14.6, 25362),
    NEPTUNE("������", 17.2, 24622);


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
