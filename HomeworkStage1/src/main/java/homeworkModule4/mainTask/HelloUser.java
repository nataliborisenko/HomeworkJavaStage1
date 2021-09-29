package homeworkModule4.mainTask;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter your name");
        String sc1;
        sc1 = keyboard.nextLine();
        keyboard.close();
        System.out.println("Hello "+ sc1 + "," + " have a good day!");
    }
}

