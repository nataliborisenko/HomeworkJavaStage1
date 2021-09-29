package homeworkModule4.optionalTask1;

import java.util.Arrays;
import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        String s1 = keyboard.nextLine();
        System.out.println("Enter " + s1 + " number(s):");
        String[] array = new String[Integer.parseInt(s1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = keyboard.next();
        }
        int minLen = array[0].length();
        int maxLen = array[0].length();
        String numShort = "";
        String numLong = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < minLen) {
                minLen = array[i].length();
                numShort = array[i];
            } else if (array[i].length() > maxLen) {
                maxLen = array[i].length();
                numLong = array[i];
            }
        }
        System.out.println("The shortest number is: " + numShort + ", with length: " + minLen);
        System.out.println("The longest number is: " + numLong + ", with length: " + maxLen);

        System.out.println("Not sorted array: " + Arrays.toString(array));
        BubbleSorter.sortArrayInAscendingOrder(array);
        System.out.println("Array sorted in ascending order:" + Arrays.toString(array));
        LengthLessAverage.findNumbersWithLengthLessAverage(array);

        String number = array[0];
        int minQuantity = CountDigits.countingDigitsInNumber(Integer.parseInt(array[0]));
        for (int i = 1; i < array.length; i++) {
            if (CountDigits.countingDigitsInNumber(Integer.parseInt(array[i])) < minQuantity) {
                minQuantity = CountDigits.countingDigitsInNumber(Integer.parseInt(array[i]));
                number = array[i];
            }
        }
        System.out.println("The number which has minimal different digits: " + number + " , consist of " + minQuantity + " digit(s)");
    }
}

