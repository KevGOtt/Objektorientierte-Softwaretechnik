package Vorlesungen.Woche7.observerpatternErweiterung.observerpattern;

public abstract class ChangeEvent {
    public Subject getSource() {
        return source;
    }

    private final Subject source;

    protected ChangeEvent(Subject source) {
        this.source = source;
    }
    public ChangeEvent() {
        Circle circle = new Circle();
        circle.setRadius(100f);
        this.source = circle;
    }
}
