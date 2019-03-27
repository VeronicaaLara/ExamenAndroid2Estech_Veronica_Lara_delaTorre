package com.example.examen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EnemigoAdapter extends ArrayAdapter<Enemigo> {
    Context context;
    List<Enemigo> enemigos;

    public EnemigoAdapter(Context context, List<Enemigo> enemigos) {
        super(context, 0, enemigos);
        this.context = context;
        this.enemigos = enemigos;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (null == convertView) {
            convertView = inflater.inflate(
                    R.layout.lista_enemigos,
                    parent,
                    false);
        }
        TextView nombre = convertView.findViewById(R.id.nombre);
        TextView edad = convertView.findViewById(R.id.edad);
        TextView ofensa = convertView.findViewById(R.id.ofensa);

        Enemigo enemigo = getItem(position);


       nombre.setText(enemigo.getNombre());
        edad.setText(enemigo.getEdad());
        ofensa.setText(enemigo.getOfensa());

        return convertView;
    }

}
