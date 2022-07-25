package domain.interfaces;

import domain.entities.Sensor;

public interface Subject {
    void registerObserver(Sensor obs);
    void removeObserver(Sensor obs);
    void notifyObservers();
}
