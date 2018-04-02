package find4sport.com.find4sport.ui.planing.interactors;

import find4sport.com.find4sport.pojo.Quedada;
import find4sport.com.find4sport.repository.QuedadaRepository;
import find4sport.com.find4sport.ui.planing.contracts.ListQuedadasContract;

/**
 * Created by Javi on 26/3/18.
 */

public class ListQuedadasInteractor implements ListQuedadasContract.Interactor {
    @Override
    public void loadQuedadas(onFinishLoadQuedadas onFinishLoadQuedadas) {
        onFinishLoadQuedadas.onSuccess(QuedadaRepository.getInstance().getQuedadas());
    }

    @Override
    public void loadQuedadasByDate(onFinishLoadQuedadas onFinishLoadQuedadas) {
        onFinishLoadQuedadas.onSuccess(QuedadaRepository.getInstance().getQuedadasOrderByDate());
    }

    @Override
    public Quedada getQuedada(int position) {
        return QuedadaRepository.getInstance().getQuedadaAtPosition(position);
    }
}
