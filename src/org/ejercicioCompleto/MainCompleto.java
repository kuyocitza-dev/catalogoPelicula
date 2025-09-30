package org.ejercicioCompleto;
import org.ejercicio.peliculas.Pelicula;
import org.ejercicio.peliculas.controladorPelicula;
import org.ejercicios.Catalogo;
import org.ejercicios.controladorCancion;

import java.util.Scanner;



public class MainCompleto{
    public static void main(String[] args){
        menuFuncional();
    }

    public static int menu(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Opción1- Gestionar catalogo de peliculas");
        System.out.println("opcion2- Gestionar catalogo de canciones");
        System.out.println("opcion0- salir");
        System.out.println("opcion: ");
        return lectura.nextInt();
    }

    public static void menuFuncional(){
        int opcion = 3;
        while(opcion != 0){
            opcion = menu();
            switch (opcion) {
                case 1: Pelicula pelicula = new Pelicula();
                        controladorPelicula obj = new controladorPelicula(pelicula);
                        obj.catalogoFuncional();
                break;
            
                case 2: Catalogo catalogo = new Catalogo();
                       controladorCancion controlador = new controladorCancion();
                break;

                case 0: opcion = 0;
                break;
            }
        }
    }

}
