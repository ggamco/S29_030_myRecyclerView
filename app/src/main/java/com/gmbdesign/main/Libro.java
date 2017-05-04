package com.gmbdesign.main;

/**
 * Created by ggamboa on 4/5/17.
 */

public class Libro {

    private String autor;
    private String libro;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public Libro(String autor, String libro) {

        this.autor = autor;
        this.libro = libro;
    }
}
