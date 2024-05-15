package Vorlesungen.Woche7.observerpattern;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {

    @Test
    public void observerTest(){
        Circle c1 = new Circle();
        Editor e1 = new Editor(c1);
        c1.setRadius(2.14f);

    }

}