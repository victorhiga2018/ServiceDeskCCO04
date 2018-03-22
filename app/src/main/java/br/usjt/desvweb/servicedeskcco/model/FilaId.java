package br.usjt.desvweb.servicedeskcco.model;

/**
 * Created by jhonasbalsas on 21/03/18.
 */

public enum FilaId {
    PROJETO(1, "Novos Projetos"),
    VENDAS(2, "Manutenção de Sistema de Vendas"),
    ERP(3, "Manutenção Sistema ERP"),
    SERVIDORES(4, "Servidores"),
    REDES(5, "Redes"),
    TELEFONIA(6, "Telefonia"),
    DESKTOPS(7, "Desktops");

    private final int id;
    private final String nome;
    FilaId(int i, String s){
        id = i;
        nome = s;
    }

    public int id() {
        return id;
    }

    public String nome() {
        return nome;
    }
}
