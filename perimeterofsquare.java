import java.util.*;

public class perimeterofsquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of side:");
        double s = sc.nextDouble();

        double perimeter = 4 * s;

        System.out.println("Perimeter of Square: " + perimeter);
    }

}
