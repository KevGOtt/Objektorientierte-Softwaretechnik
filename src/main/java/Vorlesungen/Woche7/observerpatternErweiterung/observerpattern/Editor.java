package Vorlesungen.Woche7.observerpatternErweiterung.observerpattern;

public class Editor extends Observer {

    private Circle circle; //Subject

    public Editor(Circle circle) {
        this.circle = circle;
        circle.attach(this);
    }

    @Override
    public void update(ChangeEvent changeEvent) {
        if (changeEvent instanceof RadiusChangeEvent) {
            refreshCanvas();
        } else {
            //BLABLA
        }

    }

    private void refreshCanvas(){

    }

}
