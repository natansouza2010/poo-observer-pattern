package domain.entities;

import domain.interfaces.Observer;

public abstract class Sensor implements Observer {
    private Integer id;

    public Sensor(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
