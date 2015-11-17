package com.rubino.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by marco on 17/11/2015.
 */
public class Fragmento2 extends Fragment {

    View viewFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        viewFragment = inflater.inflate(R.layout.fragmento2, container, false);

        return viewFragment;
    }
}
