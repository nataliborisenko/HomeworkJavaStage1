package homeworkModule7;

import homeworkModule7.customersWishes.Decoration;
import homeworkModule7.flowers.FlowerProduct;

import java.util.*;

public class CreationBouquet {

    public static List<FlowerProduct> creationBouquet(List<FlowerProduct> flowers, String nameOfFlower) {
        List<FlowerProduct> bouquetForSale = new ArrayList<>();
        for (FlowerProduct product : flowers) {
            if (product.getNameOfFlower().equals(nameOfFlower)) {
                bouquetForSale.add(product);
            }
        }
        return bouquetForSale;
    }

    public static double determiningCostOfBouquet(List<FlowerProduct> bouquetForSale, Decoration decoration) {
        double cost = 0;
        for (FlowerProduct product : bouquetForSale) {
            cost += product.getPrice();
        }
        return cost + decoration.getPrice();
    }

    public static void sortFlowersInBouquetAccordingFreshness(List<FlowerProduct> bouquetForSale) {
        Collections.sort(bouquetForSale, (o1, o2) -> o2.getFreshnessLevel().compareTo(o1.getFreshnessLevel()));
        System.out.println("List of flowers sorted according freshness level " + "\n" + bouquetForSale);
    }

    public static void findFlowerAccordingRangeOfLengthOfStalk(List<FlowerProduct> bouquetForSale, double minLengthOfStack, double maxLengthOfStack) {
        for (FlowerProduct flowers : bouquetForSale) {
            if (flowers.getLengthOfStalk() > minLengthOfStack && flowers.getLengthOfStalk() < maxLengthOfStack) {
                System.out.println("List of flowers, which correspond to a given range of stalk lengths" + "\n" + flowers);
            }
            System.out.println("Flowers in this range is not exist");
        }
    }
}