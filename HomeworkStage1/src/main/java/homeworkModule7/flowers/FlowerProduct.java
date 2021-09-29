package homeworkModule7.flowers;
import homeworkModule7.customersWishes.*;
import java.util.Objects;

public class FlowerProduct extends Flower {

    private double price;
    FreshnessLevel freshnessLevel;

    public FlowerProduct(String nameOfFlower, Color colorOfFlower, double lengthOfStalk, double price, FreshnessLevel freshnessLevel) {
        super(nameOfFlower, colorOfFlower, lengthOfStalk);
        this.price = price;
        this.freshnessLevel = freshnessLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public FreshnessLevel getFreshnessLevel() {
        return freshnessLevel;
    }

    public void setFreshnessLevel(FreshnessLevel freshnessLevel) {
        this.freshnessLevel = freshnessLevel;
    }

    @Override
    public String toString() {
        return super.toString() +
                "FlowerProduct{" +
                "price=" + price +
                ", freshnessLevel=" + freshnessLevel +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlowerProduct that = (FlowerProduct) o;
        return Double.compare(that.price, price) == 0 && freshnessLevel == that.freshnessLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price, freshnessLevel);
    }
}


