package homeworkModule4.mainTask;

public class SumOfArguments {
    public static void main(String[] args) {
      int result = 0;
        int i = 0;
        while (i < args.length)
        {
            result +=  Integer.parseInt(args[i]);
            i++;
        }  System.out.println ("The sum of arguments is: " + result);
    }
}
//        int result = 0;
//        for (String argument : args) {
//            result += Integer.parseInt(argument);
//            }
//        System.out.println ("The sum of arguments is: " + result);
//    }
//}
//        int result = 0;
//        for (int i = 0; i < args.length; i++) {
//            result += Integer.parseInt(args[i]);
//        }
//        System.out.println ("The sum of arguments is: " + result);
//    }
//}

