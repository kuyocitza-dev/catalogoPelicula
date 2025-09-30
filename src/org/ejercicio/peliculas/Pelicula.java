package org.ejercicio.peliculas;
import java.util.ArrayList;
public class Pelicula{
    private int id;
    private String nombre;
    private int anio;
    private double calificacion;
    private double notas;

    public Pelicula(){}

    public Pelicula(int id, String nombre, int anio, double calificacion, double notas){
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.calificacion = calificacion;
        this.notas = notas;
    }
    public Pelicula(String nombre, int anio, double calificacion, double notas){
        this.id = 35;//24216884
        this.nombre = nombre;
        this.anio = anio;
        this.calificacion = calificacion;
        this.notas = notas;
    }

    public int getID(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getAnio(){
        return anio;
    }
    public double getCalificaciones(){
        return calificacion;
    }
    public double getNotas(){
        return notas;
    }


    public void setID(int id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setCalificaciones(double calificacion){
        this.calificacion = calificacion;
    }
    public void setNotas(double notas){
        this.notas = notas;
    }
    
    public void ImprimirPelicula(ArrayList<Pelicula>ListPeli){
        ListPeli.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id= " + id +
                ", nombre='" + nombre + '\'' +
                ", año=" + anio +
                ", calificacion=" + calificacion +
                ", notas=" + notas +
                '}';
    }
    
}