import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();

        points.add(new Point());
        points.add(new Point(2, 4));
        points.add(new Point(-6, 8));

        Point midpoint = points.get(0).midpoint(points.get(1));

        System.out.println(midpoint);

        double distance = points.get(0).distance(points.get(2));
        System.out.println(distance);

        boolean check = points.get(0).isCollinear(points.get(1), points.get(2));
        System.out.println(check);
    }
}
