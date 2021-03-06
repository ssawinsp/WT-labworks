package by.bsuir.povalyaeva;
import java.util.Scanner;
import java.text.DecimalFormat;

public class DataScanner {

    //final String PATTERN = "#0.00";
    private static Scanner in = new Scanner(System.in);

    public static float enterFloatNumber() {
        while (!in.hasNextFloat())
            in.next();
        return in.nextFloat();
    }

    public static double enterDoubleNumber() {
        while (!in.hasNextDouble())
            in.next();
        return in.nextDouble();
    }

    public static int enterIntegerNumber() {
            while (!in.hasNextInt())
                in.next();
            return in.nextInt();
    }

    public static int enterNaturalNumber() {
        int num;
        do
            num = enterIntegerNumber();
        while (num < 1);
        return num;
    }

    public static String transformDoubleToUserFormat(double number, String pattern) {
        return new DecimalFormat(pattern).format(number);
    }
}
