package find4sport.com.find4sport.ui.base;

import android.os.Debug;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public abstract class BaseRecyclerViewAdapter<ViewHolder extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

private RecyclerViewListener.OnItemClickListener itemClickListener;
private RecyclerViewListener.OnItemLongClickListener itemLongClickListener;

public void setOnItemClickListener(RecyclerViewListener.OnItemClickListener itemClickListener){
    this.itemClickListener = itemClickListener;
}

public void setOnItemLongClickListener(RecyclerViewListener.OnItemLongClickListener onItemLongClickListener){
    this.itemLongClickListener = itemLongClickListener;
}

public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i){
    if (itemClickListener != null){
        viewHolder.itemView.setOnClickListener(
                //view -> itemClickListener.OnItemClick(view, i)
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("BaseRecyclerClick", v.toString() + ", posicion: " + i);
                        itemClickListener.OnItemClick(v, i);
                    }
                });
    }

    if (itemLongClickListener != null) {
        viewHolder.itemView.setOnLongClickListener(
                //view -> {itemLongClickListener.OnItemLongClick(view, i); return true;}
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        Log.d("BaseRecyclerLongClick", v.toString() + ", posicion: " + i);
                        itemLongClickListener.OnItemLongClick(v, i);
                        return true;
                    }
                }
        );
    }
}

}
