import java.util.*;

public class perimeterofrectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of side a: ");
        double a = sc.nextDouble();

        System.out.print("Length of side b: ");
        double b = sc.nextDouble();

        double perimeter = 2 * (a + b);

        System.out.println("Perimeter of rectangle:" + perimeter);
    }

}
