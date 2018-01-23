package find4sport.com.find4sport.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import find4sport.com.find4sport.pojo.Quedada;
import find4sport.com.find4sport.R;

/**
 * Created by el_ja on 19/01/2018.
 */

public class QuedadasAdapter extends RecyclerView.Adapter<QuedadasAdapter.ViewHolder> {
    private ArrayList<Quedada> quedadas;

    public QuedadasAdapter(ArrayList<Quedada> quedadas) {
        this.quedadas = quedadas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quedada, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Quedada quedada = quedadas.get(position);
        holder.bindQuedada(quedada);
    }

    @Override
    public int getItemCount() {
        return quedadas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivQuedada;
        private TextView tvNombre;
        private TextView tvFecha;

        public ViewHolder(View itemView) {
            super(itemView);
            ivQuedada = itemView.findViewById(R.id.ivItemQuedada);
            tvNombre = itemView.findViewById(R.id.tvTituloItemQuedada);
            tvFecha = itemView.findViewById(R.id.tvFechaItemQuedada);
        }

        public void bindQuedada(Quedada quedada){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ivQuedada.setImageResource(R.drawable.logo);
            tvNombre.setText(quedada.getNombre());
            tvFecha.setText(simpleDateFormat.format(quedada.getFecha()));
        }
    }
}
