package hometask07;

public class Cat {
    private String catName = "Снежок";
    private int weight;
    private int countOfWins;

    public Cat(int weight) {
        this.weight = weight;
    }

    public Cat(int weight, String catName) {
        this.weight = weight;
        this.catName = catName;
    }

    public void setCatName(String catName) {
        if (catName != null && catName.replace(" ", "").length() > 2) this.catName = catName;
    }

    public void setWeight(int weight) {
        if (weight > 0 && weight < 9) {
            this.weight = weight;
        }

    }

    public int getCountOfWins() {
        return countOfWins;
    }

    public boolean attack(Cat catAttacker) {
        if (catAttacker == null) throw new IllegalArgumentException("Кот противник не может быть null");
        if (this.weight > catAttacker.weight) {
            this.countOfWins++;
            return true;
        } else if (this.weight < catAttacker.weight) {
            catAttacker.countOfWins++;
            return false;
        } else {
            throw new IllegalArgumentException("Ничья! Коты одного веса - выберите других котов");
        }
    }

}
