package find4sport.com.find4sport.ui.planing.contracts;

import java.util.List;

import find4sport.com.find4sport.data.model.Quedada;

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

        void getQuedada(String idQuedada);
        void clearQuedadas();
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
