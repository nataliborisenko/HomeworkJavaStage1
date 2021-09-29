package homeworkModule4.optionalTask1;

public class BubbleSorter {
    public static void sortArrayInAscendingOrder(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1].length() > array[j].length()){
                    String tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}

