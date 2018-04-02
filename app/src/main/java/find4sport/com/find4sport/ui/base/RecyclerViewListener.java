package find4sport.com.find4sport.ui.base;

import android.view.View;

public interface RecyclerViewListener {

    public interface OnItemClickListener {
        void OnItemClick(View view, int position);
    }

    public interface OnItemLongClickListener {
        void OnItemLongClick(View view, int position);
    }

}
