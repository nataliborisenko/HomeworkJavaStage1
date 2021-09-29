package homeworkModule7;

import homeworkModule7.customersWishes.*;
import homeworkModule7.flowers.FlowerProduct;

import java.util.*;

public class FlowerShop {
    public static void main(String[] args) {
        List<FlowerProduct> flowersForSale = Arrays.asList(
                new FlowerProduct("Roza", Color.WHITE, 0.55, 3.0, FreshnessLevel.FRESH),
                new FlowerProduct("Tulip", Color.WHITE, 0.4, 1.26, FreshnessLevel.DRIED),
                new FlowerProduct("Roza", Color.PINK, 0.7, 2.9, FreshnessLevel.FADING),
                new FlowerProduct("Tulip", Color.YELLOW, 0.3, 1.25, FreshnessLevel.FRESH),
                new FlowerProduct("Roza", Color.PINK, 0.65, 3.0, FreshnessLevel.FRESH),
                new FlowerProduct("Roza", Color.RED, 0.95, 3.5, FreshnessLevel.FRESH),
                new FlowerProduct("Tulip", Color.PINK, 0.25, 1.27, FreshnessLevel.FADING),
                new FlowerProduct("Roza", Color.YELLOW, 0.5, 2.3, FreshnessLevel.DRIED)
        );
        List<FlowerProduct> bouquetForSale = CreationBouquet.creationBouquet(flowersForSale, "Roza");
        System.out.println(bouquetForSale);
        System.out.println("The price of bouquet is : " + CreationBouquet.determiningCostOfBouquet(bouquetForSale, Decoration.DECORATIVE_RIBBON));
        CreationBouquet.sortFlowersInBouquetAccordingFreshness(bouquetForSale);
        double minLengthOfStack = 0.65, maxLengthOfStack = 0.8;
        CreationBouquet.findFlowerAccordingRangeOfLengthOfStalk(bouquetForSale, minLengthOfStack, maxLengthOfStack);
    }
}
