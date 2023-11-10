import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LibroAcademico extends Libro{
    private Date fechaPublicacion;
    public ArrayList<LibroAcademico> ListaLibrosAcademicos = new ArrayList<>();

    public LibroAcademico(){

    }
    public LibroAcademico(String titulo, String autor, int estado, String tipo, Date fechaPublicacion) {
        super(titulo, autor, estado, tipo);
        this.fechaPublicacion = fechaPublicacion;
    }

    public void agregarLibro(){
        Scanner input = new Scanner(System.in);

        String fecha = input.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.fechaPublicacion = formato.parse(fecha);
        }catch (ParseException e){
            System.out.println("Error al convertir fecha. Formato incorrecto");
        }

        ListaLibrosAcademicos.add(new LibroAcademico(super.getTitulo(), super.getAutor(), super.getEstado(), super.getTipo(), this.fechaPublicacion));
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
