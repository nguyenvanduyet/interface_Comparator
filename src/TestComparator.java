import Shape.Circle;
import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle("blue", 5.0);
        circles[1] = new Circle("black", 3.0);
        circles[2] = new Circle("yellow", 9.0);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
