package br.usjt.desvweb.servicedeskcco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarChamadosActivity extends Activity {
    public static final String CHAMADO = "br.usjt.desvweb.servicedeskcco";
    ArrayList<String> chamados;
    ListView listView;
    Activity contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_chamados);
        Intent intent = getIntent();
        String nomeFila = intent.getStringExtra(MainActivity.FILA);
        chamados = buscarChamados(nomeFila);

        listView = findViewById(R.id.lista_chamados);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, chamados);
        listView.setAdapter(adapter);

        contexto = this;
        listView.setOnItemClickListener(
            new AdapterView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    String chamado = chamados.get(position);
                    Intent intent = new Intent(contexto, DetalheChamadoActivity.class);
                    intent.putExtra(CHAMADO, chamado);
                    startActivity(intent);
                }
            }
        );
    }

    private ArrayList<String> buscarChamados(String chave){
        ArrayList<String> lista = gerarListaChamados();
        if(chave == null || chave.length() == 0) return lista;
        ArrayList<String> resultado = new ArrayList<>();

        for(String chamado: lista){
            if(chamado.toUpperCase().contains(chave.toUpperCase())){
                resultado.add(chamado);
            }
        }
        return resultado;
    }
    private ArrayList<String> gerarListaChamados(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Desktops: Computador da secretária quebrado.");
        lista.add("Telefonia: Telefone não funciona.");
        lista.add("Redes: Manutenção no proxy.");
        lista.add("Servidores: Lentidão generalizada.");
        lista.add("Novos Projetos: CRM");
        lista.add("Manutenção Sistema ERP: atualizar versão.");
        lista.add("Novos Projetos: Rede MPLS");
        lista.add("Manutenção Sistema de Vendas: incluir pipeline.");
        lista.add("Manutenção Sistema ERP: erro contábil");
        lista.add("Novos Projetos: Gestão de Orçamento");
        lista.add("Novos Projetos: Big Data");
        lista.add("Manoel de Barros");
        lista.add("Redes: Internet com lentidão");
        lista.add("Novos Projetos: Chatbot");
        lista.add("Desktops: troca de senha");
        lista.add("Desktops: falha no Windows");
        lista.add("Novos Projetos: ITIL V3");
        lista.add("Telefonia: liberar celular");
        lista.add("Telefonia: mover ramal");
        lista.add("Redes: ponto com defeito");
        lista.add("Novos Projetos: ferramenta EMM");

        return lista;
    }
}
