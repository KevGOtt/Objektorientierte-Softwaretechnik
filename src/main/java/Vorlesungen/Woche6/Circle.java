package Vorlesungen.Woche6;

public class Circle extends Shape2D{
    private double radius;

    public Circle(double xPos, double yPos, double radius) {
        super(xPos,yPos);
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void scale(double factor) {
        this.radius *= factor;
    }
}
