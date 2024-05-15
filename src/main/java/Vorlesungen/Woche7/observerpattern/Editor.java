package Vorlesungen.Woche7.observerpattern;

public class Editor extends Observer{

    private Circle circle; //Subject

    public Editor(Circle circle) {
        this.circle = circle;
        circle.attach(this);
    }

    @Override
    public void update() {
        float newRadius = circle.getRadius();
        System.out.println("Paiting circle with new radius: " + newRadius);
    }

    private void refreshCanvas(){

    }

}
