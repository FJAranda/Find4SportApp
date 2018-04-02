package find4sport.com.find4sport.ui.planing;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import find4sport.com.find4sport.pojo.Quedada;
import find4sport.com.find4sport.R;
import find4sport.com.find4sport.adapter.QuedadasAdapter;
import find4sport.com.find4sport.ui.base.RecyclerViewListener;
import find4sport.com.find4sport.ui.planing.contracts.ListQuedadasContract;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link QuedadasFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link QuedadasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuedadasFragment extends Fragment implements ListQuedadasContract.View{

    public static final String TAG = "listquedadas";


    private RecyclerView rvQuedadas;
    private ArrayList<Quedada> quedadas;

    private QuedadasAdapter adapter;
    private ListQuedadasContract.Presenter presenter;
    private OnFragmentInteractionListener mListener;

    public QuedadasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment.
     * @return A new instance of fragment QuedadasFragment.
     */
    public static QuedadasFragment newInstance() {
        QuedadasFragment fragment = new QuedadasFragment();
        Bundle args = new Bundle();
        if (args != null){
            fragment.setArguments(args);
        }
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quedadas, container, false);

        rvQuedadas = (RecyclerView)view.findViewById(R.id.rvQuedadas);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvQuedadas.setLayoutManager(linearLayoutManager);

        // TODO: 21/3/18 Implementar interactor para cargar los datos de repository

        inicializarAdapter();

        return view;
    }

    private void inicializarAdapter() {
        adapter = new QuedadasAdapter(new ArrayList<Quedada>());
        rvQuedadas.setAdapter(adapter);
        adapter.setOnItemClickListener(new RecyclerViewListener.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                presenter.getQuedada(adapter.getItem(position).getIdQuedada());
            }
        });
    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void showQuedadas(List<Quedada> quedadas) {
        adapter.loadData(quedadas);
    }




    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    // TODO: 21/3/18 salir de la quedada 
}
