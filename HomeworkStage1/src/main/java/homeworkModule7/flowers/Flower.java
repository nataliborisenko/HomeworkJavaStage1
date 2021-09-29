package homeworkModule7.flowers;

import homeworkModule7.customersWishes.Color;

import java.util.Objects;

public abstract class Flower {
    private String nameOfFlower;
    Color colorOfFlower;
    private double lengthOfStalk;

    public Flower(String nameOfFlower, Color colorOfFlower) {
        this.nameOfFlower = nameOfFlower;
        this.colorOfFlower = colorOfFlower;
    }

    public Flower(String nameOfFlower, Color colorOfFlower, double lengthOfStalk) {
        this(nameOfFlower, colorOfFlower);
        this.lengthOfStalk = lengthOfStalk;
    }

    public String getNameOfFlower() {
        return nameOfFlower;
    }

    public void setNameOfFlower(String nameOfFlower) {
        this.nameOfFlower = nameOfFlower;
    }

    public Color getColorOfFlower() {
        return colorOfFlower;
    }

    public void setColorOfFlower(Color colorOfFlower) {
        this.colorOfFlower = colorOfFlower;
    }

    public double getLengthOfStalk() {
        return lengthOfStalk;
    }

    public void setLengthOfStalk(double lengthOfStalk) {
        this.lengthOfStalk = lengthOfStalk;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "nameOfFlower='" + nameOfFlower + '\'' +
                ", colorOfFlower=" + colorOfFlower +
                ", lengthOfStalk=" + lengthOfStalk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.lengthOfStalk, lengthOfStalk) == 0 && nameOfFlower.equals(flower.nameOfFlower) && colorOfFlower == flower.colorOfFlower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfFlower, colorOfFlower, lengthOfStalk);
    }
}