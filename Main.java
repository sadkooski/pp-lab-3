
import geometry.Square;
public class Main {
    public static void main(String[] args) {
    Square square = new Square(3.0);

    System.out.println("Pole kwadratu: " + square.calculateArea());
    System.out.println("Obwód kwadratu: " + square.calculatePerimeter());
    } 
}
