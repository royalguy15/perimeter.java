import java.util.*;

public class perimeterofcircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius of the circle: ");
        double r = sc.nextDouble();

        double perimeter = 2 * 3.14 * r;

        System.out.println("Perimeter of Circel:" + perimeter);
    }

}
