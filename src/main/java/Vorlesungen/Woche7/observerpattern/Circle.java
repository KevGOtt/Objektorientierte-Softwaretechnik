package Vorlesungen.Woche7.observerpattern;

public class Circle extends Subject{

    private float radius;



    public void setRadius(float radius) {
        this.radius = radius;
        notifyObservers();

    }

    public float getRadius() {
        return radius;
    }
}
