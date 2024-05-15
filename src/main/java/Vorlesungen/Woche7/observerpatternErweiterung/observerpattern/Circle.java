package Vorlesungen.Woche7.observerpatternErweiterung.observerpattern;

public class Circle extends Subject {

    private float radius;



    public void setRadius(float radius) {
        this.radius = radius;
        notifyObservers(new RadiusChangeEvent(this, radius));

    }

    public float getRadius() {
        return radius;
    }
}
