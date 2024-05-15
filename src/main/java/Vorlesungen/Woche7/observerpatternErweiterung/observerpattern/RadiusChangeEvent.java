package Vorlesungen.Woche7.observerpatternErweiterung.observerpattern;

public class RadiusChangeEvent extends ChangeEvent{

    private final float newRadius;

    public RadiusChangeEvent(Circle circle, float newRadius) {
        super(circle);
        this.newRadius = newRadius;
    }

    public float getNewRadius() {
        return newRadius;
    }
}
