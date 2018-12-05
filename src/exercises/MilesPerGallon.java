package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;
        Scanner inFirst;
        Scanner inSecond;

        inFirst = new Scanner(System.in);
        System.out.println("How many miles did you drive? ");
        miles = inFirst.nextDouble();

        inSecond = new Scanner(System.in);
        System.out.println("How many gallons did you use?");
        gallons = inSecond.nextDouble();

        double mpg = miles / gallons;
        System.out.println("Your mpg is:" + mpg);
    }


}
