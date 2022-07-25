package domain.entities;

import domain.interfaces.Observer;

public class AC extends Sensor implements Observer {
    public AC(Integer id) {
        super(id);
    }


    @Override
    public void update(Integer nivelAbalo) {
        if(nivelAbalo > 6 ){
            System.out.println("Evacuem !!!");
        }

    }
}
