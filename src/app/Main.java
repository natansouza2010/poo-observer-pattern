package app;

import domain.entities.*;

public class Main {
    public static void main(String[] args) {

        Barragem b1 = new Barragem("Mariana", "São Carlos", 7);
        Sensor o1 = new AC(1);
        Sensor o2 = new SS(2);
        Sensor o3 = new SSA(3);

        b1.registerObserver(o1);
        b1.registerObserver(o2);
        b1.registerObserver(o3);

        b1.notifyObservers();
    }
}
