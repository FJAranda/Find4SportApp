package find4sport.com.find4sport.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import find4sport.com.find4sport.pojo.Quedada;
import find4sport.com.find4sport.R;
import find4sport.com.find4sport.ui.base.BaseRecyclerViewAdapter;

/**
 * Created by el_ja on 19/01/2018.
 */

public class QuedadasAdapter extends BaseRecyclerViewAdapter<QuedadasAdapter.QuedadasViewHolder> {

    public class QuedadasViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivQuedada;
        private TextView tvNombre;
        private TextView tvFecha;
        private TextView tvHora;
        private TextView tvParticipantes;

        public QuedadasViewHolder(View itemView) {
            super(itemView);
            ivQuedada = itemView.findViewById(R.id.ivItemQuedada);
            tvNombre = itemView.findViewById(R.id.tvTituloItemQuedada);
            tvFecha = itemView.findViewById(R.id.tvFechaItemQuedada);
            tvHora = itemView.findViewById(R.id.tvHoraItemQuedada);
            tvParticipantes = itemView.findViewById(R.id.tvParticipantesItemQuedada);
        }
    }

    private ArrayList<Quedada> quedadas;

    public QuedadasAdapter(ArrayList<Quedada> quedadas) {
        this.quedadas = quedadas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quedada_card, parent, false);
        return new QuedadasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        super.onBindViewHolder(viewHolder, i);
        QuedadasViewHolder vh = (QuedadasViewHolder)viewHolder;
        Quedada quedada = quedadas.get(i);
        vh.tvNombre.setText(quedada.getNombre());
        // TODO: 2/04/18 Dar formato a la fecha.
        vh.tvFecha.setText(quedada.getFecha().toString());
        vh.tvHora.setText(quedada.getHoraInicio());
        vh.tvParticipantes.setText("5");//quedada.getNumeroParticipantes());
        // TODO: 2/04/18 Hacer Imagenes de deportes y metodo que las asigne.
        vh.ivQuedada.setImageResource(R.mipmap.ic_pingpong);
    }

    @Override
    public int getItemCount() {
        return quedadas.size();
    }

    public void loadData(List<Quedada> quedadas){
        this.quedadas.clear();
        this.quedadas.addAll(quedadas);
        notifyDataSetChanged();
    }

    public Quedada getItem(int position){
        if (position < 0 || position > quedadas.size()){
            throw new InvalidParameterException("Posicion de la lista no existe");
        }
        return quedadas.get(position);
    }

    public void clearData(){
        quedadas.clear();
        notifyDataSetChanged();
    }

}
