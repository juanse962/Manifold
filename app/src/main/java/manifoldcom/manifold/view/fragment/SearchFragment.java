package manifoldcom.manifold.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import java.util.ArrayList;

import manifoldcom.manifold.R;
import manifoldcom.manifold.adapter.PictureAdapterRecyclerView;
import manifoldcom.manifold.model.Picture;

/**
 * Created by juangomez on 9/23/17.
 */

public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        SearchView searchView = (SearchView) view.findViewById(R.id.search_view);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.search_result);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),
                2, GridLayout.VERTICAL, false);

        picturesRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPictures(),
                        R.layout.cardview_search, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }


    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://www.frsn.utn.edu.ar/gie/superficies/images/Ejemplo2Par.PNG", "Paraboloide hiperbolico", "4 días", "3 Me Gusta"));
        pictures.add(new Picture("http://hostel.ufabc.edu.br/~daniel.miranda/wp-content/uploads/ga.png", "Hiperboloide de un manto", "3 días", "10 Me Gusta"));
        pictures.add(new Picture("http://tecdigital.tec.ac.cr/revistamatematica//cursos-linea/SUPERIOR/t2-Funciones-de-variasvariables/6-superficiescuadraticas/images/fig2-paraboloide.jpg", "Paraboloide eliptico", "2 días", "9 Me Gusta"));
        return pictures;
    }
}
