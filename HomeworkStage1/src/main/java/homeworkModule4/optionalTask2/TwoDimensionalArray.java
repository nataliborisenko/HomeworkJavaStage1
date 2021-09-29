package homeworkModule4.optionalTask2;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = keyboard.nextInt();
        String[][] array = new String[n][n];
        Random randomNumberGenerator = new Random();
        String alphabet = "ABSDEFGHIJKLM";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int alphabetLength = alphabet.length();
                int randomNumber = randomNumberGenerator.nextInt(alphabetLength);
                char randomChar = alphabet.charAt(randomNumber);
                boolean randomBooleanValue = randomNumberGenerator.nextBoolean();
                if (randomBooleanValue)
                    array[i][j] = String.valueOf(randomChar);
                else
                    array[i][j] = "-" + String.valueOf(randomChar);
                System.out.print(array[i][j] + "       ");
            }
            System.out.println();
        }
        System.out.print("Enter the row number by which the matrix will be sorted: ");
        int rowNumberToSort = keyboard.nextInt() - 1;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (array[rowNumberToSort][j].compareTo(array[rowNumberToSort][j + 1]) > 0) {
                    for (int k = 0; k < array[i].length; k++) {
                        String tmp = array[k][j];
                        array[k][j] = array[k][j + 1];
                        array[k][j + 1] = tmp;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Matrix after sorting");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "       ");
            }
            System.out.println();
        }
    }
}


