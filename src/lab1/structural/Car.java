package lab1.structural;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private List<Car> outruns;

    public Car(String name) {
        this.name = name;
        outruns = new ArrayList<Car>();
    }

    public void add(Car e) {
        outruns.add(e);
    }

    public void remove(Car e) {
        outruns.remove(e);
    }

    public List<Car> getOutruns() {
        return outruns;
    }

    public String toString() {
        return (name);
    }
}
