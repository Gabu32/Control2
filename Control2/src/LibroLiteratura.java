import java.util.ArrayList;
import java.util.Scanner;

public class LibroLiteratura extends Libro{
    private String descripcion;
    public ArrayList<LibroLiteratura> ListaLibrosLiteratura = new ArrayList<>();

    public LibroLiteratura(){

    }
    public LibroLiteratura(String titulo, String autor, int estado, String tipo, String descripcion) {
        super(titulo, autor, estado, tipo);
        this.descripcion = descripcion;
    }

    public void agregarLibro(){
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la descripcion del libro: ");
        String descripcion = input.nextLine();

        ListaLibrosLiteratura.add(new LibroLiteratura(super.getTitulo(), super.getAutor(), super.getEstado(), super.getTipo(), descripcion));
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
