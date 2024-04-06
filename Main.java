
import geometry.Point;
import geometry.ColoredCircle;
public class Main {
    public static void main(String[] args) {
        Point center = new Point(2.5, 4.0);
        ColoredCircle coloredCircle = new ColoredCircle(center, 3.5, "blue");

        System.out.println("Właściwości kolorowego koła:");
        System.out.println("Kolor koła: " + coloredCircle.getColor());
    } 
}
