public class Canciones {
    private String titulo;
    private String autor;
    private int Calificacion;
    private int Notas;
    private int Identificador;

    public Canciones(String titulo, String autor, int calificacion, int notas, int Identificador) {
        this.titulo = titulo;
        this.autor = autor;
        this.Calificacion = calificacion;
        this.Notas = notas;
        this.Identificador = Identificador;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getCalificacion() {
        return Calificacion;
    }
    
    public int getNotas() {
        return Notas;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCalificacion(int calificacion) {
        this.Calificacion = calificacion;
    }

    public void setNotas(int notas) {
        this.Notas = notas;
    }

    public void setidentificador(int Identificador){
        this.Identificador = Identificador;
    }
       public Canciones(String nombre, String autor2, int identificador2) {
        this.titulo = nombre;
        this.autor = autor2;
        this.Identificador = identificador2;}

    }//en esta clase estan los atributos y metodos get y set de las canciones
