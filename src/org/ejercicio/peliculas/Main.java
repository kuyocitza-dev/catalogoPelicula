package org.ejercicio.peliculas;
public class Main{
    public static void main(String[] args){
        Pelicula peli = new Pelicula();
        controladorPelicula obj = new controladorPelicula(peli);
        obj.catalogoFuncional();
    }
}