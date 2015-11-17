package com.rubino.fragmentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ActividadPrincipal extends AppCompatActivity {

    public static final String TAG = "FRAGMENTOS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad1);//contiene 1 o 2 fragmentos

    }
}
