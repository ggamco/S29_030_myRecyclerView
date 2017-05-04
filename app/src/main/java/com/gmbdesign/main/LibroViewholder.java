package com.gmbdesign.main;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ggamboa on 4/5/17.
 */

public class LibroViewholder extends RecyclerView.ViewHolder{

    private TextView caja_autor;
    private TextView caja_libro;

    public LibroViewholder(View itemView) {
        super(itemView);

        //TODO setear atributos
        caja_autor = (TextView) itemView.findViewById(R.id.autor);
        caja_libro = (TextView) itemView.findViewById(R.id.titulo);
    }

    public void cargarLibroEnHolder(Libro libro){
        this.caja_libro.setText(libro.getLibro());
        this.caja_autor.setText(libro.getAutor());
    }
}
