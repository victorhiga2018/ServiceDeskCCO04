package br.usjt.desvweb.servicedeskcco.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import br.usjt.desvweb.servicedeskcco.R;

/**
 * Created by jhonasbalsas on 21/03/18.
 */

public class ChamadoAdapter extends BaseAdapter{

    private Context context;
    private ArrayList<Chamado> chamados;

    public ChamadoAdapter(Context context, ArrayList<Chamado> chamados){
        this.context = context;
        this.chamados = chamados;
    }

    @Override
    public int getCount() {
        return chamados.size();
    }

    @Override
    public Object getItem(int i) {
        return chamados.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View converView, ViewGroup parent) {
        View view = null;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.linha_chamado, parent, false);

        ImageView imagem = (ImageView)view.findViewById(R.id.imagem_fila);
        TextView numero = (TextView)view.findViewById(R.id.numero_status_chamado);
        TextView datas = (TextView)view.findViewById(R.id.abertura_fechamento_chamado);
        TextView descricao = (TextView)view.findViewById(R.id.descricao_chamado);
        Chamado chamado = chamados.get(i);

        numero.setText(String.format("numero: %d - status %s", chamado.getNumero(), chamado.getStatus()));
        datas.setText(String.format("abertura: %tD - fechamento: %tD", chamado.getDataAbertura(), chamado.getDataFechamento()));
        descricao.setText(chamado.getDescricao());
        return view;
    }
}
