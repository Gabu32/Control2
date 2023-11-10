import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int estado;
    private String tipo;
    private Scanner input = new Scanner(System.in);

    public Libro(){
    }
    public Libro(String titulo, String autor, int estado, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.tipo = tipo;
    }

    public void agregarLibro(){
        System.out.print("Introduzca titulo libro: ");
        String titulo = input.nextLine();
        System.out.print("Introduzca autor libro: ");
        String autor = input.nextLine();
        System.out.print("Introduzca estado del libro (1: libre, 2: reservado, 3: prestamo): ");
        int estado = input.nextInt();
        System.out.print("Introduzca el tipo de libro: ");
        String tipo = input.next();
        input.nextLine();

        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setEstado(estado);
        this.setTipo(tipo);
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
