package domain.entities;

import domain.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Barragem implements Subject {

    private String nome;
    private String cidade;
    private Integer contadorSismos;
    List<Sensor> observers = new ArrayList<>();

    public Barragem(String nome, String cidade, Integer contadorSismos) {
        this.nome = nome;
        this.cidade = cidade;
        this.contadorSismos = contadorSismos;
    }



    @Override
    public void registerObserver(Sensor obs) {
        observers.add(obs);

    }

    @Override
    public void removeObserver(Sensor obs) {
        observers.add(obs);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notificando !!!");
        observers.forEach(o->o.update(this.contadorSismos));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getContadorSismos() {
        return contadorSismos;
    }

    public void setContadorSismos(Integer contadorSismos) {
        this.contadorSismos = contadorSismos;
    }
}
