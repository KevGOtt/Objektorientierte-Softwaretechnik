package Vorlesungen.Woche6;

public class RoundedRectangle extends Rectangle {
    private double cornerRadius;

    public RoundedRectangle(double xPos, double yPos, double width, double height, double cornerRadius) {
        super(xPos, yPos, width, height);
        this.cornerRadius = cornerRadius;
    }

    @Override
    public double area() {
        return super.area() - ((4 * this.cornerRadius * this.cornerRadius) - Math.PI * this.cornerRadius * this.cornerRadius);
    }

    @Override
    public void scale(double factor) {
        super.scale(factor);
        this.cornerRadius *= factor;
    }
}
