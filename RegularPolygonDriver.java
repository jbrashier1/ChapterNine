/**
 * Created by jackbrashier on 10/5/17.
 */
public class RegularPolygonDriver {
    public static void main(String[] args) {
        RegularPolygon triangle = new RegularPolygon();
        System.out.println("The perimeter of object triangle is " + triangle.getPerimeter() + ". The area of object triangle is " + triangle.getArea() + ".\n");

        RegularPolygon hexagon = new RegularPolygon(6, 4.0);
        System.out.println("The perimeter of object hexagon is " + hexagon.getPerimeter() + ". The area of object hexagon is " + hexagon.getArea() + ".\n");

        RegularPolygon decagon = new RegularPolygon(10, 4.0, 5.6, 7.8);
        System.out.println("The perimeter of object decagon is " + decagon.getPerimeter() + ". The area of object decagon is " + decagon.getArea() + ".");

    }
}