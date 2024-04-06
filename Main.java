import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(2.5, 4.0);
        Circle circle = new Circle(center, 3.5);

        System.out.println("Właściwości koła:");
        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole koła: " + circle.getArea());
    } 
}
