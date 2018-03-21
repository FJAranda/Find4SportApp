package find4sport.com.find4sport.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

    public interface RecyclerClickListener {
        void onItemCLick(Quedada quedada);
    }

    private ArrayList<Quedada> quedadas;
    private RecyclerClickListener recyclerClickListener;

    public QuedadasAdapter(ArrayList<Quedada> quedadas, RecyclerClickListener recyclerClickListener) {
        this.quedadas = quedadas;
        this.recyclerClickListener = recyclerClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quedada_card, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Quedada quedada = quedadas.get(position);
        holder.bindQuedada(quedada, recyclerClickListener);
    }

    @Override
    public int getItemCount() {
        return quedadas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivQuedada;
        private TextView tvNombre;
        private TextView tvFecha;
        private TextView tvHora;
        private TextView tvParticipantes;

        public ViewHolder(View itemView) {
            super(itemView);
            ivQuedada = itemView.findViewById(R.id.ivItemQuedada);
            tvNombre = itemView.findViewById(R.id.tvTituloItemQuedada);
            tvFecha = itemView.findViewById(R.id.tvFechaItemQuedada);
            tvHora = itemView.findViewById(R.id.tvHoraItemQuedada);
            tvParticipantes = itemView.findViewById(R.id.tvParticipantesItemQuedada);
        }

        public void bindQuedada(final Quedada quedada, final RecyclerClickListener listener){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ivQuedada.setImageResource(R.drawable.logo);
            tvNombre.setText(quedada.getNombre());
            tvFecha.setText(simpleDateFormat.format(quedada.getFecha()));
            tvHora.setText(quedada.getHoraInicio());
            // TODO: 21/3/18 Cambiar numero participantes por lugar
            tvParticipantes.setText(String.valueOf(quedada.getNumeroParticipantes()));
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemCLick(quedada);
                }
            });
        }
    }


}
