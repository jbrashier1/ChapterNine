/**
 * Created by jackbrashier on 10/5/17.
 */
public class RegularPolygonDriver {
    public static void main(String[] args) {
        RegularPolygon triangle = new RegularPolygon();
        System.out.println("The perimeter of object triangle is " + triangle.getPerimeter() + ". The area of object triangle is " + triangle.getArea() + ".\n");

        RegularPolygon pentagon = new RegularPolygon(5, 3.0);
        System.out.println("The perimeter of object pentagon is " + pentagon.getPerimeter() + ". The area of object pentagon is " + pentagon.getArea() + ".\n");

        RegularPolygon decagon = new RegularPolygon(10, 6.5, 4.5, 2);
        System.out.println("The perimeter of object decagon is " + decagon.getPerimeter() + ". The area of object decagon is " + decagon.getArea() + ".");

    }
}