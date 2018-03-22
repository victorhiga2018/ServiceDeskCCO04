package br.usjt.desvweb.servicedeskcco.model;

import java.io.Serializable;

/**
 * Created by arqdsis on 21/03/2018.
 */

public class Fila implements Serializable {
    private int id;
    private String nome;

    public Fila() {
    }

    public Fila(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
