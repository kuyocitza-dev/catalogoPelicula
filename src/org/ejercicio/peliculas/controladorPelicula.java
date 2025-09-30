package org.ejercicio.peliculas;
import java.util.ArrayList;
import java.util.Scanner;
public class controladorPelicula{
    private ArrayList<Pelicula> ListPeli;
    Pelicula obj;
    Scanner lectura = new Scanner(System.in);

    public controladorPelicula(){
    }

    public controladorPelicula(Pelicula obj){
        this.obj = obj;
        ListPeli = new ArrayList<>();
    }

    public int PedirId(){
        System.out.println("id de la pelicula: ");
        return lectura.nextInt();
    }
    public String PedirNombre(){
        System.out.println("nombre de la pelicula: ");
        return lectura.next();
    }
    public int PedirAnio(){
        System.out.println("año de lanzamiento: ");
        return lectura.nextInt();
    }
    public double PedirCalificacion(){
        System.out.println("Calificacion de la critica: ");
        return lectura.nextDouble();
    }
    public double PedirNotas(){
        System.out.println("notas de la pelicula: ");
        return lectura.nextDouble();
    }
    
    public int catalogo(){
        System.out.println("Que deceas hacer: ");
        System.out.println("1- agregar Pelicula");
        System.out.println("2- eliminar Pelicula");
        System.out.println("3- buscar por nombre");
        System.out.println("4- listar todas las peliculas");
        System.out.println("5- salir");
        return lectura.nextInt();
        
    }

    public void catalogoFuncional(){
        int opcion = 0;
        while(opcion != 5)
            switch(catalogo()){
                case 1: aniadirPelicula();
                break;
                
                case 2: EliminarPelicula();
                break;

                case 3: int pocicionPeli = BuscarPelicula();
                 if (pocicionPeli != -1){
                    System.out.println(ListPeli.get(pocicionPeli));
                }
                break;

                case 4: obj.ImprimirPelicula(ListPeli);
                break;

                case 5: opcion = 5;
                break;
            }
    }

    public void aniadirPelicula(){
        obj = new Pelicula(PedirNombre(), PedirAnio(), PedirCalificacion(), PedirNotas());
        ListPeli.add(obj);
    }

    public int BuscarPelicula(){
        String tituloAbuscar = PedirNombre();
        for(int i = 0;  i<ListPeli.size(); i++){
            if(tituloAbuscar.equals(ListPeli.get(i).getNombre())){
                return i;
            } 
        }
        return -1;
    }

    public void EliminarPelicula(){
        int PeliAeliminar = BuscarPelicula();
        if(PeliAeliminar != -1){
            ListPeli.remove(PeliAeliminar);
            System.out.println("pelicula eliminada de la lista");
        }
    }






}