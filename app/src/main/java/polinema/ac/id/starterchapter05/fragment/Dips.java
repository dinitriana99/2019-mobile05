package polinema.ac.id.starterchapter05.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import polinema.ac.id.starterchapter05.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dips extends Fragment {


    public Dips() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dips, container, false);
    }

}
