package com.thepanas.CineAdmin;

public class Pelicula {

    private String titulo;
    private String genero;
    private String duracion;
    private String clasificacion;
    private String afiche;
    private String tipo;

    String[] datos = {titulo, genero, duracion, clasificacion, tipo};

    public Pelicula(String[] datos) {

    }

    Pelicula(){

    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //--------------------------------------------------------------------
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    //--------------------------------------------------------------------
    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    //--------------------------------------------------------------------
    public String getAfice() {
        return afiche;
    }
    public void setAfiche(String afiche) {
        this.afiche = afiche;
    }
    //--------------------------------------------------------------------
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    //--------------------------------------------------------------------
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //--------------------------------------------------------------------
    public String[] getDatos() {
        return datos;
    }
    public void setDatos(String[] datos) {
        this.datos = datos;
    }
}