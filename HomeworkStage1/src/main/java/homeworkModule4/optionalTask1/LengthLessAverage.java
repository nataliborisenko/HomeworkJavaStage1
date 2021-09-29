package homeworkModule4.optionalTask1;

public class LengthLessAverage {
    public static void findNumbersWithLengthLessAverage(String[] array) {
        int totalNumberOfDigits = 0;
        int numberOfDigitsInArray = array.length;
        float averageLength = 0;
        for (int i = 0; i < array.length; i++) {
            totalNumberOfDigits += array[i].length();
        }
        averageLength = totalNumberOfDigits / (float) array.length;
        System.out.println("Array length: " + numberOfDigitsInArray + ", total number of digits are: " + totalNumberOfDigits + ", average length:" + averageLength);
        System.out.println("Numbers with length less than average: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < averageLength) {
                System.out.println("Number: " + array[i] + " length: " + array[i].length());
            }
        }
    }
}


