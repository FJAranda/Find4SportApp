package find4sport.com.find4sport.ui.planing.contracts;

import java.util.List;
import java.util.Queue;

import find4sport.com.find4sport.pojo.Quedada;

/**
 * Created by Javi on 26/3/18.
 */

public interface ListQuedadasContract {
    interface View{
        void showQuedadas(List<Quedada> quedadas);
    }

    interface Presenter{
        void loadQuedadas();
        void loadQuedadadasByDate();
    }

    interface Interactor{
        void loadQuedadas(onFinishLoadQuedadas onFinishLoadQuedadas);
        void loadQuedadasByDate(onFinishLoadQuedadas onFinishLoadQuedadas);
        Quedada getQuedada(int position);

        interface onFinishLoadQuedadas{
            void onSuccess(List<Quedada> quedadas);
        }
    }
}
