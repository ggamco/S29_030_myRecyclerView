package com.gmbdesign.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ggamboa on 4/5/17.
 */

public class AdapterLibros extends RecyclerView.Adapter<LibroViewholder> {

    private List<Libro> listaLibros;

    public AdapterLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     * Se invoca cuando se crea
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public LibroViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        LibroViewholder libroViewholder = null;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View viewItem = inflater.inflate(R.layout.layout_libro_item, parent, false);

        libroViewholder = new LibroViewholder(viewItem);

        return libroViewholder;
    }

    /**
     * se invoca cuando se utiliza
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(LibroViewholder holder, int position) {

        Libro libro = listaLibros.get(position);
        holder.cargarLibroEnHolder(libro);

    }

    /**
     * recupera el numero de objetos
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return listaLibros.size();
    }
}
