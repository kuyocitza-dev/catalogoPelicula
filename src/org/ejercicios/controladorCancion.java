import java.util.Scanner;

public class controladorCancion {
    Scanner scanner = new Scanner(System.in);

   public String IngresaTtitulo(){
       System.out.println("Ingrese el titulo de la cancion");
       String titulo;
       return titulo = scanner.nextLine();
   }
    public String IngresaAutor(){
         System.out.println("Ingrese el autor de la cancion");
         String autor;
         return autor = scanner.nextLine();
    }
    public int IngresaCalificacion(){
         System.out.println("Ingrese la calificacion de la cancion");
         int calificacion;
         return calificacion = scanner.nextInt();
    }
}//esta clase es la encargada de manejar la entrada de datospara las canciones