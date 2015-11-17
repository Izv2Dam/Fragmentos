package com.rubino.fragmentos;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marco on 17/11/2015.
 */
public class Fragmento1 extends Fragment {

    View viewFragment;
    private List<String> lista ;
    private ListView lv;
    private  ClaseAdaptador ad;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        lista = new ArrayList<>();
        lista.add("Pepe");
        lista.add("Juan");
        lista.add("Pepe");
        lista.add("Juana");
        lista.add("Juana1");
        lista.add("Juana2");
        lista.add("Juana3");
        lista.add("Juana4");
        lista.add("Juana5");
        lista.add("Juana7");
        lista.add("Juana8");
        lista.add("Juana9");
        lista.add("Juana12");
        lista.add("Juan342");
        lista.add("Juanare");

        viewFragment = inflater.inflate(R.layout.fragmento1, container, false);

        lv=(ListView)viewFragment.findViewById(R.id.lvFragmento1);

        ad = new ClaseAdaptador(getActivity(),lista);
        lv.setAdapter(ad);
        lv.setTag(lista);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), ActividadSecundaria.class);
                startActivity(i);
            }
        });


        return viewFragment;
    }
}
