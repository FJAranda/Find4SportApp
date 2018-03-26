package find4sport.com.find4sport.ui.planing.presenters;

import java.util.List;

import find4sport.com.find4sport.pojo.Quedada;
import find4sport.com.find4sport.ui.planing.contracts.ListQuedadasContract;
import find4sport.com.find4sport.ui.planing.interactors.ListQuedadasInteractor;

/**
 * Created by Javi on 26/3/18.
 */

public class ListQuedadasPresenter implements ListQuedadasContract.Presenter, ListQuedadasContract.Interactor.onFinishLoadQuedadas{

    private ListQuedadasContract.View view;
    private ListQuedadasInteractor interactor;

    public ListQuedadasPresenter(ListQuedadasContract.View view){
        this.view = view;
        interactor = new ListQuedadasInteractor();
    }

    @Override
    public void loadQuedadas() {
        interactor.loadQuedadas(this);
    }

    @Override
    public void loadQuedadadasByDate() {
        interactor.loadQuedadasByDate(this);
    }

    @Override
    public void onSuccess(List<Quedada> quedadas) {
        view.showQuedadas(quedadas);
    }

    public void onDestroy(){
        view = null;
        interactor = null;
    }
}
