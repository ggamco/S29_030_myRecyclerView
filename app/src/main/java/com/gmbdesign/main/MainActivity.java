package com.gmbdesign.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Libro> listaLibros;
    private AdapterLibros adapterLibros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creo libros
        listaLibros = cargarLibros();
        adapterLibros = new AdapterLibros(listaLibros);

        recyclerView = (RecyclerView) findViewById(R.id.recview);
        recyclerView.setAdapter(adapterLibros);


        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(llm);


        /*
        GridLayoutManager glm = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(glm);
        */

        //StaggeredGridLayoutManager

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    private List<Libro> cargarLibros(){

        List<Libro> libros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            Libro libro = new Libro("Autor " + i, "Libro " + i);
            libros.add(libro);

        }

        return libros;

    }

    public void add(View v){
        Libro libro = new Libro("CICE", "BELEIVER");
        listaLibros.add(0, libro);

        adapterLibros.notifyItemInserted(0);
    }

    public void delete(View v){

        if (listaLibros.size() > 0) {
            listaLibros.remove(0);
            adapterLibros.notifyItemRemoved(0);
        } else {
            Toast toast = Toast.makeText(this, "No quedan cosas que borrar", Toast.LENGTH_LONG);
            toast.show();
        }
    }

}
