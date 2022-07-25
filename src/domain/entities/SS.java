package domain.entities;

import domain.interfaces.Observer;

public class SS extends Sensor implements Observer {
    public SS(Integer id) {
        super(id);
    }

    @Override
    public void update(Integer nivelAbalo) {
        if(nivelAbalo>2){
            System.out.println("Piscando Vermelho !!!");
        }

    }
}
