package org.ejercicios;
import java.util.Scanner;
import java.util.ArrayList;

public class Catalogo {
    public ArrayList<Canciones> catalogo = new ArrayList<Canciones>();
    int opcion;

    Scanner scanner = new Scanner(System.in);

    public Catalogo() {
        System.out.println("Hola!!!! Bienvenido al catalogo de canciones :)");
        System.out.println("[1] agregar canciones :)");
        System.out.println("[2] Eliminar canciones :(");
        System.out.println("[3] Buscar por nombre :D");
        System.out.println("[4] Mostrar todas las canciones :O");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("agregar canciones");
                System.out.println("cual es el nombre de la cancion?");
                String Nombre = scanner.nextLine();
                System.out.println("cual es el autor de la cancion?");
                String autor = scanner.nextLine();
                System.out.println("cual es el identificador de la cancion?");
                int Identificador = scanner.nextInt();
                scanner.nextLine();
                Canciones cancion = new Canciones(Nombre, autor, Identificador);
                catalogo.add(cancion);
                System.out.println("la cancion ha sido agregada :)");
                break;

            case 2:
                System.out.println("Eliminar canciones");
                System.out.println("cual es el identificador de la cancion que desea eliminar?");
                int IdentificadorE = scanner.nextInt();
                scanner.nextLine(); 
                boolean borrado = false;
                for(Canciones c: catalogo){
                    if(c.getIdentificador() == IdentificadorE){
                        catalogo.remove(c);
                        borrado = true;
                        break;
                    }
                }
                if(borrado){
                    System.out.println("la cancion ha sido eliminada :(");
                } else {
                    System.out.println("no se encontro la cancion :/");
                }
                break;

            case 3:
                System.out.println("Buscar por nombre");
                System.out.println("cual es el nombre de la cancion que desea buscar?");
                String NombreB = scanner.nextLine();
                boolean encontrado = false;
                for (Canciones c : catalogo) {
                    if(c.getTitulo().equals(NombreB)) { 
                        System.out.println("la cancion ha sido encontrada :D -> " + c);
                        encontrado = true;
                    }
                }
                if(!encontrado){
                    System.out.println("no se encontro la cancion :/");
                }
                break;  

            case 4:
                System.out.println("Mostrar todas las canciones");
                for (Canciones cancionActual : catalogo) {
                    System.out.println("Titulo: " + cancionActual.getAutor() + ", Autor: " + cancionActual.getAutor() + ", Identificador: " + cancionActual.getIdentificador());
                }
                break;

            default:
                System.out.println("no conozco esa opcion :/");
                break;
        }
    }
}
