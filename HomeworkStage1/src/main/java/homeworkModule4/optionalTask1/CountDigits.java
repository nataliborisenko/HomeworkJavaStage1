package homeworkModule4.optionalTask1;

import java.util.HashSet;

public class CountDigits {
    public static int countingDigitsInNumber(int number) {
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        while (number > 0) {
            myHashSet.add(number % 10);
            number /= 10;
        }
        return myHashSet.size();
    }
}
