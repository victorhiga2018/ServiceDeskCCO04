package br.usjt.desvweb.servicedeskcco.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.usjt.desvweb.servicedeskcco.R;
import br.usjt.desvweb.servicedeskcco.model.Chamado;
import br.usjt.desvweb.servicedeskcco.model.ChamadoAdapter;
import br.usjt.desvweb.servicedeskcco.model.Data;
import br.usjt.desvweb.servicedeskcco.model.Fila;

public class ListarChamadosActivity extends Activity {
    public static final String CHAMADO = "br.usjt.desvweb.servicedeskcco";
    ArrayList<Chamado> chamados;
    ListView listView;
    Activity contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_chamados);
        Intent intent = getIntent();
        String nomeFila = intent.getStringExtra(MainActivity.FILA);
        chamados = Data.buscarChamados(nomeFila);

        listView = findViewById(R.id.lista_chamados);
        ChamadoAdapter adapter = new ChamadoAdapter(this, chamados);
        listView.setAdapter(adapter);

        contexto = this;
        listView.setOnItemClickListener(
            new AdapterView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Chamado chamado = chamados.get(position);
                    Intent intent = new Intent(contexto, DetalheChamadoActivity.class);
                    intent.putExtra(CHAMADO, chamado);
                    startActivity(intent);
                }
            }
        );
    }
}
