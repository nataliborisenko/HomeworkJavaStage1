package homeworkModule4.mainTask;

public class Arguments {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--)
            System.out.println("Reverse : " + args[i]);
    }
}

