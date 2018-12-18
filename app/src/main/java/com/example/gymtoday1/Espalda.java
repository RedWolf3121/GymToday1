package com.example.gymtoday1;

public class Espalda {
    String nombre;
    int imgEjercicio;
    int imgFav;

    public Espalda(String nombre, int imgEjercicio, int imgFav){
        this.nombre = nombre;
        this.imgEjercicio = imgEjercicio;
        this.imgFav = imgFav;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImgEjercicio() {
        return imgEjercicio;
    }

    public void setImgEjercicio(int imgEjercicio) {
        this.imgEjercicio = imgEjercicio;
    }

    public int getImgFav() {
        return imgFav;
    }

    public void setImgFav(int imgFav) {
        this.imgFav = imgFav;
    }
}