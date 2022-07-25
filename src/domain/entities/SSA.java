package domain.entities;

import domain.interfaces.Observer;

public class SSA extends Sensor implements Observer {
    public SSA(Integer id) {
        super(id);
    }

    @Override
    public void update(Integer nivelAbalo) {
        if(nivelAbalo>3){
            System.out.println("Alarme sonoro efetuado !!");
        }
    }
}
