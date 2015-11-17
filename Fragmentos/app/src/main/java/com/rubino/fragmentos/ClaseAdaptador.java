package com.rubino.fragmentos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ClaseAdaptador extends ArrayAdapter<String>{


    private Context ctx;
    private LayoutInflater lInflator;
    private List<String> valores;

    static class ViewHolder {
        public TextView tv1, tv2;
    }

    public ClaseAdaptador(Context context, List<String> objects) {
        super(context, R.layout.item, objects);
        this.ctx = context;//actividad
        this.valores = objects;//lista de valores
        this.lInflator = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder gv = new ViewHolder();
        if(convertView==null){
            convertView = lInflator.inflate(R.layout.item, null);
            TextView tv = (TextView) convertView.findViewById(R.id.tv1Detalle);
            gv.tv1 = tv;
            tv= (TextView) convertView.findViewById(R.id.tv2Detalle);
            gv.tv2 = tv;
            convertView.setTag(gv);
        } else {
            gv = (ViewHolder) convertView.getTag();
        }
        gv.tv1.setText(valores.get(position));
        gv.tv2.setText("lo otro " + valores.get(position));
        return convertView;
    }

}