package br.usjt.desvweb.servicedeskcco.model;

import java.util.ArrayList;
import java.util.Date;

import static br.usjt.desvweb.servicedeskcco.model.Chamado.ABERTO;

/**
 * Created by arqdsis on 21/03/2018.
 */

public class Data {

    public static ArrayList<Chamado> buscarChamados(String chave){
        ArrayList<Chamado> lista = gerarListaChamados();
        if (chave == null || chave.length()==0){
            return lista;
        }
        ArrayList<Chamado> resultado = new ArrayList<>();

        for (Chamado chamado:lista){
            if (chamado.getFila().getNome().toUpperCase().contains(chave.toUpperCase())){
                resultado.add(chamado);
            }
        }
        return resultado;
    }

    public static ArrayList<Chamado> gerarListaChamados(){
        ArrayList<Chamado> lista = new ArrayList<>();
        ArrayList<String> nomes = nomesAPAGAR();
        Chamado chamado = new Chamado();
        Fila fila = new Fila();

        chamado.setNumero(1);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(ABERTO);
        chamado.setDescricao("Lentidão Gerenaizada");
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        fila = new Fila();
        chamado.setNumero(2);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(ABERTO);
        chamado.setDescricao("VENDENDO MERCADORIA");
        fila.setId(FilaId.VENDAS.id());
        fila.setNome(FilaId.VENDAS.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        fila = new Fila();
        chamado.setNumero(3);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(ABERTO);
        chamado.setDescricao("Realizando a manutenção do ERP");
        fila.setId(FilaId.ERP.id());
        fila.setNome(FilaId.ERP.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        fila = new Fila();
        chamado.setNumero(4);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(ABERTO);
        chamado.setDescricao("SUPER LENTO ESSE SERVIDOR");
        fila.setId(FilaId.SERVIDORES.id());
        fila.setNome(FilaId.SERVIDORES.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        fila = new Fila();
        chamado.setNumero(5);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(ABERTO);
        chamado.setDescricao("REDE É LENTA DEMAIS");
        fila.setId(FilaId.REDES.id());
        fila.setNome(FilaId.REDES.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        fila = new Fila();
        chamado.setNumero(6);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(ABERTO);
        chamado.setDescricao("TELEFONE NÃO FUNCIONA");
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        fila = new Fila();
        chamado.setNumero(7);
        chamado.setDataAbertura(new Date());
        chamado.setDataFechamento(null);
        chamado.setStatus(ABERTO);
        chamado.setDescricao("ODEIO DESKTOP");
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        chamado.setFila(fila);
        lista.add(chamado);
        return lista;
    }

    private static ArrayList<String> nomesAPAGAR(){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Desktops: Computador da secretária quebrado.");
        nomes.add("Telefonia: Telefone não funciona.");
        nomes.add("Redes: Manutenção no proxy.");
        nomes.add("Servidores: Lentidão generalizada.");
        nomes.add("Novos Projetos: CRM");
        nomes.add("Manutenção Sistema ERP: atualizar versão.");
        nomes.add("Novos Projetos: Rede MPLS");
        nomes.add("Manutenção Sistema de Vendas: incluir pipeline.");
        nomes.add("Manutenção Sistema ERP: erro contábil");
        nomes.add("Novos Projetos: Gestão de Orçamento");
        nomes.add("Novos Projetos: Big Data");
        nomes.add("Manoel de Barros");
        nomes.add("Redes: Internet com lentidão");
        nomes.add("Novos Projetos: Chatbot");
        nomes.add("Desktops: troca de senha");
        nomes.add("Desktops: falha no Windows");
        nomes.add("Novos Projetos: ITIL V3");
        nomes.add("Telefonia: liberar celular");
        nomes.add("Telefonia: mover ramal");
        nomes.add("Redes: ponto com defeito");
        nomes.add("Novos Projetos: ferramenta EMM");
        return nomes;
    }
}
