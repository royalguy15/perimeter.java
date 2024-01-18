import java.util.*;

public class perimeteroftriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("lenght of side a :");
        double a = sc.nextDouble();

        System.out.print("length of side b :");
        double b = sc.nextDouble();

        System.out.print("length of side c :");
        double c = sc.nextDouble();

        double perimeter = a * b * c;

        System.out.println("Perimeter of triangle:" + perimeter);

    }

}
