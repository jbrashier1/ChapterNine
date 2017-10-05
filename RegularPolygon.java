/**
 * Author: Jack Brashier
 * Date: 10/05/2017
 * Professor: Kanchanawanchai
 */
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    /** Default constructor - a triangle of side length 1 centered at (0,0) */
    public RegularPolygon() {
        this.n = 3;
        this.side = 1.0;
        this.x = 0;
        this.y = 0;
    }

    /** Custom constructor allows control of number and length of sides */
    public RegularPolygon(int numSides, double length) {
        this.n = numSides;
        this.side = length;
        this.x = 0;
        this.y = 0;
    }

    /** Custom constructor allows control of all manipulable variables */
    public RegularPolygon(int numSides, double length, double xCoord, double yCoord) {
        this.n = numSides;
        this.side = length;
        this.x = xCoord;
        this.y = yCoord;
    }

    /** Returns the amount of sides of the polygon */
    public int getN() {
        return n;
    }

    /** Allows the number of sides to be changed */
    public void setN(int n) {
        this.n = n;
    }

    /** Returns the length of sides of the polygon */
    public double getSide() {
        return side;
    }

    /** Allows the length of sides to be changed */
    public void setSide(double side) {
        this.side = side;
    }

    /** Returns the x coordinate of the polygon's center */
    public double getX() {
        return x;
    }

    /** Allows the x coordinate of the polygon's center to be moved. */
    public void setX(double x) {
        this.x = x;
    }

    /** Returns the y coordinate of the polygon's center */
    public double getY() {
        return y;
    }

    /** Allows the y coordinate of the polygon's center to be moved. */
    public void setY(double y) {
        this.y = y;
    }

    /** Returns the perimeter of the polygon, or the sum of all sides */
    public double getPerimeter() {
        return (this.getN() * this.getSide());
    }

    /** Returns the area of the polygon */
    public double getArea() {
        return ((this.getN() * this.getSide() * this.getSide()) / (4 * Math.tan(Math.PI / this.getN())));
    }
}
