package Vorlesungen.Woche6;

public class Rectangle extends Shape2D{

    private double width;
    private double height;

    public Rectangle(double xPos, double yPos, double width, double height) {
        super(xPos, yPos); // Kostruktoraufruf Oberklasse
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width*height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void scale(double factor) {
        this.height *= factor;
        this.width += factor;
    }
}
