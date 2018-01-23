package find4sport.com.find4sport.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import find4sport.com.find4sport.pojo.Quedada;
import find4sport.com.find4sport.R;
import find4sport.com.find4sport.adapter.QuedadasAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link QuedadasFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link QuedadasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuedadasFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private RecyclerView rvQuedadas;
    private ArrayList<Quedada> quedadas;
    private QuedadasAdapter adapter;

    public QuedadasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuedadasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuedadasFragment newInstance(String param1, String param2) {
        QuedadasFragment fragment = new QuedadasFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
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

        inicializarDatos();
        inicializarAdapter();

        return view;
    }

    private void inicializarAdapter() {
        adapter = new QuedadasAdapter(quedadas);
        rvQuedadas.setAdapter(adapter);
    }

    private void inicializarDatos() {
        Calendar calendar = Calendar.getInstance();
        Date fecha =calendar.getTime();
        quedadas = new ArrayList<>();
        quedadas.add(new Quedada("0", "0", fecha, "Quedada 1", "10:00", "11:00"));
        quedadas.add(new Quedada("1", "0", fecha, "Quedada 2", "10:00", "11:00"));
        quedadas.add(new Quedada("2", "0", fecha, "Quedada 3", "10:00", "11:00"));
        quedadas.add(new Quedada("3", "0", fecha, "Quedada 4", "10:00", "11:00"));
        quedadas.add(new Quedada("4", "0", fecha, "Quedada 5", "10:00", "11:00"));
        quedadas.add(new Quedada("5", "0", fecha, "Quedada 6", "10:00", "11:00"));
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
}
